package be.CoderDojo.CDEeklo.init;

import be.CoderDojo.CDEeklo.block.*;
import be.CoderDojo.CDEeklo.block.base.BlockMB;
import be.CoderDojo.CDEeklo.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class ModBlocks {

    public static final BlockMB centerBlock= new BlockMazeCenter();
    public static final BlockMB floorBlock= new BlockMazeFloor();
    public static final BlockMB wallBlock= new BlockMazeWall();
    public static final BlockMB endBlock= new BlockMazeEnd();
    public static final BlockMB teleporterBlock= new BlockTeleporter();


    public static void init(){
        GameRegistry.registerBlock(centerBlock, Names.Blocks.MAZECENTERBLOCK);
        GameRegistry.registerBlock(floorBlock, Names.Blocks.MAZEFLOORBLOCK);
        GameRegistry.registerBlock(wallBlock, Names.Blocks.MAZEWALLBLOCK);
        GameRegistry.registerBlock(endBlock, Names.Blocks.MAZEENDBLOCK);
        GameRegistry.registerBlock(teleporterBlock,Names.Blocks.TELEPORTER);
    }
}
