package hu.lebeg134.tpc.types;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import com.pam.harvestcraft.item.DummyRecipe;
import com.pam.harvestcraft.item.ItemRegistry;
import net.dries007.tfc.api.recipes.anvil.AnvilRecipe;
import net.dries007.tfc.api.recipes.barrel.BarrelRecipe;
import net.dries007.tfc.api.recipes.barrel.BarrelRecipeFoodPreservation;
import net.dries007.tfc.api.recipes.barrel.BarrelRecipeFoodTraits;
import net.dries007.tfc.api.recipes.heat.HeatRecipe;
import net.dries007.tfc.api.recipes.heat.HeatRecipeSimple;
import net.dries007.tfc.api.recipes.knapping.KnappingRecipe;
import net.dries007.tfc.api.recipes.knapping.KnappingRecipeStone;
import net.dries007.tfc.api.recipes.knapping.KnappingType;
import net.dries007.tfc.api.recipes.quern.QuernRecipe;
import net.dries007.tfc.api.registries.TFCRegistries;
import net.dries007.tfc.api.types.Metal;
import net.dries007.tfc.objects.inventory.ingredient.IIngredient;
import net.dries007.tfc.objects.inventory.ingredient.IngredientItemFood;
import net.dries007.tfc.objects.items.ItemsTFC;
import net.dries007.tfc.objects.items.food.ItemFoodTFC;
import net.dries007.tfc.objects.items.metal.ItemMetal;
import net.dries007.tfc.objects.items.metal.ItemMetalTool;
import net.dries007.tfc.types.DefaultMetals;
import net.dries007.tfc.util.agriculture.Food;
import net.dries007.tfc.util.calendar.ICalendar;
import net.dries007.tfc.util.forge.ForgeRule;
import net.dries007.tfc.util.skills.SmithingSkill;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

import javax.annotation.Nullable;

import static hu.lebeg134.tpc.Reference.MODID;
import static net.dries007.tfc.objects.fluids.FluidsTFC.*;

@Mod.EventBusSubscriber
public class RecipeModifier {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        IForgeRegistryModifiable<IRecipe> recipeRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
        //setting containeritems
        ItemsTFC.FIRED_POT.setContainerItem(ItemsTFC.FIRED_POT);
        /*
        for (Metal M : TFCRegistries.METALS.getValuesCollection())
        {
            Item Tool = ItemMetalTool.REGISTRY.getObject(new ResourceLocation("tfc:metal/knife/"+M.getRegistryName().getPath()));
            if (Tool!=null)
                Tool.setContainerItem(Tool);
        }*/
        //banned items
        dummyOutRecipe(recipeRegistry, "harvestcraft:saltitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:friedeggitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cornmealitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofeakitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofaconitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofeegitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofuttonitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofickenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofabbititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofurkeyitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofenisonitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofuduckitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fruitbaititem_x4");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grainbaititem_x4");
        dummyOutRecipe(recipeRegistry, "harvestcraft:veggiebaititem_x4");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fishtrapbaititem_x4");
        dummyOutRecipe(recipeRegistry, "harvestcraft:vinegaritem");


