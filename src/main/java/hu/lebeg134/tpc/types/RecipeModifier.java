package hu.lebeg134.tpc.types;

import com.pam.harvestcraft.item.DummyRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod.EventBusSubscriber
public class RecipeModifier {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        IForgeRegistryModifiable<IRecipe> recipeRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
        //banned items
        dummyOutRecipe(recipeRegistry, "harvestcraft:saltitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:freshwateritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:freshmilkitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cheeseitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:doughitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:friedeggitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cornmealitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:groundfishitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofeakitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofaconitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofeegitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofuttonitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofickenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofabbititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofurkeyitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofenisonitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofuduckitem");
        //other banned blocks
        dummyOutRecipe(recipeRegistry, "harvestcraft:market");
        dummyOutRecipe(recipeRegistry, "harvestcraft:shippingbin");
        dummyOutRecipe(recipeRegistry, "harvestcraft:well");
        dummyOutRecipe(recipeRegistry, "harvestcraft:groundtrap");
        dummyOutRecipe(recipeRegistry, "harvestcraft:watertrap");
        dummyOutRecipe(recipeRegistry, "harvestcraft:waterfilter");
        //PH seeds
        dummyOutRecipe(recipeRegistry, "harvestcraft:blackberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:blueberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:candleberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:raspberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:strawberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cactusfruitseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:asparagusseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:barleyseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:oatsseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:ryeseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cornseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bambooshootseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cantaloupeseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cucumberseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:wintersquashseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:zucchiniseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beetseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:onionseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:parsnipseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peanutseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:radishseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rutabagaseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sweetpotatoseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:turnipseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rhubarbseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:celeryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:garlicseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gingerseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spiceleafseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:teaseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:coffeeseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mustardseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:broccoliseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cauliflowerseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:leekseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lettuceseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:scallionseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:artichokeseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:brusselsproutseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cabbageseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spinachseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:whitemushroomseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beanseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:soybeanseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bellpepperseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chilipepperseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:eggplantseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:okraseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peasseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tomatoseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cottonseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pineappleseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grapeseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:kiwiseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cranberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:riceseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:seaweedseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:curryleafseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sesameseedsseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:waterchestnutseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gigapickleseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:kaleseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:agaveseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:amaranthseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:arrowrootseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cassavaseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chickpeaseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:elderberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flaxseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:greengrapeseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:huckleberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:jicamaseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:juteseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:kenafseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:kohlrabiseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lentilseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:milletseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mulberryseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:quinoaseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sisalseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:taroseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tomatilloseeditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:juniperberryseeditem");
        // sapling recipes
        dummyOutRecipe(recipeRegistry, "harvestcraft:date_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:papaya_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cherry_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fig_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:soursop_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:dragonfruit_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rambutan_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:jackfruit_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:passionfruit_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:apple_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lemon_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pear_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:olive_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spiderweb_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grapefruit_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pomegranate_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cashew_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:vanillabean_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:starfruit_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:banana_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:plum_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:avocado_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pecan_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pistachio_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hazelnut_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lime_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peppercorn_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:almond_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gooseberry_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peach_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chestnut_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pawpaw_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:coconut_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mango_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:apricot_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:orange_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:walnut_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lychee_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:persimmon_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:guava_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:breadfruit_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:nutmeg_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:durian_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tamarind_sapling");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cinnamon_sapling");


    }

    //Code from Pam's harvestcraft
    /**
     * Prevents issues with vanilla advancements spamming the console
     * @param registry recipe registry
     * @param resourceLocationPath path to the recipe
     */
    public static void dummyOutRecipe(IForgeRegistryModifiable<IRecipe> registry, String resourceLocationPath) {
        ResourceLocation location = new ResourceLocation(resourceLocationPath);
        IRecipe recipe = registry.getValue(location);
        if(recipe != null) {
            registry.remove(location); //modified from remove to clear
            registry.register(DummyRecipe.from(recipe));
        } else {
            FMLLog.warning("Unable to find recipe for "+resourceLocationPath);
        }
    }
}
