package io.github.cooperpurvis.pioneermod.init;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import io.github.cooperpurvis.pioneermod.base.ModArmorMaterial;
import io.github.cooperpurvis.pioneermod.block.BlockInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
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
    public static final RegistryObject<Item> CANVAS = ITEMS.register("canvas", () -> new Item(props()));
    public static final RegistryObject<Item> RAW_LEATHER = ITEMS.register("raw_leather", () -> new Item(props()));
    //food register
    public static final RegistryObject<Item> BAKED_BEANS = ITEMS.register("baked_beans", () -> new Item(props().food(Foods.BAKED_BEANS)));
    public static final RegistryObject<Item> RAW_BEANS = ITEMS.register("raw_beans", () -> new Item(props().food(Foods.RAW_BEANS)));
    public static final RegistryObject<Item> RAW_BACON = ITEMS.register("raw_bacon", () -> new Item(props().food(Foods.RAW_BACON)));
    public static final RegistryObject<Item> COOKED_BACON = ITEMS.register("cooked_bacon", () -> new Item(props().food(Foods.COOKED_BACON)));
    public static final RegistryObject<Item> RAW_CRAB = ITEMS.register("raw_crab", () -> new Item(props().food(Foods.RAW_CRAB)));
    public static final RegistryObject<Item> COOKED_CRAB = ITEMS.register("cooked_crab", () -> new Item(props().food(Foods.COOKED_CRAB)));
    public static final RegistryObject<Item> RAW_LOBSTER = ITEMS.register("raw_lobster", () -> new Item(props().food(Foods.RAW_LOBSTER)));
    public static final RegistryObject<Item> COOKED_LOBSTER = ITEMS.register("cooked_lobster", () -> new Item(props().food(Foods.COOKED_LOBSTER)));
    public static final RegistryObject<Item> RAW_RAINBOW_TROUT = ITEMS.register("raw_rainbow_trout", () -> new Item(props().food(Foods.RAW_RAINBOW_TROUT)));
    public static final RegistryObject<Item> COOKED_RAINBOW_TROUT = ITEMS.register("cooked_rainbow_trout", () -> new Item(props().food(Foods.COOKED_RAINBOW_TROUT)));
    //"potions"
    public static final RegistryObject<Item> MOONSHINE = ITEMS.register("moonshine", () -> new Item((props().stacksTo(16).food(Foods.MOONSHINE))));
    //tools
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ToolTiers.COPPER, 3, -2.5f, props()));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ToolTiers.COPPER, 1, 0, props()));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ToolTiers.COPPER, 1.5f, -3.0f, props()));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ToolTiers.COPPER, 6, -3.0f, props()));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ToolTiers.COPPER, 0, -3.0f, props()));
    //armour
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.FEET, props()));

    //adds creative mode tab
    private static Item.Properties props() {
        return new Item.Properties().tab(PioneerMod.TAB);
    }


    //nutrition = # of half drumsticks
    //food properties
    public static class Foods {
        public static final FoodProperties BAKED_BEANS = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f)
                .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 0.1f).build();
        public static final FoodProperties RAW_BEANS = new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).build();
        public static final FoodProperties RAW_BACON = new FoodProperties.Builder().nutrition(2).meat().saturationMod(0.5f).build();
        public static final FoodProperties COOKED_BACON = new FoodProperties.Builder().nutrition(6).meat().saturationMod(1.5f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 250, 0), 0.25f).build();
        //todo make it drink not eat
        public static final FoodProperties MOONSHINE = new FoodProperties.Builder().nutrition(1).saturationMod(0.2f)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 700, 1), 0.33f)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 500, 1), 0.15f).build();
        public static final FoodProperties RAW_CRAB = new FoodProperties.Builder().nutrition(2).meat().saturationMod(0.5f).build();
        public static final FoodProperties COOKED_CRAB = new FoodProperties.Builder().nutrition(5).meat().saturationMod(1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0), 1.0f).build();
        public static final FoodProperties RAW_LOBSTER = new FoodProperties.Builder().nutrition(2).meat().saturationMod(0.5f).build();
        public static final FoodProperties COOKED_LOBSTER = new FoodProperties.Builder().nutrition(5).meat().saturationMod(1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 600, 0), 1.0f).build();
        public static final FoodProperties RAW_RAINBOW_TROUT = new FoodProperties.Builder().nutrition(2).meat().saturationMod(0.5f).build();
        public static final FoodProperties COOKED_RAINBOW_TROUT = new FoodProperties.Builder().nutrition(5).meat().saturationMod(1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 1), 1.0f).build();
    }
//TODO fix pickaxes
        public static class ToolTiers {
            public static final Tier COPPER = new ForgeTier(1, 200, 6.5f, 0.5f, 17, BlockInit.Tags.NEEDS_COPPER_TOOL,
                    () -> Ingredient.of(Items.COPPER_INGOT));
        }

        public static class ArmorTiers {
            public static final ArmorMaterial COPPER = new ModArmorMaterial("copper", 33, new int[]{1, 3, 5, 2},
                    17, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(Items.COPPER_INGOT));
        }
    }

