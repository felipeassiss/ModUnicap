package net.goldi.unicapmod.item;

import net.goldi.unicapmod.UnicapMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> TITANIUM_ARMOR_MATERIAL = register(
            "titanio",
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 5);
            }),
            18, // Enchantability
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0f, // Toughness
            0.1f, // Knockback Resistance
            () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())
    );

    private static Holder<ArmorMaterial> register(String name,
                                                  EnumMap<ArmorItem.Type, Integer> protectionByType,
                                                  int enchantability,
                                                  Holder<SoundEvent> equipSound,
                                                  float toughness,
                                                  float knockbackResistance,
                                                  Supplier<Ingredient> repairIngredient) {
        ResourceLocation materialName = ResourceLocation.fromNamespaceAndPath(UnicapMod.MOD_ID, name);
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(materialName)
        );
        ArmorMaterial material = new ArmorMaterial(protectionByType, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance);
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, materialName, material);
    }
}