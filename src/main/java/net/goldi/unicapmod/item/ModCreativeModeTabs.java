package net.goldi.unicapmod.item;

import net.goldi.unicapmod.UnicapMod;
import net.goldi.unicapmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UnicapMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TITANIUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("titanio_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.unicapmod.titanio_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RA_ITEM.get());
                        output.accept(ModItems.PENA.get());
                        output.accept(ModItems.TITANIO_CRU.get());
                        output.accept(ModItems.TITANIUM_INGOT.get());
                        output.accept(ModBlocks.TITANIUM_ORE.get());
                        output.accept(ModItems.TITANIUM_SWORD.get());
                        output.accept(ModItems.TITANIUM_PICKAXE.get());
                        output.accept(ModItems.TITANIUM_AXE.get());
                        output.accept(ModItems.TITANIUM_SHOVEL.get());
                        output.accept(ModItems.TITANIUM_HOE.get());
                        output.accept(ModItems.TITANIUM_HELMET.get());
                        output.accept(ModItems.TITANIUM_CHESTPLATE.get());
                        output.accept(ModItems.TITANIUM_LEGGINGS.get());
                        output.accept(ModItems.TITANIUM_BOOTS.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}