package io.github.cooperpurvis.pioneermod.world.feature;

import com.google.common.base.Suppliers;
import io.github.cooperpurvis.pioneermod.PioneerMod;
import io.github.cooperpurvis.pioneermod.block.BlockInit;
import io.github.cooperpurvis.pioneermod.world.feature.tree.RedwoodFoliagePlacer;
import io.github.cooperpurvis.pioneermod.world.feature.tree.RedwoodTrunkPlacer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;

public class ConfiguredFeatureInit {
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(PioneerMod.MODID, name));
    }

    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");
//
//    private static final Supplier<List<OreConfiguration.TargetBlockState>> FOOLS_OVERWORLD_REPLACEMENT = Suppliers.memoize(()->
//            List.of(
//                    //todo ore loot tables and break speed
//                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.OVERWORLD_FOOLS_ORE.get().defaultBlockState()),
//                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_FOOLS_ORE.get().defaultBlockState()))
//    );
//
//    public static final RegistryObject<ConfiguredFeature<?,?>> FOOLS_OVERWORLD_ORE = CONFIGURED_FEATURES.register("fools_overworld_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(FOOLS_OVERWORLD_REPLACEMENT.get(),9)));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
    //redwood grower

    register(context, REDWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(BlockInit.REDWOOD_LOG.get()),
            new RedwoodTrunkPlacer(15,4,3), BlockStateProvider.simple(BlockInit.PINE_LEAVES.get()),
            new RedwoodFoliagePlacer(ConstantInt.of(3),ConstantInt.of(2), 3),
            new TwoLayersFeatureSize(1,0,2)).build());
}
//pine grower


    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}




