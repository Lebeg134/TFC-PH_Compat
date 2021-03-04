package hu.lebeg134.tpc.util.handlers;

import com.pam.harvestcraft.blocks.CropRegistry;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class PHPlantEventHandler {
    @SubscribeEvent(priority = EventPriority.LOW)
    public static void PlayerInterract (PlayerInteractEvent.RightClickBlock event)
    {
        if (CropRegistry.getFoods().values().contains(event.getItemStack().getItem()) &&
            event.getWorld().getBlockState(event.getPos()).getBlock().getRegistryName().getPath().contains("farmland"))
        {
            event.setCanceled(true);
        }
    }
}
