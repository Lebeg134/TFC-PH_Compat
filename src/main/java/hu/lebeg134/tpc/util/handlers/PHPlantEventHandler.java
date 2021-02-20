package hu.lebeg134.tpc.util.handlers;

import com.pam.harvestcraft.blocks.CropRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class PHPlantEventHandler {
    @SubscribeEvent(priority = EventPriority.LOW)
    public static void PlayerInterract (PlayerInteractEvent.RightClickBlock event)
    {
        if (CropRegistry.getFoods().values().contains(event.getItemStack().getItem()))
        {
            event.setCanceled(true);
        }
    }
}
