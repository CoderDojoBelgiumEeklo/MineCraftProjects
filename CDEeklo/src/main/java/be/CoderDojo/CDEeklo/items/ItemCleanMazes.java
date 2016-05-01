package be.CoderDojo.CDEeklo.items;

import be.CoderDojo.CDEeklo.items.base.ItemMB;
import be.CoderDojo.CDEeklo.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderServer;

/**
 * Created by Obsidean on 06/01/2016.
 * Adapted from icbm blastregen
 */
public class ItemCleanMazes extends ItemMB {

    public ItemCleanMazes()
    {
        super();
        this.setHasSubtypes(false);
        this.setUnlocalizedName(Names.Items.CLEANMAZES);
    }

    @Override
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World world, int intx, int inty, int intz, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {


            if (!world.isRemote)
            {
                try
                {
                    MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("your message: onItemUse"));
                    Chunk oldChunk = world.getChunkFromBlockCoords(intx, intz);

                    if (world instanceof WorldServer)
                    {
                        WorldServer worldServer = (WorldServer) world;
                        ChunkProviderServer chunkProviderServer = worldServer.theChunkProviderServer;
                        IChunkProvider chunkProviderGenerate =world.getChunkProvider();

                        Chunk newChunk = chunkProviderGenerate.provideChunk(oldChunk.xPosition, oldChunk.zPosition);

                        for (int x = 0; x < 16; x++)
                        {
                            for (int z = 0; z < 16; z++)
                            {
                                for (int y = 0; y < world.getHeight(); y++)
                                {
                                    Block block = newChunk.getBlock(x, y, z);

                                    int metadata = newChunk.getBlockMetadata(x, y, z);

                                    worldServer.setBlock(x + oldChunk.xPosition * 16, y, z + oldChunk.zPosition * 16, block, metadata, 2);

                                    TileEntity tileEntity = newChunk.func_150806_e(x, y, z);

                                    if (tileEntity != null)
                                    {
                                        worldServer.setTileEntity(x + oldChunk.xPosition * 16, y, z + oldChunk.zPosition * 16, tileEntity);
                                    }
                                }
                            }
                        }

                        oldChunk.isTerrainPopulated = false;
                        chunkProviderGenerate.populate(chunkProviderGenerate, oldChunk.xPosition, oldChunk.zPosition);
                    }
                    MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("your message: onItemUse end"));
                }
                catch (Exception e)
                {
                    MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("your message: onItemUse :" + e.toString()));
                    System.out.println("ICBM Rejuvenation Failed!");
                    e.printStackTrace();
                }
            }

        return true;

    }


}