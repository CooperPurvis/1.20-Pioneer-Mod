package io.github.cooperpurvis.pioneermod.base;

import io.github.cooperpurvis.pioneermod.PioneerMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public record ModArmorMaterial(String name, int durability, int[] protection, int enchantability, SoundEvent equipSound, float toughness, float knoockbackResistance, Supplier<Ingredient> repairMaterial) implements ArmorMaterial {
    private static final int[] DURABILITY_PER_SLOT = new int[] {12,14,15,10};

    public int getDurabilityForSlot(EquipmentSlot slot) {
        return DURABILITY_PER_SLOT[slot.getIndex()] * this.durability;
    }


    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.protection[slot.getIndex()];
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return this.durability;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.durability;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return PioneerMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knoockbackResistance;
    }
}
