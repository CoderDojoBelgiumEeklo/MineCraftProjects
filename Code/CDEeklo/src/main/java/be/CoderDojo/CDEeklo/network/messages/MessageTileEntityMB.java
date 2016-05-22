package be.CoderDojo.CDEeklo.network.messages;

import be.CoderDojo.CDEeklo.tileentity.base.TileEntityMB;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;

import java.util.UUID;

/**
 * Created by Obsidean on 07/02/2016.
 */
public class MessageTileEntityMB implements IMessage, IMessageHandler<MessageTileEntityMB, IMessage> {
    public int x, y, z;
    public byte orientation, state;
    public String customName;
    public UUID ownerUUID;


    public MessageTileEntityMB(){}

    public MessageTileEntityMB(TileEntityMB tileEntityJB)
    {
        this.x = tileEntityJB.xCoord;
        this.y = tileEntityJB.yCoord;
        this.z = tileEntityJB.zCoord;
        this.orientation = (byte) tileEntityJB.getOrientation().ordinal();
        this.state = (byte) tileEntityJB.getState();
        this.customName = tileEntityJB.getCustomName();
        this.ownerUUID = tileEntityJB.getOwnerUUID();
    }


    @Override
    public void fromBytes(ByteBuf buf) {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.orientation = buf.readByte();
        this.state = buf.readByte();
        int customNameLength = buf.readInt();
        this.customName = new String(buf.readBytes(customNameLength).array());
        if (buf.readBoolean())
        {
            this.ownerUUID = new UUID(buf.readLong(), buf.readLong());
        }
        else
        {
            this.ownerUUID = null;
        }
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeByte(orientation);
        buf.writeByte(state);
        buf.writeInt(customName.length());
        buf.writeBytes(customName.getBytes());
        if (ownerUUID != null)
        {
            buf.writeBoolean(true);
            buf.writeLong(ownerUUID.getMostSignificantBits());
            buf.writeLong(ownerUUID.getLeastSignificantBits());
        }
        else
        {
            buf.writeBoolean(false);
        }
    }

    @Override
    public IMessage onMessage(MessageTileEntityMB message, MessageContext ctx) {

        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);

        if (tileEntity instanceof TileEntityMB)
        {
            ((TileEntityMB) tileEntity).setOrientation(message.orientation);
            ((TileEntityMB) tileEntity).setState(message.state);
            ((TileEntityMB) tileEntity).setCustomName(message.customName);
            ((TileEntityMB) tileEntity).setOwnerUUID(message.ownerUUID);
        }

        return null;
    }



    @Override
    public String toString()
    {
        return String.format("MessageTileEntityJB - x:%s, y:%s, z:%s, orientation:%s, state:%s, customName:%s, ownerUUID:%s", x, y, z, orientation, state, customName, ownerUUID);
    }
}
