package io.github.cooperpurvis.pioneermod.world.feature.tree;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FoliagePlacerInit {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, PioneerMod.MODID);

    public static final RegistryObject<FoliagePlacerType<RedwoodFoliagePlacer>> REDWOOD_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("redwood_foliage_placer", () -> new FoliagePlacerType<>(RedwoodFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
