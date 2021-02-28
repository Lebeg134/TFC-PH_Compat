package hu.lebeg134.tpc.types;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.item.DummyRecipe;
import com.pam.harvestcraft.item.ItemRegistry;
import net.dries007.tfc.api.recipes.anvil.AnvilRecipe;
import net.dries007.tfc.api.recipes.barrel.BarrelRecipe;
import net.dries007.tfc.api.recipes.barrel.BarrelRecipeFoodPreservation;
import net.dries007.tfc.api.recipes.barrel.BarrelRecipeFoodTraits;
import net.dries007.tfc.api.recipes.knapping.KnappingRecipe;
import net.dries007.tfc.api.recipes.knapping.KnappingRecipeStone;
import net.dries007.tfc.api.recipes.knapping.KnappingType;
import net.dries007.tfc.api.registries.TFCRegistries;
import net.dries007.tfc.api.types.Metal;
import net.dries007.tfc.objects.inventory.ingredient.IIngredient;
import net.dries007.tfc.objects.inventory.ingredient.IngredientItemFood;
import net.dries007.tfc.objects.items.food.ItemFoodTFC;
import net.dries007.tfc.objects.items.metal.ItemMetal;
import net.dries007.tfc.types.DefaultMetals;
import net.dries007.tfc.util.agriculture.Food;
import net.dries007.tfc.util.calendar.ICalendar;
import net.dries007.tfc.util.forge.ForgeRule;
import net.dries007.tfc.util.skills.SmithingSkill;
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
import static net.dries007.tfc.objects.fluids.FluidsTFC.BRINE;

@Mod.EventBusSubscriber
public class RecipeModifier {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        IForgeRegistryModifiable<IRecipe> recipeRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
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
        dummyOutRecipe(recipeRegistry, "harvestcraft:fruitbaititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:grainbaititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:veggiebaititem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:fishtrapbaititem");

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
        dummyOutRecipe(recipeRegistry, "harvestcraft:plainyogurtitem_x4");
        dummyOutRecipe(recipeRegistry, "harvestcraft:plainyogurtitem_x4 - Copy");
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
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_skilletitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_saucepanitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_bakewareitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_mortarandpestleitem");
        dummyOutRecipe(recipeRegistry, "harvestcraft:tool_juiceritem");


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





    }
    @SubscribeEvent
    public static void onRegisterBarrelRecipeEvent(RegistryEvent.Register<BarrelRecipe> event)
    {
        event.getRegistry().registerAll(
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
