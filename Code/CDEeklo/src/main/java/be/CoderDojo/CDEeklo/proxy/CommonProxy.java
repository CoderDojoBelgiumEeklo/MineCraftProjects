package be.CoderDojo.CDEeklo.proxy;

import be.CoderDojo.CDEeklo.handler.WorldEventHandler;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class CommonProxy implements IProxy {
    @Override
    public ClientProxy getClientProxy() {
        return null;
    }

    @Override
    public void registerEventHandlers() {
        MinecraftForge.EVENT_BUS.register(new WorldEventHandler());
    }
}
