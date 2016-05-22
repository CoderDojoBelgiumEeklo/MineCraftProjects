package be.CoderDojo.CDEeklo.tileentity.base;

import be.CoderDojo.CDEeklo.network.PacketHandler;
import be.CoderDojo.CDEeklo.network.messages.MessageTileEntityMB;
import be.CoderDojo.CDEeklo.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.UsernameCache;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.UUID;

/**
 * Created by Obsidean on 07/02/2016.
 */
public class TileEntityMB extends TileEntity {

    protected ForgeDirection orientation;
    protected byte state;
    protected String customName;
    protected UUID ownerUUID;

    public TileEntityMB()
    {
        orientation = ForgeDirection.SOUTH;
        state = 0;
        customName = "";
        ownerUUID = null;
    }


    public ForgeDirection getOrientation(){return orientation;}

    public void setOrientation(ForgeDirection orientation){this.orientation= orientation;}

    public void setOrientation(int orientation){this.orientation= ForgeDirection.getOrientation(orientation);}

    public short getState(){return state;}

    public void setState(byte state){this.state=state;}

    public String getCustomName(){return customName;}

    public void setCustomName(String customName){this.customName= customName;}

    public UUID getOwnerUUID(){return ownerUUID;}

    public void setOwnerUUID(UUID ownerUUID){this.ownerUUID=ownerUUID;}

    public String getOwnerName(){
        if (ownerUUID != null)
        {
            return UsernameCache.getLastKnownUsername(ownerUUID);
        }

        return "Unknown";
    }

    public void setOwner(EntityPlayer entityplayer){
        this.ownerUUID= entityplayer.getPersistentID();
    }

    public boolean hasCustomName()
    {
        return customName != null && customName.length() > 0;
    }

    public boolean hasOwner()
    {
        return ownerUUID != null;
    }



    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {
        super.readFromNBT(nbtTagCompound);

        if (nbtTagCompound.hasKey(Names.NBT.DIRECTION))
        {
            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte(Names.NBT.DIRECTION));
        }

        if (nbtTagCompound.hasKey(Names.NBT.STATE))
        {
            this.state = nbtTagCompound.getByte(Names.NBT.STATE);
        }

        if (nbtTagCompound.hasKey(Names.NBT.CUSTOM_NAME))
        {
            this.customName = nbtTagCompound.getString(Names.NBT.CUSTOM_NAME);
        }

        if (nbtTagCompound.hasKey(Names.NBT.OWNER_UUID_MOST_SIG) && nbtTagCompound.hasKey(Names.NBT.OWNER_UUID_LEAST_SIG))
        {
            this.ownerUUID = new UUID(nbtTagCompound.getLong(Names.NBT.OWNER_UUID_MOST_SIG), nbtTagCompound.getLong(Names.NBT.OWNER_UUID_MOST_SIG));
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {
        super.writeToNBT(nbtTagCompound);

        nbtTagCompound.setByte(Names.NBT.DIRECTION, (byte) orientation.ordinal());
        nbtTagCompound.setByte(Names.NBT.STATE, state);

        if (this.hasCustomName())
        {
            nbtTagCompound.setString(Names.NBT.CUSTOM_NAME, customName);
        }

        if (this.hasOwner())
        {
            nbtTagCompound.setLong(Names.NBT.OWNER_UUID_MOST_SIG, ownerUUID.getMostSignificantBits());
            nbtTagCompound.setLong(Names.NBT.OWNER_UUID_LEAST_SIG, ownerUUID.getLeastSignificantBits());
        }
    }

    @Override
    public Packet getDescriptionPacket() {
        return PacketHandler.INSTANCE.getPacketFrom(new MessageTileEntityMB(this));
    }
}
