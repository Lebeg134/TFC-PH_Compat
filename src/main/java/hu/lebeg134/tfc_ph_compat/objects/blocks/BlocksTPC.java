package hu.lebeg134.tfc_ph_compat.objects.blocks;

import com.google.common.collect.ImmutableList;
import hu.lebeg134.tfc_ph_compat.util.agriculture.TPCrop;
import net.dries007.tfc.objects.blocks.agriculture.BlockCropDead;
import net.dries007.tfc.objects.blocks.agriculture.BlockCropTFC;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import static hu.lebeg134.tfc_ph_compat.Reference.MODID;

@Mod.EventBusSubscriber(modid = MODID)
@GameRegistry.ObjectHolder(MODID)
public class BlocksTPC {
    private static ImmutableList<BlockCropTFC> allCropBlocks;
    private static ImmutableList<BlockCropDead> allDeadCropBlocks;

    public static ImmutableList<BlockCropTFC> getAllCropBlocks()
    {
        return allCropBlocks;
    }

    public static ImmutableList<BlockCropDead> getAllDeadCropBlocks()
    {
        return allDeadCropBlocks;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> r = event.getRegistry();

        ImmutableList.Builder<ItemBlock> normalItemBlocks = ImmutableList.builder();
        ImmutableList.Builder<ItemBlock> inventoryItemBlocks = ImmutableList.builder();

        {
            ImmutableList.Builder<BlockCropTFC> b = ImmutableList.builder();

            for (TPCrop crop : TPCrop.values())
            {
                b.add(register(r, "crop/" + crop.name().toLowerCase(), crop.createGrowingBlock()));
            }

            allCropBlocks = b.build();
        }

        {
            ImmutableList.Builder<BlockCropDead> b = ImmutableList.builder();

            for (TPCrop crop : TPCrop.values())
            {
                b.add(register(r, "dead_crop/" + crop.name().toLowerCase(), crop.createDeadBlock()));
            }

            allDeadCropBlocks = b.build();
        }
    }
    private static <T extends Block> T register(IForgeRegistry<Block> r, String name, T block)
    {
        block.setRegistryName(MODID, name);
        block.setTranslationKey(MODID + "." + name.replace('/', '.'));
        r.register(block);
        return block;
    }

}
