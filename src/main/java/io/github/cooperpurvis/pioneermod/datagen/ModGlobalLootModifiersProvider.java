package io.github.cooperpurvis.pioneermod.datagen;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import io.github.cooperpurvis.pioneermod.init.ItemInit;
import io.github.cooperpurvis.pioneermod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, PioneerMod.MODID);
    }

    @Override
    protected void start() {

    }
}