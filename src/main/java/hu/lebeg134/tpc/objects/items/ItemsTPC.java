package hu.lebeg134.tpc.objects.items;

import com.google.common.collect.ImmutableList;
import hu.lebeg134.tpc.util.agriculture.TPCrop;
import net.dries007.tfc.objects.items.ItemSeedsTFC;
import net.dries007.tfc.util.OreDictionaryHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import static hu.lebeg134.tpc.Reference.MODID;
import static net.dries007.tfc.TerraFirmaCraft.MOD_ID;
import static net.dries007.tfc.objects.CreativeTabsTFC.CT_FOOD;

@Mod.EventBusSubscriber(modid = MODID)
@GameRegistry.ObjectHolder(MODID)
public final class ItemsTPC {
    private static ImmutableList<Item> allSimpleItems;
    public static ImmutableList<Item> getAllSimpleItems()
    {
        return allSimpleItems;
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        ImmutableList.Builder<Item> simpleItems = ImmutableList.builder();
        /*for (TPCrop crop : TPCrop.values()) {
            simpleItems.add(register(r, "crop/seeds/" + crop.name().toLowerCase(), new ItemSeedsTFC(crop), CT_FOOD));
        }*/
        simpleItems.add(register(r, "crop/seeds/" + TPCrop.SPICE.name().toLowerCase(), new ItemSeedsTFC(TPCrop.SPICE), CT_FOOD));
        allSimpleItems = simpleItems.build();
        OreDictionaryHelper.init();
    }
    private static <T extends Item> T register(IForgeRegistry<Item> r, String name, T item, CreativeTabs ct)
    {
        item.setRegistryName(MODID, name);
        item.setTranslationKey(MODID + "." + name.replace('/', '.'));
        item.setCreativeTab(ct);
        r.register(item);
        return item;
    }
}
