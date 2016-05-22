package be.CoderDojo.CDEeklo.inventory;

import be.CoderDojo.CDEeklo.inventory.base.ContainerCDEeklo;
import be.CoderDojo.CDEeklo.tileentity.TileEntityTeleporter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Obsidean on 07/02/2016.
 */
public class ContainerTeleporter extends ContainerCDEeklo {
    private TileEntityTeleporter teTeleporter;

    public ContainerTeleporter(InventoryPlayer inventoryplayer, TileEntityTeleporter tileEntityTeleporter){
        this.teTeleporter= tileEntityTeleporter;
        teTeleporter.openInventory();

    }


    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
          return this.teTeleporter.isUseableByPlayer(entityPlayer);
    }

    @Override
    public void onContainerClosed(EntityPlayer p_75134_1_) {
        super.onContainerClosed(p_75134_1_);
        teTeleporter.closeInventory();
    }
}
