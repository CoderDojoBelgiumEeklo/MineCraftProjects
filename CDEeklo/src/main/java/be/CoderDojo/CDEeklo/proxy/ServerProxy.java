package be.CoderDojo.CDEeklo.proxy;

/**
 * Created by Obsidean on 24/01/2016.
 */
public class ServerProxy extends CommonProxy {


    @Override
    public ClientProxy getClientProxy() {
        return null;
    }

    @Override
    public void registerEventHandlers() {
        super.registerEventHandlers();
    }
}
