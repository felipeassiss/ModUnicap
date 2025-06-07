package net.goldi.unicapmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;


public class ModToolTiers {

    public static final Tier TITANIUM = new Tier() {
        @Override
        public int getUses() {
            // Durabilidade da ferramenta
            return 2750;
        }

        @Override
        public float getSpeed() {
            return 9.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 5.0F;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }

        @Override
        public int getEnchantmentValue() {
            return 18;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.TITANIUM_INGOT.get());
        }
    };
}
