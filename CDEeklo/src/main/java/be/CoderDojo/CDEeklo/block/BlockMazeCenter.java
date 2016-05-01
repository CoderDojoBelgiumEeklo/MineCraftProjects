package be.CoderDojo.CDEeklo.block;

import be.CoderDojo.CDEeklo.block.base.BlockMB;
import be.CoderDojo.CDEeklo.reference.Names;
;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class BlockMazeCenter extends BlockMB {

    public BlockMazeCenter(){

        super();
        this.setBlockUnbreakable();
        this.setResistance(6000000.0F);
        this.setBlockName(Names.Blocks.MAZECENTERBLOCK);

                /*this.setHardness();*/
    }


}
