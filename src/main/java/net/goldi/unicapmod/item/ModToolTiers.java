package net.goldi.unicapmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

// import java.util.function.Supplier; // Removido se não explicitamente necessário para a lambda

public class ModToolTiers {

    public static final Tier TITANIUM = new Tier() {
        @Override
        public int getUses() {
            // Durabilidade da ferramenta
            return 2750;
        }

        @Override
        public float getSpeed() {
            // Velocidade para quebrar dureza 56.25F no mesmo tempo que Netherita (velocidade 9.0F)
            // Isso fará com que ambas as picaretas (Netherita e Titânio) tenham o mesmo tempo de quebra
            // no Titanium Ore, que é o tempo de "obsidiana com diamante".
            return 9.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            // Bônus de dano de ataque que este tier adiciona
            return 5.0F; // Usando float, como a interface Tier espera
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            // Esta tag é usada pelo DiggerItem para determinar se a ferramenta é eficiente
            // e qual o seu "nível" implícito para quebrar blocos.
            // Retornar BlockTags.NEEDS_DIAMOND_TOOL aqui sinaliza que este tier
            // é pelo menos do nível Diamante (nível 3), o que é consistente com Netherita (nível 4).
            // O Titanium Ore está na tag NEEDS_DIAMOND_TOOL, então este tier deveria ser suficiente para drops.
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }

        @Override
        public int getEnchantmentValue() {
            // Encantabilidade da ferramenta
            return 18;
        }

        @Override
        public Ingredient getRepairIngredient() {
            // Ingrediente usado para reparar ferramentas deste tier
            return Ingredient.of(ModItems.TITANIUM_INGOT.get());
        }
    };
}