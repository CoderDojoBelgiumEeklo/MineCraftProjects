package be.CoderDojo.CDEeklo.reference;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class Names {

    public static final String MOD_INVENTORY="container.cdeeklo:";

    public static final class Blocks{

        public static final String MAZECENTERBLOCK="MazeCenterBlock";
        public static final String MAZEFLOORBLOCK="MazeFloorBlock";
        public static final String MAZEWALLBLOCK="MazeWallBlock";
        public static final String MAZEENDBLOCK="MazeEndBlock";
        public static final String TELEPORTER="TeleporterBlock";
    }

    public static final class Items{

        public static final String BUILDERICON="ItemMazeBuilderIcon";
        public static final String VERYSMALLMAZE="VerySmallMaze";
        public static final String STILLASMALLMAZE="StillASmallMaze";
        public static final String SMALLMAZE="SmallMaze";
        public static final String CLEANMAZES="CleanMazes";
        public static final String TELEPORTER="ItemTeleporter";
    }


    public static final class NBT
    {
        public static final String ITEMS = "Items";
        public static final String CUSTOM_NAME = "CustomName";
        public static final String DIRECTION = "teDirection";
        public static final String OWNER = "owner";
        public static final String STATE = "teState";
        public static final String OWNER_UUID_MOST_SIG = "ownerUUIDMostSig";
        public static final String OWNER_UUID_LEAST_SIG = "ownerUUIDLeastSig";
        public static final String BUILDERACTIVE="BuilderActive";
        public static final String UUID_MOST_SIG = "UUIDMostSig";
        public static final String UUID_LEAST_SIG = "UUIDLeastSig";
        public static final String CRAFTING_GUI_OPEN = "craftingGuiOpen";
    }

    public static final class Containers
    {
        public static final String VANILLA_INVENTORY = "container.inventory";


    }

    public static final class TE
    {
        public static final String TELEPORTER=MOD_INVENTORY+ Items.TELEPORTER;
        public static final String TeLocation=MOD_INVENTORY+"Locations";
    }
}