        //recipes from Grouped recipes
        dummyOutRecipe(recipeRegistry, "harvestcraft:freshwateritem_listAllwater");
        dummyOutRecipe(recipeRegistry, "harvestcraft:freshwateritem_minecraft_water_bucket");
        dummyOutRecipe(recipeRegistry, "harvestcraft:freshmilkitem_cropAlmond");
        dummyOutRecipe(recipeRegistry, "harvestcraft:freshmilkitem_minecraft_milk_bucket");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cheeseitem_itemsalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cheeseitem_dustsalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cheeseitem_foodsalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropAlmond");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropAmaranth");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropBanana");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropBarley");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropBean");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropCassava");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropChestnut");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropChickpea");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropCoconut");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropMillet");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropOats");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropPeas");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropPotato");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropQuinoa");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropRice");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropRye");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropSoybean");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropTaro");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_cropWheat");
        dummyOutRecipe(recipeRegistry, "harvestcraft:flouritem_listAllwheat");
        dummyOutRecipe(recipeRegistry, "harvestcraft:doughitem_itemsalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:doughitem_dustsalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:doughitem_foodsalt");
        //other banned foods
        dummyOutRecipe(recipeRegistry, "harvestcraft:carrotcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cheesecakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cherrycheesecakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chocolatesprinklecakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:holidaycakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lamingtonitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pavlovaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pineappleupsidedowncakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pumpkincheesecakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:redvelvetcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rainbowcurryitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spidereyesoupitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:zombiejerkyitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:epicbaconitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:monsterfrieddumplingsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spidereyepieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cobblestonecobbleritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:patreonpieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mobsoupitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:epicbltitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:netherstartoastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:minerstewitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:creeperwingsitem");


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

        //removed recipes in order to implement new ones
        dummyOutRecipe(recipeRegistry, "harvestcraft:grinder");
        dummyOutRecipe(recipeRegistry, "harvestcraft:presser");
        dummyOutRecipe(recipeRegistry, "harvestcraft:potitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_skilletitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_saucepanitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_bakewareitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_mortarandpestleitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_juiceritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_cuttingboarditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:plainyogurtitem_x4");
        dummyOutRecipe(recipeRegistry, "harvestcraft:plainyogurtitem_x4 - Copy");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bakedsweetpotatoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grilledeggplantitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:popcornitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:stockitem_x3_listAllmeatraw");
        dummyOutRecipe(recipeRegistry, "harvestcraft:stockitem_x3_listAllveggie");
        dummyOutRecipe(recipeRegistry, "harvestcraft:stockitem_x3_minecraft_bone");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bubblywateritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:energydrinkitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:soysauceitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:soysauceitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:soysauceitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beefjerkyitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beefjerkyitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beefjerkyitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:picklesitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:picklesitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:picklesitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pickledbeetsitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pickledbeetsitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pickledbeetsitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pickledonionsitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pickledonionsitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pickledonionsitem_itemSalt");

        //Complex replaced recipes
        dummyOutRecipe(recipeRegistry, "harvestcraft:applejellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:applesnowitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:apricotjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:avocadoburritoitem_listAllchicken");
        dummyOutRecipe(recipeRegistry, "harvestcraft:avocadoburritoitem_listAllporkcooked");
        dummyOutRecipe(recipeRegistry, "harvestcraft:baconpancakesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bananamilkshakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:banananutbreaditem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:banananutbreaditem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:banananutbreaditem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bbqchickenbiscuititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bbqplatteritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bbqpotatochipsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bbqpulledporkitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bbqsauceitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beansontoastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beetburgeritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beetsaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:beetsoupitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bentoboxitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:berryvinaigrettesaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:biscuitsandgravyitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:blackberryjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bltitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:blueberryjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bolognaitem_x3_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bolognaitem_x3_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bolognaitem_x3_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bolognasandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bratwurstitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:breakfastburritoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:briochebunitem_x3");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bubbleteaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:californiarollitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cheesesteakitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cheesyshrimpquinoaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cherryjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chickenandwafflesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chickenbiscuititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chickendinneritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chilidogitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chipsanddipitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chocolatebaritem_x4");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chocolatemilkitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chocolatemilkshakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chocovoxelsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chorizoitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chorizoitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chorizoitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:citrussaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:coffeeconlecheitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:coleslawburgeritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cookiesandmilkitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cornbreaditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cornedbeefbreakfastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cornflakesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cottoncandyitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:crabkimbapitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:crackeritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:crackersandcheeseitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cranberryjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:crispyricepuffcerealitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cucumbersaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cucumbersandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:damperitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:damperitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:damperitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:dandelionteaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:dangoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:deluxechickencurryitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:durianmilkshakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:ediblerootitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:eggsaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:eggsbenedictitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:eggtartitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:epicbltitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:etonmessitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:figjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fishlettucewrapitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fishtacoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:footlongitem_listAllbeefcooked");
        dummyOutRecipe(recipeRegistry, "harvestcraft:footlongitem_listAllchickencooked");
        dummyOutRecipe(recipeRegistry, "harvestcraft:footlongitem_listAllporkcooked");
        dummyOutRecipe(recipeRegistry, "harvestcraft:friedbolognasandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:friedfeastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fruitcreamfestivalbreaditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fruitsaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:futomakiitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gherkinitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gherkinitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gherkinitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gooseberryjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gooseberrymilkshakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grapefruitjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gravlaxitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gravlaxitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gravlaxitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grilledcheesevegemitetoastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grilledskewersitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gritsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:guacamoleitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gumboitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hamandcheesesandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hamsweetpicklesandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:heavycreamitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hoisinsauceitem_x9");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeybreaditem_dropHoney");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeybreaditem_foodHoneydrop");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeysandwichitem_dropHoney");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeysandwichitem_foodHoneydrop");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeysoyribsitem_dropHoney");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeysoyribsitem_foodHoneydrop");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hotandsoursoupitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hotchocolateitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hotcocoaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hotsauceitem_x6_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hotsauceitem_x6_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hotsauceitem_x6_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:hummusitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:icecreamitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:icecreamitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:icecreamitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:imitationcrabsticksitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:jelliedeelitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:kiwijellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:koreandinneritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lambkebabitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lambwithmintsauceitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lemonjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:limejellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lycheeteaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mangojellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:marinatedcucumbersitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:marshmellowsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mashedpotatoeschickenbiscuititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mcpamitem_foodGherkin");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mcpamitem_foodPickles");
        dummyOutRecipe(recipeRegistry, "harvestcraft:meatloafsandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:meringuebrownieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:meringuerouladeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:merveilleuxitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mettbrotchenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:misosoupitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mixedsaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mochicakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mochiitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:montecristosandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:museliitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mushroomketchupitem_x5");
        dummyOutRecipe(recipeRegistry, "harvestcraft:musubiitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:nachoesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:netherstartoastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:noodlesitem_x3");
        dummyOutRecipe(recipeRegistry, "harvestcraft:nopalessaladitem_cactus");
        dummyOutRecipe(recipeRegistry, "harvestcraft:nopalessaladitem_cactusfruit");
        dummyOutRecipe(recipeRegistry, "harvestcraft:onionhamburgeritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:orangejellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:oystersauceitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:oystersauceitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:oystersauceitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pancakesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:paneeritem_x5");
        dummyOutRecipe(recipeRegistry, "harvestcraft:papayajellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pbandjitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peachjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peanutbutterbananasandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pearjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pepperjellyandcrackersitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pepperoniitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pepperoniitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pepperoniitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:persimmonjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzasliceitem_anchovypepperonipizzaitem_x13 - Copy (2)");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzasliceitem_bbqchickenpizzaitem_x9");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzasliceitem_hamandpineapplepizzaitem_x9");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzasliceitem_meatfeastpizzaitem_x24");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzasliceitem_pizzaitem_x11");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzasliceitem_supremepizzaitem_x14");
        dummyOutRecipe(recipeRegistry, "harvestcraft:ploughmanslunchitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:plumjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pomegranatejellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:porklettucewrapitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:porksausageitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:porksausageitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:porksausageitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:potatosaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pumpkinspicelatteitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:randomtacoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:raspberryjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:raspberrymilkshakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofabbititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofaconitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofaconitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofaconitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofeakitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofeegitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofenisonitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofickenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofishitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofuduckitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofurkeyitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rawtofuttonitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:redvelvetcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:ricepuddingitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:saladdressingitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:saladdressingitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:saladdressingitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:salmononigiriitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:saltedcaramelitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:saltedcaramelitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:saltedcaramelitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sauerbratenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sausageitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sausageitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sausageitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sausagerollitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:slawdogitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:softpretzelitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:softpretzelitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:softpretzelitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:southernstylebreakfastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spaghettidinneritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spicebunitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:springsaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:starfruitjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:steaktartareitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:steamedpeasitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:steamedpeasitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:steamedpeasitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:steamedspinachitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:strawberryjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:strawberrymilkshakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:strawberrysouffleitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:suaderoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:summerradishsaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sundayhighteaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sunflowerbroccolisaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:supremepizzaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:surfandturfitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sushiitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sweetandsoursauceitem_x5_dropHoney");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sweetandsoursauceitem_x5_foodHoneydrop");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sweetpickleitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:szechuaneggplantitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tacoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:taffyitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:taffyitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:taffyitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:thankfuldinneritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:theatreboxitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:threebeansaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:timtamitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tortillachipsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tortillaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tunafishsandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tunaonigiriitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tunapotatoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tunasaladitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:turkishdelightitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:vegemiteitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:vegemiteontoastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:vegetarianlettucewrapitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:wafflesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:watermelonjellysandwichitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:weekendpicnicitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:yorkshirepuddingitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:yorkshirepuddingitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:yorkshirepuddingitem_itemSalt");

    }
    @SubscribeEvent
    public static void onRegisterBarrelRecipeEvent(RegistryEvent.Register<BarrelRecipe> event)
    {
        event.getRegistry().registerAll(
            new BarrelRecipe(IIngredient.of(MILK.get(),125), IIngredient.of("listAllmushroom"),null, new ItemStack(ItemRegistry.plainyogurtItem,1),8 * ICalendar.TICKS_IN_HOUR ).setRegistryName("plainyogurt"),
            new BarrelRecipe(IIngredient.of(MILK.get(),125), IIngredient.of("foodPlainyogurt"),null, new ItemStack(ItemRegistry.plainyogurtItem,2),8 * ICalendar.TICKS_IN_HOUR ).setRegistryName("plainyogurt_x2"),
            new BarrelRecipe(IIngredient.of(SALT_WATER.get(),250), IIngredient.of("cropSoybean"),null, new ItemStack(ItemRegistry.soysauceItem,1),4 * ICalendar.TICKS_IN_HOUR ).setRegistryName("soysauceitem"),

            new BarrelRecipe(IIngredient.of(BRINE.get(),125),IIngredient.of(CropRegistry.CUCUMBER,1),null, new ItemStack(ItemRegistry.picklesItem,1),8 * ICalendar.TICKS_IN_HOUR).setRegistryName("pickles"),
            BarrelRecipeFoodTraits.pickling(new IngredientItemFood(IIngredient.of("foodPickles"))).setRegistryName("pickling_pickles"),
            BarrelRecipeFoodTraits.brining(new IngredientItemFood(IIngredient.of("foodPickles"))).setRegistryName("brining_pickles"),
            BarrelRecipeFoodPreservation.vinegar(new IngredientItemFood(IIngredient.of("foodPickles"))).setRegistryName("vinegar_pickles"),
            new BarrelRecipe(IIngredient.of(BRINE.get(),125),IIngredient.of(ItemFoodTFC.get(Food.BEET),1),null, new ItemStack(ItemRegistry.pickledbeetsItem,1),8 * ICalendar.TICKS_IN_HOUR).setRegistryName("pickledbeets"),
            BarrelRecipeFoodTraits.pickling(new IngredientItemFood(IIngredient.of("foodPickledbeets"))).setRegistryName("pickling_pickledbeets"),
            BarrelRecipeFoodTraits.brining(new IngredientItemFood(IIngredient.of("foodPickledbeets"))).setRegistryName("brining_pickledbeets"),
            BarrelRecipeFoodPreservation.vinegar(new IngredientItemFood(IIngredient.of("foodPickledbeets"))).setRegistryName("vinegar_pickledbeets"),
            new BarrelRecipe(IIngredient.of(BRINE.get(),125),IIngredient.of(ItemFoodTFC.get(Food.ONION),1),null, new ItemStack(ItemRegistry.pickledonionsItem,1),8 * ICalendar.TICKS_IN_HOUR).setRegistryName("pickledonions"),
            BarrelRecipeFoodTraits.pickling(new IngredientItemFood(IIngredient.of("foodPickledonions"))).setRegistryName("pickling_pickledonions"),
            BarrelRecipeFoodTraits.brining(new IngredientItemFood(IIngredient.of("foodPickledonions"))).setRegistryName("brining_pickledonions"),
            BarrelRecipeFoodPreservation.vinegar(new IngredientItemFood(IIngredient.of("foodPickledonions"))).setRegistryName("vinegar_pickledonions")
        );
    }
    @SubscribeEvent
    public static void onRegisterKnappingRecipeEvent(RegistryEvent.Register<KnappingRecipe> event)
    {
        event.getRegistry().registerAll(
            new KnappingRecipeStone(KnappingType.STONE,a ->new ItemStack(ItemRegistry.bakewareItem,1),"X   X","XXXXX").setRegistryName("bakeware"),
            new KnappingRecipeStone(KnappingType.STONE,a ->new ItemStack(ItemRegistry.bakewareItem,2),"X   X","XXXXX","     ","X   X","XXXXX").setRegistryName("bakeware_two"),
            new KnappingRecipeStone(KnappingType.STONE,a ->new ItemStack(ItemRegistry.mortarandpestleItem,1),"X X X","X X X","X X X","X   X","XXXXX").setRegistryName("mortarandpestle"),
            new KnappingRecipeStone(KnappingType.STONE,a ->new ItemStack(ItemRegistry.juicerItem,1),"X X X","XXXXX").setRegistryName("juicer"),
            new KnappingRecipeStone(KnappingType.STONE,a ->new ItemStack(ItemRegistry.juicerItem,2),"X X X","XXXXX","     ","X X X","XXXXX").setRegistryName("juicer_two")
        );
    }
    @SubscribeEvent
    public static void onRegisterHeatRecipeEvent(RegistryEvent.Register<HeatRecipe> event) {
        IForgeRegistry<HeatRecipe> r = event.getRegistry();
        r.registerAll(
            new HeatRecipeSimple(IIngredient.of("cropPotato"),new ItemStack(Items.BAKED_POTATO),200,480).setRegistryName("cooked_potato"),
            new HeatRecipeSimple(IIngredient.of("cropSweetpotato"),new ItemStack(ItemRegistry.bakedsweetpotatoItem),200,480).setRegistryName("cooked_sweetpotato"),
            new HeatRecipeSimple(IIngredient.of("cropEggplant"),new ItemStack(ItemRegistry.grilledeggplantItem),200,480).setRegistryName("cooked_eggplant"),
            new HeatRecipeSimple(IIngredient.of("cropCorn"),new ItemStack(ItemRegistry.popcornItem,4),200,480).setRegistryName("popcorn"),
            new HeatRecipeSimple(IIngredient.of("foodTurkeyraw"),new ItemStack(ItemRegistry.turkeycookedItem,1),200,480).setRegistryName("cooked_turkey"),
            new HeatRecipeSimple(IIngredient.of("foodDuckraw"),new ItemStack(ItemRegistry.duckcookedItem,1),200,480).setRegistryName("cooked_duck"),

            HeatRecipe.destroy(IIngredient.of(Items.BAKED_POTATO), 480).setRegistryName("burned_potato"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.bakedsweetpotatoItem), 480).setRegistryName("burned_sweetpotato"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.grilledeggplantItem), 480).setRegistryName("burned_eggplant"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.turkeycookedItem), 480).setRegistryName("burned_turkey"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.duckcookedItem), 480).setRegistryName("burned_duck")
        );
    }
    @SubscribeEvent
    public static void onRegisterAnvilRecipeEvent(RegistryEvent.Register<AnvilRecipe> event)
    {
        IForgeRegistry<AnvilRecipe> r = event.getRegistry();

        addAnvil(r,"pot_copper", Metal.ItemType.INGOT,DefaultMetals.COPPER,new ItemStack(ItemRegistry.skilletItem), Metal.Tier.TIER_I, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.DRAW_ANY,ForgeRule.BEND_ANY);
        addAnvil(r,"pot_bronze", Metal.ItemType.INGOT,DefaultMetals.BRONZE,new ItemStack(ItemRegistry.skilletItem), Metal.Tier.TIER_II, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.DRAW_ANY,ForgeRule.BEND_ANY);
        addAnvil(r,"pot_bismuth_bronze", Metal.ItemType.INGOT,DefaultMetals.BISMUTH_BRONZE,new ItemStack(ItemRegistry.skilletItem), Metal.Tier.TIER_II, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.DRAW_ANY,ForgeRule.BEND_ANY);
        addAnvil(r,"pot_black_bronze", Metal.ItemType.INGOT,DefaultMetals.BLACK_BRONZE,new ItemStack(ItemRegistry.skilletItem), Metal.Tier.TIER_II, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.DRAW_ANY,ForgeRule.BEND_ANY);
        addAnvil(r,"pot_wrought_iron", Metal.ItemType.INGOT,DefaultMetals.WROUGHT_IRON,new ItemStack(ItemRegistry.skilletItem), Metal.Tier.TIER_III, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.DRAW_ANY,ForgeRule.BEND_ANY);
        addAnvil(r,"pot_steel", Metal.ItemType.INGOT,DefaultMetals.STEEL,new ItemStack(ItemRegistry.skilletItem), Metal.Tier.TIER_IV, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.DRAW_ANY,ForgeRule.BEND_ANY);

        addAnvil(r,"saucepan_copper", Metal.ItemType.INGOT,DefaultMetals.COPPER,new ItemStack(ItemRegistry.saucepanItem), Metal.Tier.TIER_I, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.BEND_SECOND_LAST,ForgeRule.BEND_THIRD_LAST);
        addAnvil(r,"saucepan_bronze", Metal.ItemType.INGOT,DefaultMetals.BRONZE,new ItemStack(ItemRegistry.saucepanItem), Metal.Tier.TIER_II, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.BEND_SECOND_LAST,ForgeRule.BEND_THIRD_LAST);
        addAnvil(r,"saucepan_bismuth_bronze", Metal.ItemType.INGOT,DefaultMetals.BISMUTH_BRONZE,new ItemStack(ItemRegistry.saucepanItem), Metal.Tier.TIER_II, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.BEND_SECOND_LAST,ForgeRule.BEND_THIRD_LAST);
        addAnvil(r,"saucepan_black_bronze", Metal.ItemType.INGOT,DefaultMetals.BLACK_BRONZE,new ItemStack(ItemRegistry.saucepanItem), Metal.Tier.TIER_II, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.BEND_SECOND_LAST,ForgeRule.BEND_THIRD_LAST);
        addAnvil(r,"saucepan_wrought_iron", Metal.ItemType.INGOT,DefaultMetals.WROUGHT_IRON,new ItemStack(ItemRegistry.saucepanItem), Metal.Tier.TIER_III, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.BEND_SECOND_LAST,ForgeRule.BEND_THIRD_LAST);
        addAnvil(r,"saucepan_steel", Metal.ItemType.INGOT,DefaultMetals.STEEL,new ItemStack(ItemRegistry.saucepanItem), Metal.Tier.TIER_IV, SmithingSkill.Type.GENERAL,ForgeRule.PUNCH_LAST,ForgeRule.BEND_SECOND_LAST,ForgeRule.BEND_THIRD_LAST);
    }
    @SubscribeEvent
    public static void onRegisterQuernRecipeEvent(RegistryEvent.Register<QuernRecipe> event){
        IForgeRegistry<QuernRecipe> r = event.getRegistry();
        r.registerAll(
            new QuernRecipe(IIngredient.of("cropPeppercorn"),new ItemStack(ItemRegistry.blackpepperItem, 4)).setRegistryName("blackpepperItem")
        );


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
            registry.remove(location);
            registry.register(DummyRecipe.from(recipe));
        } else {
            FMLLog.warning("Unable to find recipe for "+resourceLocationPath);
        }
    }
    //Code from TFC
    private static void addAnvil(IForgeRegistry<AnvilRecipe> registry, String recipeName, Metal.ItemType inputType, ResourceLocation inputMetalRes, ItemStack output, Metal.Tier tier, @Nullable SmithingSkill.Type skillType, ForgeRule... rules)
    {
        // Helper method for adding METAL -> STACK
        Metal inputMetal = TFCRegistries.METALS.getValue(inputMetalRes);
        if (inputMetal != null && !output.isEmpty())
        {
            ItemStack input = new ItemStack(ItemMetal.get(inputMetal, inputType));
            if (!input.isEmpty() && !output.isEmpty())
            {
                registry.register(new AnvilRecipe(new ResourceLocation(MODID, recipeName), IIngredient.of(input), output, tier, skillType, rules));
            }
        }
    }
}
