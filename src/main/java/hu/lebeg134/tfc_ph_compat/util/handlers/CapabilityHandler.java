package hu.lebeg134.tfc_ph_compat.util.handlers;

import hu.lebeg134.tfc_ph_compat.util.HeatCapabilityHelper;
import hu.lebeg134.tfc_ph_compat.util.agriculture.TPFood;
import net.dries007.tfc.api.capability.food.*;
import net.dries007.tfc.api.capability.heat.CapabilityItemHeat;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CapabilityHandler {
    @SubscribeEvent
    public static void attachItemCapabilities(AttachCapabilitiesEvent<ItemStack> event)
    {
        ItemStack stack = event.getObject();
        Item Item = stack.getItem();
        if (Item.getRegistryName() != null){
            String name = Item.getRegistryName().toString();
            if (HeatCapabilityHelper.Contains(name) &&
                    !event.getCapabilities().containsKey(CapabilityItemHeat.KEY)){
                event.addCapability(CapabilityItemHeat.KEY,new FoodHeatHandler(stack.getTagCompound(),HeatCapabilityHelper.getFoodData(name),1f,480f));
            }
        }
    }
}
