package net.goldi.unicapmod.util;

import net.goldi.unicapmod.UnicapMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        // Tag para blocos que exigem o nível da ferramenta de Titânio ou superior
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL_LEVEL_OR_HIGHER =
                BlockTags.create(ResourceLocation.fromNamespaceAndPath(UnicapMod.MOD_ID, "needs_titanium_tool_level_or_higher"));
    }
}