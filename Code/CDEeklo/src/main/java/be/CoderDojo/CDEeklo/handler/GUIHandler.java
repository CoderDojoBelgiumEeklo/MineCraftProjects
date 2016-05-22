package be.CoderDojo.CDEeklo.handler;

import be.CoderDojo.CDEeklo.client.gui.inventory.GUITeleporter;
import be.CoderDojo.CDEeklo.inventory.ContainerTeleporter;
import be.CoderDojo.CDEeklo.reference.GUIs;
import be.CoderDojo.CDEeklo.tileentity.TileEntityTeleporter;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class GUIHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

      if(ID== GUIs.Teleporter.ordinal()){
          TileEntityTeleporter teTelporter= (TileEntityTeleporter) world.getTileEntity(x,y,z);
          return new ContainerTeleporter(player.inventory,teTelporter);
      }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if(ID==GUIs.Teleporter.ordinal()){
            TileEntityTeleporter teTeleporter= (TileEntityTeleporter) world.getTileEntity(x,y,z);
            return new GUITeleporter(player.inventory,teTeleporter);
        }
        return null;
    }

}
