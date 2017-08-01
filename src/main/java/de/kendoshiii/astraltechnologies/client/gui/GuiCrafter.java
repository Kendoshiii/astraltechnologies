package de.kendoshiii.astraltechnologies.client.gui;

import de.kendoshiii.astraltechnologies.common.container.ContainerCrafter;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiCrafter extends GuiContainer{

	private static final ResourceLocation RES_LOC = new ResourceLocation("textures/gui/container/crafting_table.png");

    public GuiCrafter(EntityPlayer player){
        super(new ContainerCrafter(player));
        
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    public void drawGuiContainerForegroundLayer(int x, int y){
        //StringUtils.drawString(this.fontRenderer, this.xSize, -10, I18n.translateToLocal("container." + Reference.MODID + ".crafting.name"));
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float f, int x, int y){
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(RES_LOC);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
	
}
