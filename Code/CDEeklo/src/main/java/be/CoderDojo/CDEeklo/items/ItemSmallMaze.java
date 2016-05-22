package be.CoderDojo.CDEeklo.items;

import be.CoderDojo.CDEeklo.init.ModBlocks;
import be.CoderDojo.CDEeklo.reference.Names;
import be.CoderDojo.CDEeklo.items.base.ItemMB;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class ItemSmallMaze extends ItemMB {

    public ItemSmallMaze(){
        super();
        this.setHasSubtypes(false);
        this.setUnlocalizedName(Names.Items.SMALLMAZE);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitx, float hity, float hitz) {

        if (!world.isRemote)
        {
            Block block= world.getBlock(x,y,z);


            if (block != null){
                MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("your message: onItemUse"));


                player.setPositionAndUpdate(x+0.5d,y+1,z+0.5d);

                //set start and end of maze

                world.setBlock(x,y,z, ModBlocks.centerBlock);
                world.setBlock(x+16,y,z, ModBlocks.endBlock);

                //Create Floor
                for (int indexX=1 ; indexX<16; indexX++)
                {
                    for (int indexZ=-7 ; indexZ<8; indexZ++){
                        world.setBlock(x+indexX, y, z+indexZ, ModBlocks.floorBlock);
                    }

                }

                //Place walls
                int wallXcoord= x+1;
                int wallYcoord= y+1;


                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-6, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);

                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+6, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//2
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//3
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+6, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//4
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//5
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);

                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//6
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//7
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);

                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//8
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//9
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-6, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//10
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//11
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//12
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//13
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+6, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//14
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);

                wallXcoord++;//15
                world.setBlock(wallXcoord,wallYcoord,z-7, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-6, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);

                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+4, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+5, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+6, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+7, ModBlocks.wallBlock);



               /* player.swingItem();*/

                return true ;
            }
        }



        return false;
    }
}
