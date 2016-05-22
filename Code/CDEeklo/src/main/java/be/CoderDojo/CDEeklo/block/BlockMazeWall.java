package be.CoderDojo.CDEeklo.block;

import be.CoderDojo.CDEeklo.block.base.BlockMB;
import be.CoderDojo.CDEeklo.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


/**
 * Created by Obsidean on 28/12/2015.
 */
public class BlockMazeWall extends BlockMB {


    public BlockMazeWall(){

        super();

        this.setBlockUnbreakable();
        this.setResistance(6000000.0F);
        this.setBlockName(Names.Blocks.MAZEWALLBLOCK);

                /*this.setHardness();*/
    }



    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }


    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
