package be.CoderDojo.CDEeklo.network;

import be.CoderDojo.CDEeklo.network.messages.MessageTileEntityMB;
import be.CoderDojo.CDEeklo.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class PacketHandler {

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.LOWERCASE_MOD_ID);

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityMB.class, MessageTileEntityMB.class, 0, Side.CLIENT);
    }

}
