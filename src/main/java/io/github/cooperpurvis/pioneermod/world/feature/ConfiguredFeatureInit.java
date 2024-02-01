package io.github.cooperpurvis.pioneermod.world.feature;

import com.google.common.base.Suppliers;
import io.github.cooperpurvis.pioneermod.PioneerMod;
import io.github.cooperpurvis.pioneermod.block.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
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

public class ConfiguredFeatureInit {}
//    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
//            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, PioneerMod.MODID);
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


    //redwood grower
//    public static final RegistryObject<ConfiguredFeature<?, ?>> REDWOOD =
//            CONFIGURED_FEATURES.register("redwood", () ->
//                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
//                            BlockStateProvider.simple(BlockInit.REDWOOD_LOG.get()),
//                            new GiantTrunkPlacer(10,20,7),
//                            BlockStateProvider.simple(BlockInit.REDWOOD_LEAVES.get()),
//                            //todo mess with these numbers
//                            new MegaPineFoliagePlacer(ConstantInt.of(8), ConstantInt.of(8), ConstantInt.of(8)),
//                            new TwoLayersFeatureSize(1,0,2)).build()));
//    //pine grower
//    public static final RegistryObject<ConfiguredFeature<?, ?>> PINE =
//            CONFIGURED_FEATURES.register("pine", () ->
//                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
//                            BlockStateProvider.simple(BlockInit.PINE_LOG.get()),
//                            new GiantTrunkPlacer(10,20,7),
//                            BlockStateProvider.simple(BlockInit.PINE_LEAVES.get()),
//                            //todo mess with these numbers
//                            new SpruceFoliagePlacer(ConstantInt.of(8), ConstantInt.of(8), ConstantInt.of(8)),
//                            new TwoLayersFeatureSize(1,0,2)).build()));
//}




