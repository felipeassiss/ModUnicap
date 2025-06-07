package net.goldi.unicapmod;

import com.mojang.logging.LogUtils;
import net.goldi.unicapmod.block.ModBlocks;
import net.goldi.unicapmod.datagen.*;
import net.goldi.unicapmod.item.ModCreativeModeTabs;
import net.goldi.unicapmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

@Mod(UnicapMod.MOD_ID)
public class UnicapMod {
    public static final String MOD_ID = "unicapmod";
    public static final Logger LOGGER = LogUtils.getLogger();
    private final Random random = new Random(); // Instância de Random para calcular a chance

    public UnicapMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::gatherData);

        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Código de setup comum
    }

    public void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ModBlockTagsProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, lookupProvider));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Código para quando o servidor inicia
    }

    @SubscribeEvent
    public void onChickenDrops(LivingDropsEvent event) {
        // Verifica se a entidade que morreu é uma galinha
        if (event.getEntity() instanceof Chicken) {
            // Calcula a chance de 5%
            if (random.nextFloat() < 0.05F) { // 0.05F representa 5%
                ItemStack magicFeatherDrop = new ItemStack(ModItems.PENA.get(), 1); // Pega 1 Pena

                double x = event.getEntity().getX();
                double y = event.getEntity().getY();
                double z = event.getEntity().getZ();
                event.getDrops().add(new ItemEntity(event.getEntity().level(), x, y, z, magicFeatherDrop));
            }
        }
    }
}
