package be.CoderDojo.CDEeklo.reference;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class Reference {

    public static final String MOD_ID = "cdeeklo";
    public static final String MOD_NAME = "CDEeklo";
    public static final String LOWERCASE_MOD_ID = MOD_ID.toLowerCase();

    public static final String VERSION = "@VERSION@";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String SERVER_PROXY_CLASS = "be.CoderDojo.CDEeklo.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "be.CoderDojo.CDEeklo.proxy.ClientProxy";
    public static final String GUI_FACTORY_ClASS = "be.CoderDojo.CDEeklo.client.gui.GuiFactory";

    public static final class TE{
        public static final String TILE="tile.";
        public static final String teTeleporter=TILE + Names.Blocks.TELEPORTER;
    }

}
