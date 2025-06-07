package net.goldi.unicapmod.item;

import net.goldi.unicapmod.UnicapMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

public class RAScreen extends Screen {
    private static final ResourceLocation PLACEHOLDER_PHOTO_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(UnicapMod.MOD_ID, "textures/gui/mclovin_placeholder.png");


    private final Player player;
    private final String playerName;
    private final String matricula;
    private final String curso;

    private final int GUI_WIDTH = 200;
    private final int GUI_HEIGHT = 120;
    private final int PHOTO_X_OFFSET = 15;
    private final int PHOTO_Y_OFFSET = 15;
    private final int PHOTO_WIDTH = 48;
    private final int PHOTO_HEIGHT = 64;

    private final int TEXT_START_X_OFFSET_FROM_PHOTO = PHOTO_WIDTH + 10;
    private final int TEXT_Y_OFFSET = 18;

    public RAScreen(Player player) {
        super(Component.literal("R.A."));
        this.player = player;
        this.playerName = player.getGameProfile().getName();
        long playerSpecificPart = Math.abs(player.getUUID().getLeastSignificantBits() % 1000000L);
        this.matricula = "00000" + String.format("%06d", playerSpecificPart);
        this.curso = "Ciência da Computação";
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);

        int guiX = (this.width - this.GUI_WIDTH) / 2;
        int guiY = (this.height - this.GUI_HEIGHT) / 2;

        int corDeFundoCinza = 0xFFB0B0B0;
        guiGraphics.fill(guiX, guiY, guiX + this.GUI_WIDTH, guiY + this.GUI_HEIGHT, corDeFundoCinza);

        int photoActualX = guiX + PHOTO_X_OFFSET;
        int photoActualY = guiY + PHOTO_Y_OFFSET;

        try {
            guiGraphics.blit(PLACEHOLDER_PHOTO_TEXTURE, photoActualX, photoActualY, 0, 0, PHOTO_WIDTH, PHOTO_HEIGHT, PHOTO_WIDTH, PHOTO_HEIGHT);
        } catch (Exception e) {
            UnicapMod.LOGGER.error("Falha ao carregar PLACEHOLDER_PHOTO_TEXTURE: " + PLACEHOLDER_PHOTO_TEXTURE.toString(), e);
            guiGraphics.fill(photoActualX, photoActualY, photoActualX + PHOTO_WIDTH, photoActualY + PHOTO_HEIGHT, 0xFFFF0000);
            guiGraphics.drawString(this.font, "IMG ERR", photoActualX + 2, photoActualY + 2, 0xFFFFFFFF);
        }

        int textX = photoActualX + TEXT_START_X_OFFSET_FROM_PHOTO;
        int textY = guiY + TEXT_Y_OFFSET;
        int lineHeight = this.font.lineHeight + 2;
        int textColor = 0xFF000000;

        guiGraphics.drawString(this.font, "NOME:", textX, textY, textColor, false);
        textY += lineHeight;
        guiGraphics.drawString(this.font, this.playerName, textX + 5, textY, textColor, false);

        textY += lineHeight + 2;

        guiGraphics.drawString(this.font, "MATRÍCULA:", textX, textY, textColor, false);
        textY += lineHeight;
        guiGraphics.drawString(this.font, this.matricula, textX + 5, textY, textColor, false);

        textY += lineHeight + 2;

        guiGraphics.drawString(this.font, "CURSO:", textX, textY, textColor, false);
        textY += lineHeight;
        guiGraphics.drawString(this.font, this.curso, textX + 5, textY, textColor, false);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
