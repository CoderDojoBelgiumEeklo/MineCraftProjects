package be.CoderDojo.CDEeklo.client.gui.inventory;

import be.CoderDojo.CDEeklo.inventory.ContainerTeleporter;
import be.CoderDojo.CDEeklo.reference.Colors;
import be.CoderDojo.CDEeklo.reference.Names;
import be.CoderDojo.CDEeklo.reference.Reference;
import be.CoderDojo.CDEeklo.reference.Textures;
import be.CoderDojo.CDEeklo.tileentity.TileEntityTeleporter;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

/**
 * Created by Obsidean on 07/02/2016.
 */
public class GUITeleporter extends GuiContainer {

    private TileEntityTeleporter teleporterValue;


    public GUITeleporter(InventoryPlayer inventoryPlayer,TileEntityTeleporter teleporter){
        super(new ContainerTeleporter(inventoryPlayer,teleporter));
        teleporterValue= teleporter;
        xSize=111;
        ySize=142;
    }



    @Override
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        //super.drawGuiContainerForegroundLayer(p_146979_1_, p_146979_2_);
        fontRendererObj.drawString(StatCollector.translateToLocal(teleporterValue.getInventoryName()), 6, 6, Integer.parseInt(Colors.PURE_WHITE, 16));
        fontRendererObj.drawString(StatCollector.translateToLocal(Names.TE.TeLocation), 6, ySize - 95 + 2, Integer.parseInt(Colors.PURE_WHITE, 16));
    }

    private ResourceLocation backgroundImage= new ResourceLocation(Textures.GUI_TELEPORTER);

    @Override
    protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {
        GL11.glColor4f(1.0F,1.0F,1.0F,1.0F);

        this.mc.getTextureManager().bindTexture(backgroundImage);
        int xStart =(width-xSize) /2;
        int yStart =(height-ySize) /2;
        this.drawTexturedModalRect(xStart, yStart,0,0,xSize,ySize);
    }
}
