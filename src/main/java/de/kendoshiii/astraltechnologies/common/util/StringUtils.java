package de.kendoshiii.astraltechnologies.common.util;

import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StringUtils {

    @SideOnly(Side.CLIENT)
    public static void drawString(FontRenderer font, int xSize, int yPositionOfMachineText, String text){
        font.drawString(text, xSize/2-font.getStringWidth(text)/2, yPositionOfMachineText, 16777215);
    }

}
