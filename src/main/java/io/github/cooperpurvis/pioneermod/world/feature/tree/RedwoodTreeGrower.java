package io.github.cooperpurvis.pioneermod.world.feature.tree;

import io.github.cooperpurvis.pioneermod.world.feature.ConfiguredFeatureInit;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class RedwoodTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ConfiguredFeatureInit.REDWOOD_KEY;
    }
}
