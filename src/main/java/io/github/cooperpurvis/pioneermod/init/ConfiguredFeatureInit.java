package io.github.cooperpurvis.pioneermod.init;

import com.google.common.base.Suppliers;
import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ConfiguredFeatureInit {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, PioneerMod.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> FOOLS_OVERWORLD_REPLACEMENT = Suppliers.memoize(()->
            List.of(
                    //todo sprite and replace for deepslate and replace sprite for regular
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.OVERWORLD_FOOLS_ORE.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.REDWOOD_PLANKS.get().defaultBlockState()))
    );

    public static final RegistryObject<ConfiguredFeature<?,?>> FOOLS_OVERWORLD_ORE = CONFIGURED_FEATURES.register("fools_overworld_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(FOOLS_OVERWORLD_REPLACEMENT.get(),9)));
}
