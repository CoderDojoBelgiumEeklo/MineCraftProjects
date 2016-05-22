package be.CoderDojo.CDEeklo;

import be.CoderDojo.CDEeklo.handler.GUIHandler;
import be.CoderDojo.CDEeklo.init.ModBlocks;
import be.CoderDojo.CDEeklo.init.ModTE;
import be.CoderDojo.CDEeklo.network.PacketHandler;
import be.CoderDojo.CDEeklo.reference.Messages;
import be.CoderDojo.CDEeklo.reference.Reference;
import be.CoderDojo.CDEeklo.utility.LogHelper;
import be.CoderDojo.CDEeklo.init.ModItems;
import be.CoderDojo.CDEeklo.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * Created by Obsidean on 27/12/2015.
 */
@Mod(modid= Reference.MOD_ID, name =Reference.MOD_NAME ,version = Reference.VERSION)
public class CDEeklo {
    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event)
    {
        if (Reference.FINGERPRINT.equals("@FINGERPRINT@"))
        {
            LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
        }
        else
        {
            LogHelper.warn(Messages.INVALID_FINGERPRINT_MESSAGE);
        }
    }

    @Mod.Instance(Reference.MOD_ID)
    public static CDEeklo instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;



    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        PacketHandler.init();

        ModItems.init();
        ModBlocks.init();

        //ModPotions.init();
    }

    @Mod.EventHandler
    public  void Init(FMLInitializationEvent event)
    {

        // Register the GUI Handler
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GUIHandler());


        //ModRecipes.init();

        ModTE.init();

        proxy.registerEventHandlers();

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
