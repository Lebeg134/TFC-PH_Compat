package hu.lebeg134.tfc_ph_compat.client.render;

import hu.lebeg134.tfc_ph_compat.objects.blocks.BlocksTPC;
import hu.lebeg134.tfc_ph_compat.objects.items.ItemsTPC;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static hu.lebeg134.tfc_ph_compat.Reference.MODID;
import static net.dries007.tfc.objects.blocks.agriculture.BlockCropTFC.WILD;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = MODID)
public final class ClientRegisterEvents {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        // Simple Items
        for (Item item : ItemsTPC.getAllSimpleItems())
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString()));
        // Crops
        for (Block block : BlocksTPC.getAllCropBlocks())
            ModelLoader.setCustomStateMapper(block, new StateMap.Builder().ignore(WILD).build());

    }
}

