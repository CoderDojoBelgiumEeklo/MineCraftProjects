package be.CoderDojo.CDEeklo.tileentity;

import be.CoderDojo.CDEeklo.init.ModBlocks;
import be.CoderDojo.CDEeklo.reference.Names;
import be.CoderDojo.CDEeklo.tileentity.base.TileEntityMB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

/**
 * Created by Obsidean on 07/02/2016.
 */
public class TileEntityTeleporter extends TileEntityMB implements IInventory {

    public int numUsingPlayers;



    public TileEntityTeleporter() {
        super();
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
        this.markDirty();
    }

    @Override
    public String getInventoryName() {
        return this.hasCustomName() ? this.getCustomName() : Names.TE.TELEPORTER;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return this.hasCustomName();
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return this.worldObj.getTileEntity(xCoord, yCoord, zCoord) == this && entityplayer.getDistanceSq((double) xCoord + 0.5D, (double) yCoord + 0.5D, (double) zCoord + 0.5D) <= 64D;
    }

    @Override
    public void openInventory() {
        ++numUsingPlayers;
        worldObj.addBlockEvent(xCoord, yCoord, zCoord, ModBlocks.teleporterBlock, 1, numUsingPlayers);
    }

    @Override
    public void closeInventory() {
        --numUsingPlayers;
        worldObj.addBlockEvent(xCoord, yCoord, zCoord, ModBlocks.teleporterBlock, 1, numUsingPlayers);
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    @Override
    public boolean hasCustomName() {
        return super.hasCustomName();
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {
        super.readFromNBT(nbtTagCompound);

        //NBTTagList tagList = nbtTagCompound.getTagList(Names.NBT.BUILDERACTIVE,1);

        //Started = nbtTagCompound.getBoolean(Names.NBT.BUILDERACTIVE);

        //nbtTagCompound.getTagList(tagname , tag type);
        NBTTagList tagList = nbtTagCompound.getTagList(Names.NBT.ITEMS, 10);


    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {
        super.writeToNBT(nbtTagCompound);

        //nbtTagCompound.setBoolean(Names.NBT.BUILDERACTIVE,Started);
        NBTTagList taglist = new NBTTagList();


        nbtTagCompound.setTag(Names.NBT.ITEMS, taglist);
    }

    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound var1 = new NBTTagCompound();
        this.writeToNBT(var1);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, var1);
    }

    @Override
    public boolean receiveClientEvent(int eventID, int numUsingPlayers) {
        if (eventID == 1)
        {
            this.numUsingPlayers = numUsingPlayers;
            return true;
        }
        else
        {
            return super.receiveClientEvent(eventID, numUsingPlayers);
        }
    }
}
