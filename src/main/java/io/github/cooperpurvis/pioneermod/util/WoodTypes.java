package io.github.cooperpurvis.pioneermod.util;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WoodTypes {
    public static final WoodType REDWOOD = WoodType.register(new WoodType(PioneerMod.MODID + ":redwood", BlockSetType.OAK));
}