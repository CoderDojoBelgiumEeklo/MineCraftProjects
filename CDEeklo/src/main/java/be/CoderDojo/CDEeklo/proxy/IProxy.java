package be.CoderDojo.CDEeklo.proxy;

/**
 * Created by Obsidean on 27/12/2015.
 */
public interface IProxy {

    public abstract ClientProxy getClientProxy();

    public abstract void registerEventHandlers();

}
