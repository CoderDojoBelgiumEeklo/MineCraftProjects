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
 * Created by Obsidean on 27/12/2015.
 */
public class ItemVerySmallMaze extends ItemMB {

    public ItemVerySmallMaze(){
        super();
        this.setHasSubtypes(false);
        this.setUnlocalizedName(Names.Items.VERYSMALLMAZE);
    }




    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitx, float hity, float hitz) {


        if (!world.isRemote)
        {
            Block block= world.getBlock(x,y,z);


            if (block != null){
                MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("your message: onItemUse"));


                player.setPositionAndUpdate(x+0.5d,y+1,z+0.5d);

                //Create Floor
                world.setBlock(x-1,y,z-1, ModBlocks.floorBlock);
                world.setBlock(x-1,y,z,ModBlocks.floorBlock);
                world.setBlock(x-1,y,z+1,ModBlocks.floorBlock);

                world.setBlock(x,y,z-1,ModBlocks.floorBlock);
                world.setBlock(x,y,z, ModBlocks.centerBlock);
                world.setBlock(x,y,z+1,ModBlocks.floorBlock);

                world.setBlock(x+1,y,z-1,ModBlocks.floorBlock);
                world.setBlock(x+1,y,z,ModBlocks.floorBlock);
                world.setBlock(x+1,y,z+1,ModBlocks.floorBlock);

                world.setBlock(x+2,y,z, ModBlocks.endBlock);

                //place walls
                world.setBlock(x-1,y+1,z-1,ModBlocks.wallBlock);
                world.setBlock(x-1,y+1,z,ModBlocks.wallBlock);
                world.setBlock(x-1,y+1,z+1,ModBlocks.wallBlock);

                world.setBlock(x,y+1,z-1,ModBlocks.wallBlock);

                world.setBlock(x,y+1,z+1,ModBlocks.wallBlock);

                world.setBlock(x+1,y+1,z-1,ModBlocks.wallBlock);

                world.setBlock(x+1,y+1,z+1,ModBlocks.wallBlock);




               /* player.swingItem();*/

                return true ;
            }
        }





        return false;
    }
}
