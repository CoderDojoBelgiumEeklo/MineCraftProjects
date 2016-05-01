package be.CoderDojo.CDEeklo.items;

import be.CoderDojo.CDEeklo.init.ModBlocks;
import be.CoderDojo.CDEeklo.items.base.ItemMB;
import be.CoderDojo.CDEeklo.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

/**
 * Created by Obsidean on 03/01/2016.
 */
public class ItemStillASmallMaze extends ItemMB {

    public ItemStillASmallMaze(){
        super();
        this.setHasSubtypes(false);
        this.setUnlocalizedName(Names.Items.STILLASMALLMAZE);
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
                world.setBlock(x+7,y,z, ModBlocks.endBlock);

                //Create Floor
                for (int indexX=1 ; indexX<7; indexX++)
                {
                    for (int indexZ=-3 ; indexZ<4; indexZ++){
                        world.setBlock(x+indexX, y, z+indexZ, ModBlocks.floorBlock);
                    }

                }

                //Place walls
                int wallXcoord= x+1;
                int wallYcoord= y+1;


                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);

                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);

                wallXcoord=x+2;

                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);

                wallXcoord=x+3;
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);

                wallXcoord=x+4;
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);

                wallXcoord=x+5;
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);

                wallXcoord=x+6;
                world.setBlock(wallXcoord,wallYcoord,z-3, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z-1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+1, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+2, ModBlocks.wallBlock);
                world.setBlock(wallXcoord,wallYcoord,z+3, ModBlocks.wallBlock);

               /* player.swingItem();*/

                return true ;
            }
        }



        return false;
    }

}
