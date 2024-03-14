package io.github.cooperpurvis.pioneermod.world.feature.tree;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, PioneerMod.MODID);

    public static final RegistryObject<TrunkPlacerType<RedwoodTrunkPlacer>> REDWOOD_TRUNK_PLACER =
            TRUNK_PLACER.register("redwood_trunk_placer", () -> new TrunkPlacerType<>(RedwoodTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}

