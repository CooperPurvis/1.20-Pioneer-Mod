package io.github.cooperpurvis.pioneermod.init;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    //item deferred registry
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PioneerMod.MODID);
    //items
    public static final RegistryObject<Item> COTTON = ITEMS.register("cotton", () -> new Item(props()));
    //food register
    public static final RegistryObject<Item> BAKED_BEANS = ITEMS.register("baked_beans", () -> new Item(props().food(Foods.BAKED_BEANS)));
    public static final RegistryObject<Item> RAW_BEANS = ITEMS.register("raw_beans", () -> new Item(props().food(Foods.RAW_BEANS)));
    //tools
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(Tiers.COPPER,3,-2.5f, props()));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",() -> new PickaxeItem(Tiers.COPPER,1,0, props()));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",() -> new ShovelItem(Tiers.COPPER,1.5f,-3.0f, props()));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",() -> new AxeItem(Tiers.COPPER,6,-3.0f, props()));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",() -> new HoeItem(Tiers.COPPER,0,-3.0f, props()));

    //adds creative mode tab
    private static Item.Properties props(){
        return new Item.Properties().tab(PioneerMod.TAB);
    }


    //nutrition = # of half drumsticks
    //food properties
    public static class Foods{
        public static final FoodProperties BAKED_BEANS = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f)
                .effect(()-> new MobEffectInstance(MobEffects.JUMP,200,1),0.1f) .build();
        public static final FoodProperties RAW_BEANS = new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).build();
    }

    public static class Tiers{
        public static final Tier COPPER = new ForgeTier(1,200,6.5f,1,17,null,()-> Ingredient.of(Items.COPPER_INGOT));
    }
}

