package hu.lebeg134.tfc_ph_compat.types;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.item.DummyRecipe;
import com.pam.harvestcraft.item.ItemRegistry;
import hu.lebeg134.tfc_ph_compat.TFC_PH_Compat;
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
import net.dries007.tfc.types.DefaultMetals;
import net.dries007.tfc.util.agriculture.Food;
import net.dries007.tfc.util.calendar.ICalendar;
import net.dries007.tfc.util.forge.ForgeRule;
import net.dries007.tfc.util.skills.SmithingSkill;
import net.minecraft.init.Items;
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

import static hu.lebeg134.tfc_ph_compat.Reference.MODID;
import static net.dries007.tfc.objects.fluids.FluidsTFC.*;

@Mod.EventBusSubscriber
public class RecipeModifier {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        IForgeRegistryModifiable<IRecipe> recipeRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
        //setting containeritems
        ItemsTFC.FIRED_POT.setContainerItem(ItemsTFC.FIRED_POT);

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
        if (!TFC_PH_Compat.config.enableCakes){
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
        }
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
        dummyOutRecipe(recipeRegistry, "harvestcraft:minecraft_bread");
        dummyOutRecipe(recipeRegistry, "harvestcraft:minecraft_bakedpotato");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fish_0");

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
        dummyOutRecipe(recipeRegistry, "harvestcraft:toastedsesameseedsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grilledmushroomitem_cropWhitemushroom");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grilledmushroomitem_listAllmushroom");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grilledmushroomitem_minecraft_brown_mushroom");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grilledmushroomitem_minecraft_red_mushroom");
        dummyOutRecipe(recipeRegistry, "harvestcraft:roastedpumpkinseedsitem");

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

        //Uncooked item heat replacement removal (has duplicates with complex recipe removal)
        dummyOutRecipe(recipeRegistry, "harvestcraft:anchovypepperonipizzaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:applepieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:bbqchickenpizzaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:biscuititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:blackberrycobbleritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:blueberrymuffinitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:blueberrypieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:briochebunitem_x3");
        dummyOutRecipe(recipeRegistry, "harvestcraft:buttercookieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:buttertartitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:caramelcupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:carrotcupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chaoscookieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cherrypieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chickenpotpieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chilicupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:chocolatecupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cinnamonbreaditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cinnamonrollitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:coffeecupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:cottagepieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:crackeritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:crackersitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:croissantitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:damperitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:damperitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:damperitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:eggtartitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fruitcrumbleitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:garlicchickenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gingerbreaditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gingersnapsitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:gooseberrypieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeybunitem_dropHoney");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeybunitem_foodHoneydrop");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeylemonlambitem_dropHoney");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeylemonlambitem_foodHoneydrop");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeysoyribsitem_dropHoney");
        dummyOutRecipe(recipeRegistry, "harvestcraft:honeysoyribsitem_foodHoneydrop");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lambwithmintsauceitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lemonchickenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:lemoncupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:meatpieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mincepieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mintcupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:mochicakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:orangeduckitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peachcobbleritem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peanutbuttercookiesitem - Copy (2)");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peanutbuttercookiesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:peanutbuttercupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pekingduckitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzaitem_foodPepperoni");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pizzaitem_listAllporkraw");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pumpkinbreaditem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pumpkinmuffinitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:pumpkinoatsconesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:raisincookiesitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:raspberrypieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:redvelvetcupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:ricecakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:rivermudcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:roastchickenitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:roastchickenitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:roastchickenitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:roastpotatoesitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:roastpotatoesitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:roastpotatoesitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:salisburysteakitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:shepardspieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:softpretzelitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:softpretzelitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:softpretzelitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:spinachpieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sprinklescupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:strawberrycupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:strawberrypieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:stuffedduckitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sugarcookieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sunflowerwheatrollsitem_dustSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sunflowerwheatrollsitem_foodSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sunflowerwheatrollsitem_itemSalt");
        dummyOutRecipe(recipeRegistry, "harvestcraft:sweetpotatopieitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:timpanoitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tiropitaitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:toastitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tomatoherbchickenitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:vanillacupcakeitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:minecraft_pumpkinpie");


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
            new HeatRecipeSimple(IIngredient.of("cropSesame"),new ItemStack(ItemRegistry.toastedsesameseedsItem,1),200,480).setRegistryName("toasted_sesameseeds"),
            new HeatRecipeSimple(IIngredient.of("listAllmushroom"),new ItemStack(ItemRegistry.grilledmushroomItem,1),200,480).setRegistryName("grilled_mushroom"),
            new HeatRecipeSimple(IIngredient.of("foodTurkeyraw"),new ItemStack(ItemRegistry.turkeycookedItem,1),200,480).setRegistryName("cooked_turkey"),
            new HeatRecipeSimple(IIngredient.of("foodDuckraw"),new ItemStack(ItemRegistry.duckcookedItem,1),200,480).setRegistryName("cooked_duck"),
            //uncooked item cooking recipes
            new HeatRecipeSimple(IIngredient.of("foodUncookedgarlicchicken"),new ItemStack(ItemRegistry.garlicchickenItem,1),200,480).setRegistryName("uncookedgarlicchicken"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedhoneylemonlamb"),new ItemStack(ItemRegistry.honeylemonlambItem,1),200,480).setRegistryName("uncookedhoneylemonlamb"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedhoneysoyribs"),new ItemStack(ItemRegistry.honeysoyribsItem,1),200,480).setRegistryName("uncookedhoneysoyribs"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedlambwithmintsauce"),new ItemStack(ItemRegistry.lambwithmintsauceItem,1),200,480).setRegistryName("uncookedlambwithmintsauce"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedlemonchicken"),new ItemStack(ItemRegistry.lemonchickenItem,1),200,480).setRegistryName("uncookedlemonchicken"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedorangeduck"),new ItemStack(ItemRegistry.orangeduckItem,1),200,480).setRegistryName("uncookedorangeduck"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedpekingduck"),new ItemStack(ItemRegistry.pekingduckItem,1),200,480).setRegistryName("uncookedpekingduck"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedroastchicken"),new ItemStack(ItemRegistry.roastchickenItem,1),200,480).setRegistryName("uncookedroastchicken"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedroastpotatoes"),new ItemStack(ItemRegistry.roastpotatoesItem,1),200,480).setRegistryName("uncookedroastpotatoes"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedsalisburysteak"),new ItemStack(ItemRegistry.salisburysteakItem,1),200,480).setRegistryName("uncookedsalisburysteak"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedstuffedduck"),new ItemStack(ItemRegistry.stuffedduckItem,1),200,480).setRegistryName("uncookedstuffedduck"),
            new HeatRecipeSimple(IIngredient.of("foodUncookedtomatoherbchicken"),new ItemStack(ItemRegistry.tomatoherbchickenItem,1),200,480).setRegistryName("uncookedtomatoherbchicken"),

            new HeatRecipeSimple(IIngredient.of("cropRice"), new ItemStack(ItemRegistry.ricecakeItem, 1), 200, 480).setRegistryName("ricecake"),

            HeatRecipe.destroy(IIngredient.of(Items.BAKED_POTATO), 480).setRegistryName("burned_potato"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.bakedsweetpotatoItem), 480).setRegistryName("burned_sweetpotato"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.grilledeggplantItem), 480).setRegistryName("burned_eggplant"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.popcornItem), 480).setRegistryName("burned_popcorn"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.toastedsesameseedsItem), 480).setRegistryName("burned_sesameseeds"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.grilledmushroomItem), 480).setRegistryName("burned_mushroom"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.turkeycookedItem), 480).setRegistryName("burned_turkey"),
            HeatRecipe.destroy(IIngredient.of(ItemRegistry.duckcookedItem), 480).setRegistryName("burned_duck"),

            //new cooked recipe burnt items
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.anchovypepperonipizzaItem), 480).setRegistryName("burned_anchovypepperonipizza"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.applepieItem), 480).setRegistryName("burned_applepie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.bbqchickenpizzaItem), 480).setRegistryName("burned_bbqchickenpizza"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.biscuitItem), 480).setRegistryName("burned_biscuit"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.blackberrycobblerItem), 480).setRegistryName("burned_blackberrycobbler"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.blueberrymuffinItem), 480).setRegistryName("burned_blueberrymuffin"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.blueberrypieItem), 480).setRegistryName("burned_blueberrypie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.briochebunItem), 480).setRegistryName("burned_briochebun"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.buttercookieItem), 480).setRegistryName("burned_buttercookie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.buttertartItem), 480).setRegistryName("burned_buttertart"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.caramelcupcakeItem), 480).setRegistryName("burned_caramelcupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.carrotcupcakeItem), 480).setRegistryName("burned_carrotcupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.chaoscookieItem), 480).setRegistryName("burned_chaoscookie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.cherrypieItem), 480).setRegistryName("burned_cherrypie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.chickenpotpieItem), 480).setRegistryName("burned_chickenpotpie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.chilicupcakeItem), 480).setRegistryName("burned_chilicupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.chocolatecupcakeItem), 480).setRegistryName("burned_chocolatecupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.cinnamonbreadItem), 480).setRegistryName("burned_cinnamonbread"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.cinnamonrollItem), 480).setRegistryName("burned_cinnamonroll"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.coffeecupcakeItem), 480).setRegistryName("burned_coffeecupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.cottagepieItem), 480).setRegistryName("burned_cottagepie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.crackerItem), 480).setRegistryName("burned_cracker"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.crackersItem), 480).setRegistryName("burned_crackers"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.croissantItem), 480).setRegistryName("burned_croissant"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.damperItem), 480).setRegistryName("burned_damper"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.eggtartItem), 480).setRegistryName("burned_eggtart"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.fruitcrumbleItem), 480).setRegistryName("burned_fruitcrumble"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.garlicchickenItem), 480).setRegistryName("burned_garlicchicken"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.gingerbreadItem), 480).setRegistryName("burned_gingerbread"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.gingersnapsItem), 480).setRegistryName("burned_gingersnaps"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.gooseberrypieItem), 480).setRegistryName("burned_gooseberrypie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.honeybunItem), 480).setRegistryName("burned_honeybun"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.honeylemonlambItem), 480).setRegistryName("burned_honeylemonlamb"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.honeysoyribsItem), 480).setRegistryName("burned_honeysoyribs"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.lambwithmintsauceItem), 480).setRegistryName("burned_lambwithmintsauce"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.lemonchickenItem), 480).setRegistryName("burned_lemonchicken"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.lemoncupcakeItem), 480).setRegistryName("burned_lemoncupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.meatpieItem), 480).setRegistryName("burned_meatpie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.mincepieItem), 480).setRegistryName("burned_mincepie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.mintcupcakeItem), 480).setRegistryName("burned_mintcupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.mochicakeItem), 480).setRegistryName("burned_mochicake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.orangeduckItem), 480).setRegistryName("burned_orangeduck"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.peachcobblerItem), 480).setRegistryName("burned_peachcobbleritem"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.peanutbuttercookiesItem), 480).setRegistryName("burned_peanutbuttercookies"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.peanutbuttercupcakeItem), 480).setRegistryName("burned_peanutbuttercupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.pekingduckItem), 480).setRegistryName("burned_pekingduck"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.pizzaItem), 480).setRegistryName("burned_pizza"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.pumpkinbreadItem), 480).setRegistryName("burned_pumpkinbread"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.pumpkinmuffinItem), 480).setRegistryName("burned_pumpkinmuffin"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.pumpkinoatsconesItem), 480).setRegistryName("burned_pumpkinoatscones"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.pumpkinpieItem), 480).setRegistryName("burned_pumpkinpie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.raisincookiesItem), 480).setRegistryName("burned_raisincookiesitem"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.raspberrypieItem), 480).setRegistryName("burned_raspberrypie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.redvelvetcupcakeItem), 480).setRegistryName("burned_redvelvetcupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.ricecakeItem), 480).setRegistryName("burned_ricecake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.rivermudcakeItem), 480).setRegistryName("burned_rivermudcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.roastchickenItem), 480).setRegistryName("burned_roastchicken"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.roastpotatoesItem), 480).setRegistryName("burned_roastpotatoes"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.salisburysteakItem), 480).setRegistryName("burned_salisburysteak"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.shepardspieItem), 480).setRegistryName("burned_shepardspie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.softpretzelItem), 480).setRegistryName("burned_softpretzel"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.spinachpieItem), 480).setRegistryName("burned_spinachpie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.sprinklescupcakeItem), 480).setRegistryName("burned_sprinklescupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.strawberrycupcakeItem), 480).setRegistryName("burned_strawberrycupcake"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.strawberrypieItem), 480).setRegistryName("burned_strawberrypie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.stuffedduckItem), 480).setRegistryName("burned_stuffedduck"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.sugarcookieItem), 480).setRegistryName("burned_sugarcookie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.sunflowerwheatrollsItem), 480).setRegistryName("burned_sunflowerwheatrolls"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.sweetpotatopieItem), 480).setRegistryName("burned_sweetpotatopie"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.timpanoItem), 480).setRegistryName("burned_timpano"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.tiropitaItem), 480).setRegistryName("burned_tiropita"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.toastItem), 480).setRegistryName("burned_toast"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.tomatoherbchickenItem), 480).setRegistryName("burned_tomatoherbchicken"),
                HeatRecipe.destroy(IIngredient.of(ItemRegistry.vanillacupcakeItem), 480).setRegistryName("burned_vanillacupcake")


                );
        if (!((TFC_PH_Compat.FirmaLifeAdded&& TFC_PH_Compat.config.detectOtherModCompat)|| TFC_PH_Compat.config.manualFirmaLifeCompat)){
            r.registerAll(
                    new HeatRecipeSimple(IIngredient.of("foodUncookedanchovypepperonipizza"),new ItemStack(ItemRegistry.anchovypepperonipizzaItem,1),200,480).setRegistryName("uncookedanchovypepperonipizza"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedapplepie"),new ItemStack(ItemRegistry.applepieItem,1),200,480).setRegistryName("uncookedapplepie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedbbqchickenpizza"),new ItemStack(ItemRegistry.bbqchickenpizzaItem,1),200,480).setRegistryName("uncookedbbqchickenpizza"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedbiscuit"),new ItemStack(ItemRegistry.biscuitItem,1),200,480).setRegistryName("uncookedbiscuit"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedblackberrycobbler"),new ItemStack(ItemRegistry.blackberrycobblerItem,1),200,480).setRegistryName("uncookedblackberrycobbler"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedblueberrymuffin"),new ItemStack(ItemRegistry.blueberrymuffinItem,1),200,480).setRegistryName("uncookedblueberrymuffin"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedblueberrypie"),new ItemStack(ItemRegistry.blueberrypieItem,1),200,480).setRegistryName("uncookedblueberrypie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedbriochebun"),new ItemStack(ItemRegistry.briochebunItem,1),200,480).setRegistryName("uncookedbriochebun"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedbuttercookie"),new ItemStack(ItemRegistry.buttercookieItem,1),200,480).setRegistryName("uncookedbuttercookie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedbuttertart"),new ItemStack(ItemRegistry.buttertartItem,1),200,480).setRegistryName("uncookedbuttertart"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcaramelcupcake"),new ItemStack(ItemRegistry.caramelcupcakeItem,1),200,480).setRegistryName("uncookedcaramelcupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcarrotcupcake"),new ItemStack(ItemRegistry.carrotcupcakeItem,1),200,480).setRegistryName("uncookedcarrotcupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedchaoscookie"),new ItemStack(ItemRegistry.chaoscookieItem,1),200,480).setRegistryName("uncookedchaoscookie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcherrypie"),new ItemStack(ItemRegistry.cherrypieItem,1),200,480).setRegistryName("uncookedcherrypie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedchickenpotpie"),new ItemStack(ItemRegistry.chickenpotpieItem,1),200,480).setRegistryName("uncookedchickenpotpie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedchilicupcake"),new ItemStack(ItemRegistry.chilicupcakeItem,1),200,480).setRegistryName("uncookedchilicupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedchocolatecupcake"),new ItemStack(ItemRegistry.chocolatecupcakeItem,1),200,480).setRegistryName("uncookedchocolatecupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcinnamonbread"),new ItemStack(ItemRegistry.cinnamonbreadItem,1),200,480).setRegistryName("uncookedcinnamonbread"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcinnamonroll"),new ItemStack(ItemRegistry.cinnamonrollItem,1),200,480).setRegistryName("uncookedcinnamonroll"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcoffeecupcake"),new ItemStack(ItemRegistry.coffeecupcakeItem,1),200,480).setRegistryName("uncookedcoffeecupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcottagepie"),new ItemStack(ItemRegistry.cottagepieItem,1),200,480).setRegistryName("uncookedcottagepie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcracker"),new ItemStack(ItemRegistry.crackerItem,1),200,480).setRegistryName("uncookedcracker"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcrackers"),new ItemStack(ItemRegistry.crackersItem,1),200,480).setRegistryName("uncookedcrackers"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedcroissant"),new ItemStack(ItemRegistry.croissantItem,1),200,480).setRegistryName("uncookedcroissant"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookeddamper"),new ItemStack(ItemRegistry.damperItem,1),200,480).setRegistryName("uncookeddamper"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedeggtart"),new ItemStack(ItemRegistry.eggtartItem,1),200,480).setRegistryName("uncookedeggtart"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedfruitcrumble"),new ItemStack(ItemRegistry.fruitcrumbleItem,1),200,480).setRegistryName("uncookedfruitcrumble"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedgingerbread"),new ItemStack(ItemRegistry.gingerbreadItem,1),200,480).setRegistryName("uncookedgingerbread"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedgingersnaps"),new ItemStack(ItemRegistry.gingersnapsItem,1),200,480).setRegistryName("uncookedgingersnaps"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedgooseberrypie"),new ItemStack(ItemRegistry.gooseberrypieItem,1),200,480).setRegistryName("uncookedgooseberrypie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedhoneybun"),new ItemStack(ItemRegistry.honeybunItem,1),200,480).setRegistryName("uncookedhoneybun"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedlemoncupcake"),new ItemStack(ItemRegistry.lemoncupcakeItem,1),200,480).setRegistryName("uncookedlemoncupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedmeatpie"),new ItemStack(ItemRegistry.meatpieItem,1),200,480).setRegistryName("uncookedmeatpie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedmincepie"),new ItemStack(ItemRegistry.mincepieItem,1),200,480).setRegistryName("uncookedmincepie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedmintcupcake"),new ItemStack(ItemRegistry.mintcupcakeItem,1),200,480).setRegistryName("uncookedmintcupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedmochicake"),new ItemStack(ItemRegistry.mochicakeItem,1),200,480).setRegistryName("uncookedmochicake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpeachcobbleritem"),new ItemStack(ItemRegistry.peachcobblerItem,1),200,480).setRegistryName("uncookedpeachcobbleritem"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpeanutbuttercookies"),new ItemStack(ItemRegistry.peanutbuttercookiesItem,1),200,480).setRegistryName("uncookedpeanutbuttercookies"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpeanutbuttercupcake"),new ItemStack(ItemRegistry.peanutbuttercupcakeItem,1),200,480).setRegistryName("uncookedpeanutbuttercupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpizza"),new ItemStack(ItemRegistry.pizzaItem,1),200,480).setRegistryName("uncookedpizza"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpumpkinbread"),new ItemStack(ItemRegistry.pumpkinbreadItem,1),200,480).setRegistryName("uncookedpumpkinbread"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpumpkinmuffin"),new ItemStack(ItemRegistry.pumpkinmuffinItem,1),200,480).setRegistryName("uncookedpumpkinmuffin"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpumpkinoatscones"),new ItemStack(ItemRegistry.pumpkinoatsconesItem,1),200,480).setRegistryName("uncookedpumpkinoatscones"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedpumpkinpie"),new ItemStack(ItemRegistry.pumpkinpieItem,1),200,480).setRegistryName("uncookedpumpkinpie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedraisincookiesitem"),new ItemStack(ItemRegistry.raisincookiesItem,1),200,480).setRegistryName("uncookedraisincookiesitem"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedraspberrypie"),new ItemStack(ItemRegistry.raspberrypieItem,1),200,480).setRegistryName("uncookedraspberrypie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedredvelvetcupcake"),new ItemStack(ItemRegistry.redvelvetcupcakeItem,1),200,480).setRegistryName("uncookedredvelvetcupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedrivermudcake"),new ItemStack(ItemRegistry.rivermudcakeItem,1),200,480).setRegistryName("uncookedrivermudcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedshepardspie"),new ItemStack(ItemRegistry.shepardspieItem,1),200,480).setRegistryName("uncookedshepardspie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedsoftpretzel"),new ItemStack(ItemRegistry.softpretzelItem,1),200,480).setRegistryName("uncookedsoftpretzel"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedspinachpie"),new ItemStack(ItemRegistry.spinachpieItem,1),200,480).setRegistryName("uncookedspinachpie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedsprinklescupcake"),new ItemStack(ItemRegistry.sprinklescupcakeItem,1),200,480).setRegistryName("uncookedsprinklescupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedstrawberrycupcake"),new ItemStack(ItemRegistry.strawberrycupcakeItem,1),200,480).setRegistryName("uncookedstrawberrycupcake"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedstrawberrypie"),new ItemStack(ItemRegistry.strawberrypieItem,1),200,480).setRegistryName("uncookedstrawberrypie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedsugarcookie"),new ItemStack(ItemRegistry.sugarcookieItem,1),200,480).setRegistryName("uncookedsugarcookie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedsunflowerwheatrolls"),new ItemStack(ItemRegistry.sunflowerwheatrollsItem,1),200,480).setRegistryName("uncookedsunflowerwheatrolls"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedsweetpotatopie"),new ItemStack(ItemRegistry.sweetpotatopieItem,1),200,480).setRegistryName("uncookedsweetpotatopie"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedtimpano"),new ItemStack(ItemRegistry.timpanoItem,1),200,480).setRegistryName("uncookedtimpano"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedtiropita"),new ItemStack(ItemRegistry.tiropitaItem,1),200,480).setRegistryName("uncookedtiropita"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedtoast"),new ItemStack(ItemRegistry.toastItem,1),200,480).setRegistryName("uncookedtoast"),
                    new HeatRecipeSimple(IIngredient.of("foodUncookedvanillacupcake"),new ItemStack(ItemRegistry.vanillacupcakeItem,1),200,480).setRegistryName("uncookedvanillacupcake")
                    );
        }
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
    public static void onRegisterQuernRecipeEvent(RegistryEvent.Register<QuernRecipe> event)
    {
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
