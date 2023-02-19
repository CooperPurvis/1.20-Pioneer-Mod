package io.github.cooperpurvis.pioneermod.init;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import io.github.cooperpurvis.pioneermod.world.feature.ConfiguredFeatureInit;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;


public class PlacedFeatureInit {
    public  static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, PioneerMod.MODID);

    public  static  final RegistryObject<PlacedFeature> FOOLS_OVERWORLD_ORE = PLACED_FEATURES.register("fools_overworld_ore",
            ()-> new PlacedFeature(ConfiguredFeatureInit.FOOLS_OVERWORLD_ORE.getHolder().get(), commonOrePlacement(9,HeightRangePlacement.triangle(
                    VerticalAnchor.aboveBottom(5),VerticalAnchor.TOP
            ))));

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height){
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }
    private  static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height){
        return  List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}
