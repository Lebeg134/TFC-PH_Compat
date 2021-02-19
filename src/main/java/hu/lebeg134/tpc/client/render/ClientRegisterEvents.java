package hu.lebeg134.tpc.client.render;

import hu.lebeg134.tpc.objects.items.ItemsTPC;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static hu.lebeg134.tpc.Reference.MODID;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = MODID)
public final class ClientRegisterEvents {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        // Simple Items
        for (Item item : ItemsTPC.getAllSimpleItems())
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString()));


    }
}

