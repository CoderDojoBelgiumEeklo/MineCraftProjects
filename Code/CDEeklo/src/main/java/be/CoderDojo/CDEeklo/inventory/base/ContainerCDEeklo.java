package be.CoderDojo.CDEeklo.inventory.base;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

/**
 * Created by Obsidean on 07/02/2016.
 */
public class ContainerCDEeklo extends Container {

    protected final int PLAYER_INVENTORY_ROWS =3;
    protected final int PLAYER_INVENTORY_COLUMNS = 9;


    @Override
    protected boolean mergeItemStack(ItemStack p_75135_1_, int p_75135_2_, int p_75135_3_, boolean p_75135_4_) {
        return super.mergeItemStack(p_75135_1_, p_75135_2_, p_75135_3_, p_75135_4_);
    }

    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return false;
    }
}
