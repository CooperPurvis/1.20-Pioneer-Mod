package io.github.cooperpurvis.pioneermod.init;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    //item deferred registry
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PioneerMod.MODID);
    //items
    public static final RegistryObject<Item> COTTON = ITEMS.register("cotton", () -> new Item(new Item.Properties().tab(PioneerMod.TAB)));
    //food register
    public static final RegistryObject<Item> BAKED_BEANS = ITEMS.register("baked_beans", () -> new Item(new Item.Properties().tab(PioneerMod.TAB).food(Foods.BAKED_BEANS)));
    public static final RegistryObject<Item> RAW_BEANS = ITEMS.register("raw_beans", () -> new Item(new Item.Properties().tab(PioneerMod.TAB).food(Foods.RAW_BEANS)));
    //tools
   // public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(null,0,0,new Item.);

    //nutrition = # of half drumsticks
    //food properties
    public static class Foods{
        public static final FoodProperties BAKED_BEANS = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f)
                .effect(()-> new MobEffectInstance(MobEffects.JUMP,200,1),0.1f) .build();
        public static final FoodProperties RAW_BEANS = new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).build();
    }
}

