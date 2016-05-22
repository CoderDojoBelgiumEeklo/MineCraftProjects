package be.CoderDojo.CDEeklo.block;

import be.CoderDojo.CDEeklo.block.base.BlockMB;
import be.CoderDojo.CDEeklo.reference.Names;

/**
 * Created by Obsidean on 03/01/2016.
 */
public class BlockMazeEnd extends BlockMB {

    public BlockMazeEnd(){

        super();

        this.setBlockUnbreakable();
        this.setResistance(6000000.0F);
        this.setBlockName(Names.Blocks.MAZEENDBLOCK);

                /*this.setHardness();*/
    }
}
