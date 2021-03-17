package hu.lebeg134.tfc_ph_compat.compat;

import com.eerussianguy.firmalife.init.FoodFL;
import com.eerussianguy.firmalife.recipe.DryingRecipe;
import com.eerussianguy.firmalife.recipe.OvenRecipe;
import com.eerussianguy.firmalife.registry.ItemsFL;
import com.pam.harvestcraft.item.ItemRegistry;
import hu.lebeg134.tfc_ph_compat.types.RecipeModifier;
import hu.lebeg134.tfc_ph_compat.util.agriculture.TPUncooked;
import hu.lebeg134.tfc_ph_compat.util.handlers.OreDictHandler;
import net.dries007.tfc.objects.inventory.ingredient.IIngredient;
import net.dries007.tfc.util.calendar.ICalendar;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

public class FirmaLifeCompat {
    public static void InitFirmaLife(){
        //OreDict addition

        OreDictionary.registerOre("cropPumpkin", new ItemStack(ItemsFL.getFood(FoodFL.PUMPKIN_CHUNKS)));
        OreDictionary.registerOre("cropPumpkin", new ItemStack(ItemsFL.getFood(FoodFL.PUMPKIN_SCOOPED)));
        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemsFL.getFood(FoodFL.PUMPKIN_CHUNKS)));
        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemsFL.getFood(FoodFL.PUMPKIN_SCOOPED)));
        OreDictionary.registerOre("foodChocolatebar", new ItemStack(ItemsFL.getFood(FoodFL.DARK_CHOCOLATE)));
        OreDictionary.registerOre("foodChocolatebar", new ItemStack(ItemsFL.getFood(FoodFL.MILK_CHOCOLATE)));
        OreDictionary.registerOre("foodCocoapowder", new ItemStack(ItemsFL.COCOA_POWDER));
        OreDictionary.registerOre("cropCinnamon", new ItemStack(ItemsFL.CINNAMON));
        OreDictionary.registerOre("foodGroundcinnamon", new ItemStack(ItemsFL.GROUND_CINNAMON));
        OreDictionary.registerOre("cropCoconut", new ItemStack(ItemsFL.getFood(FoodFL.COCONUT)));
        OreDictionary.registerOre("foodFlour", new ItemStack(ItemsFL.getFood(FoodFL.CHESTNUT_FLOUR)));
        OreDictionary.registerOre("foodDough", new ItemStack(ItemsFL.getFood(FoodFL.CHESTNUT_DOUGH)));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemsFL.getFood(FoodFL.CHESTNUT_BREAD)));
        OreDictionary.registerOre("bread", new ItemStack(ItemsFL.getFood(FoodFL.CHESTNUT_BREAD)));
        OreDictionary.registerOre("cropChestnut", new ItemStack(ItemsFL.getFood(FoodFL.CHESTNUTS)));
        OreDictionary.registerOre("foodRoastedchestnut", new ItemStack(ItemsFL.getFood(FoodFL.ROASTED_CHESTNUTS)));
        OreDictionary.registerOre("cropPecan", new ItemStack(ItemsFL.getFood(FoodFL.PECANS)));
        OreDictionary.registerOre("cropPineapple", new ItemStack(ItemsFL.getFood(FoodFL.PINEAPPLE_CHUNKS)));


        //OreDict remove
        OreDictHandler.removeAll(ItemRegistry.chocolatebarItem);
        OreDictHandler.removeAll(ItemRegistry.cocoapowderItem);
        OreDictHandler.removeAll(ItemRegistry.groundcinnamonItem);
    }
    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistryModifiable<IRecipe> recipeRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();

        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:driedsoupitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:coconutmilkitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:toastedcoconutitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:groundcinnamonitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:pinacoladaitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:chocolatebaritem_x4");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:raisinsitem");
    }
    @SubscribeEvent
    public static void onRegisterDryingRecipeEvent(RegistryEvent.Register<DryingRecipe> event)
    {
        int hour = ICalendar.TICKS_IN_HOUR;
        IForgeRegistry<DryingRecipe> r = event.getRegistry();
        r.registerAll(
                new DryingRecipe(IIngredient.of(ItemRegistry.stockItem), new ItemStack(ItemRegistry.driedsoupItem),24*hour).setRegistryName("dried_soup_drying2"),
                new DryingRecipe(IIngredient.of("cropGrape"),new ItemStack(ItemRegistry.raisinsItem), 24*hour).setRegistryName("raisins_drying2")
        );
    }
    @SubscribeEvent
    public static void onRegisterOvenRecipeEvent(RegistryEvent.Register<OvenRecipe> event) {
        IForgeRegistry<OvenRecipe> r = event.getRegistry();
        int hour = ICalendar.TICKS_IN_HOUR;
        r.registerAll(
                new OvenRecipe(IIngredient.of("foodUncookedanchovypepperonipizza"),  new ItemStack(TPUncooked.UNCOOKEDANCHOVYPEPPERONIPIZZAITEM.getItem()), 4*hour).setRegistryName("oven_anchovypepperonipizza"),
                new OvenRecipe(IIngredient.of("foodUncookedapplepie"),  new ItemStack(TPUncooked.UNCOOKEDAPPLEPIEITEM.getItem()), 4*hour).setRegistryName("oven_applepie"),
                new OvenRecipe(IIngredient.of("foodUncookedbbqchickenpizza"),  new ItemStack(TPUncooked.UNCOOKEDBBQCHICKENPIZZAITEM.getItem()), 4*hour).setRegistryName("oven_bbqchickenpizza"),
                new OvenRecipe(IIngredient.of("foodUncookedbiscuit"),  new ItemStack(TPUncooked.UNCOOKEDBISCUITITEM.getItem()), 4*hour).setRegistryName("oven_biscuit"),
                new OvenRecipe(IIngredient.of("foodUncookedblackberrycobbler"),  new ItemStack(TPUncooked.UNCOOKEDBLACKBERRYCOBBLERITEM.getItem()), 4*hour).setRegistryName("oven_blackberrycobbler"),
                new OvenRecipe(IIngredient.of("foodUncookedblueberrymuffin"),  new ItemStack(TPUncooked.UNCOOKEDBLUEBERRYMUFFINITEM.getItem()), 4*hour).setRegistryName("oven_blueberrymuffin"),
                new OvenRecipe(IIngredient.of("foodUncookedblueberrypie"),  new ItemStack(TPUncooked.UNCOOKEDBLUEBERRYPIEITEM.getItem()), 4*hour).setRegistryName("oven_blueberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedbriochebun"),  new ItemStack(TPUncooked.UNCOOKEDBRIOCHEBUNITEM.getItem()), 4*hour).setRegistryName("oven_briochebun"),
                new OvenRecipe(IIngredient.of("foodUncookedbuttercookie"),  new ItemStack(TPUncooked.UNCOOKEDBUTTERCOOKIEITEM.getItem()), 4*hour).setRegistryName("oven_buttercookie"),
                new OvenRecipe(IIngredient.of("foodUncookedbuttertart"),  new ItemStack(TPUncooked.UNCOOKEDBUTTERTARTITEM.getItem()), 4*hour).setRegistryName("oven_buttertart"),
                new OvenRecipe(IIngredient.of("foodUncookedcaramelcupcake"),  new ItemStack(TPUncooked.UNCOOKEDCARAMELCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_caramelcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedcarrotcupcake"),  new ItemStack(TPUncooked.UNCOOKEDCARROTCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_carrotcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedchaoscookie"),  new ItemStack(TPUncooked.UNCOOKEDCHAOSCOOKIEITEM.getItem()), 4*hour).setRegistryName("oven_chaoscookie"),
                new OvenRecipe(IIngredient.of("foodUncookedcherrypie"),  new ItemStack(TPUncooked.UNCOOKEDCHERRYPIEITEM.getItem()), 4*hour).setRegistryName("oven_cherrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedchickenpotpie"),  new ItemStack(TPUncooked.UNCOOKEDCHICKENPOTPIEITEM.getItem()), 4*hour).setRegistryName("oven_chickenpotpie"),
                new OvenRecipe(IIngredient.of("foodUncookedchilicupcake"),  new ItemStack(TPUncooked.UNCOOKEDCHILICUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_chilicupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedchocolatecupcake"),  new ItemStack(TPUncooked.UNCOOKEDCHOCOLATECUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_chocolatecupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedcinnamonbread"),  new ItemStack(TPUncooked.UNCOOKEDCINNAMONBREADITEM.getItem()), 4*hour).setRegistryName("oven_cinnamonbread"),
                new OvenRecipe(IIngredient.of("foodUncookedcinnamonroll"),  new ItemStack(TPUncooked.UNCOOKEDCINNAMONROLLITEM.getItem()), 4*hour).setRegistryName("oven_cinnamonroll"),
                new OvenRecipe(IIngredient.of("foodUncookedcoffeecupcake"),  new ItemStack(TPUncooked.UNCOOKEDCOFFEECUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_coffeecupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedcottagepie"),  new ItemStack(TPUncooked.UNCOOKEDCOTTAGEPIEITEM.getItem()), 4*hour).setRegistryName("oven_cottagepie"),
                new OvenRecipe(IIngredient.of("foodUncookedcracker"),  new ItemStack(TPUncooked.UNCOOKEDCRACKERITEM.getItem()), 4*hour).setRegistryName("oven_cracker"),
                new OvenRecipe(IIngredient.of("foodUncookedcrackers"),  new ItemStack(TPUncooked.UNCOOKEDCRACKERSITEM.getItem()), 4*hour).setRegistryName("oven_crackers"),
                new OvenRecipe(IIngredient.of("foodUncookedcroissant"),  new ItemStack(TPUncooked.UNCOOKEDCROISSANTITEM.getItem()), 4*hour).setRegistryName("oven_croissant"),
                new OvenRecipe(IIngredient.of("foodUncookeddamper"),  new ItemStack(TPUncooked.UNCOOKEDDAMPERITEM.getItem()), 4*hour).setRegistryName("oven_damper"),
                new OvenRecipe(IIngredient.of("foodUncookedeggtart"),  new ItemStack(TPUncooked.UNCOOKEDEGGTARTITEM.getItem()), 4*hour).setRegistryName("oven_eggtart"),
                new OvenRecipe(IIngredient.of("foodUncookedfruitcrumble"),  new ItemStack(TPUncooked.UNCOOKEDFRUITCRUMBLEITEM.getItem()), 4*hour).setRegistryName("oven_fruitcrumble"),
                new OvenRecipe(IIngredient.of("foodUncookedgingerbread"),  new ItemStack(TPUncooked.UNCOOKEDGINGERBREADITEM.getItem()), 4*hour).setRegistryName("oven_gingerbread"),
                new OvenRecipe(IIngredient.of("foodUncookedgingersnaps"),  new ItemStack(TPUncooked.UNCOOKEDGINGERSNAPSITEM.getItem()), 4*hour).setRegistryName("oven_gingersnaps"),
                new OvenRecipe(IIngredient.of("foodUncookedgooseberrypie"),  new ItemStack(TPUncooked.UNCOOKEDGOOSEBERRYPIEITEM.getItem()), 4*hour).setRegistryName("oven_gooseberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedhoneybun"),  new ItemStack(TPUncooked.UNCOOKEDHONEYBUNITEM.getItem()), 4*hour).setRegistryName("oven_honeybun"),
                new OvenRecipe(IIngredient.of("foodUncookedlemoncupcake"),  new ItemStack(TPUncooked.UNCOOKEDLEMONCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_lemoncupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedmeatpie"),  new ItemStack(TPUncooked.UNCOOKEDMEATPIEITEM.getItem()), 4*hour).setRegistryName("oven_meatpie"),
                new OvenRecipe(IIngredient.of("foodUncookedmincepie"),  new ItemStack(TPUncooked.UNCOOKEDMINCEPIEITEM.getItem()), 4*hour).setRegistryName("oven_mincepie"),
                new OvenRecipe(IIngredient.of("foodUncookedmintcupcake"),  new ItemStack(TPUncooked.UNCOOKEDMINTCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_mintcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedmochicake"),  new ItemStack(TPUncooked.UNCOOKEDMOCHICAKEITEM.getItem()), 4*hour).setRegistryName("oven_mochicake"),
                new OvenRecipe(IIngredient.of("foodUncookedpeachcobbleritem"),  new ItemStack(TPUncooked.UNCOOKEDPEACHCOBBLERITEM.getItem()), 4*hour).setRegistryName("oven_peachcobbleritem"),
                new OvenRecipe(IIngredient.of("foodUncookedpeanutbuttercookies"),  new ItemStack(TPUncooked.UNCOOKEDPEANUTBUTTERCOOKIESITEM.getItem()), 4*hour).setRegistryName("oven_peanutbuttercookies"),
                new OvenRecipe(IIngredient.of("foodUncookedpeanutbuttercupcake"),  new ItemStack(TPUncooked.UNCOOKEDPEANUTBUTTERCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_peanutbuttercupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedpizza"),  new ItemStack(TPUncooked.UNCOOKEDPIZZAITEM.getItem()), 4*hour).setRegistryName("oven_pizza"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinbread"),  new ItemStack(TPUncooked.UNCOOKEDPUMPKINBREADITEM.getItem()), 4*hour).setRegistryName("oven_pumpkinbread"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinmuffin"),  new ItemStack(TPUncooked.UNCOOKEDPUMPKINMUFFINITEM.getItem()), 4*hour).setRegistryName("oven_pumpkinmuffin"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinoatscones"),  new ItemStack(TPUncooked.UNCOOKEDPUMPKINOATSCONESITEM.getItem()), 4*hour).setRegistryName("oven_pumpkinoatscones"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinpie"),  new ItemStack(TPUncooked.UNCOOKEDPUMPKINPIEITEM.getItem()), 4*hour).setRegistryName("oven_pumpkinpie"),
                new OvenRecipe(IIngredient.of("foodUncookedraisincookiesitem"),  new ItemStack(TPUncooked.UNCOOKEDRAISINCOOKIESITEM.getItem()), 4*hour).setRegistryName("oven_raisincookiesitem"),
                new OvenRecipe(IIngredient.of("foodUncookedraspberrypie"),  new ItemStack(TPUncooked.UNCOOKEDRASPBERRYPIEITEM.getItem()), 4*hour).setRegistryName("oven_raspberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedredvelvetcupcake"),  new ItemStack(TPUncooked.UNCOOKEDREDVELVETCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_redvelvetcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedrivermudcake"),  new ItemStack(TPUncooked.UNCOOKEDRIVERMUDCAKEITEM.getItem()), 4*hour).setRegistryName("oven_rivermudcake"),
                new OvenRecipe(IIngredient.of("foodUncookedshepardspie"),  new ItemStack(TPUncooked.UNCOOKEDSHEPARDSPIEITEM.getItem()), 4*hour).setRegistryName("oven_shepardspie"),
                new OvenRecipe(IIngredient.of("foodUncookedsoftpretzel"),  new ItemStack(TPUncooked.UNCOOKEDSOFTPRETZELITEM.getItem()), 4*hour).setRegistryName("oven_softpretzel"),
                new OvenRecipe(IIngredient.of("foodUncookedspinachpie"),  new ItemStack(TPUncooked.UNCOOKEDSPINACHPIEITEM.getItem()), 4*hour).setRegistryName("oven_spinachpie"),
                new OvenRecipe(IIngredient.of("foodUncookedsprinklescupcake"),  new ItemStack(TPUncooked.UNCOOKEDSPRINKLESCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_sprinklescupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedstrawberrycupcake"),  new ItemStack(TPUncooked.UNCOOKEDSTRAWBERRYCUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_strawberrycupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedstrawberrypie"),  new ItemStack(TPUncooked.UNCOOKEDSTRAWBERRYPIEITEM.getItem()), 4*hour).setRegistryName("oven_strawberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedsugarcookie"),  new ItemStack(TPUncooked.UNCOOKEDSUGARCOOKIEITEM.getItem()), 4*hour).setRegistryName("oven_sugarcookie"),
                new OvenRecipe(IIngredient.of("foodUncookedsunflowerwheatrolls"),  new ItemStack(TPUncooked.UNCOOKEDSUNFLOWERWHEATROLLSITEM.getItem()), 4*hour).setRegistryName("oven_sunflowerwheatrolls"),
                new OvenRecipe(IIngredient.of("foodUncookedsweetpotatopie"),  new ItemStack(TPUncooked.UNCOOKEDSWEETPOTATOPIEITEM.getItem()), 4*hour).setRegistryName("oven_sweetpotatopie"),
                new OvenRecipe(IIngredient.of("foodUncookedtimpano"),  new ItemStack(TPUncooked.UNCOOKEDTIMPANOITEM.getItem()), 4*hour).setRegistryName("oven_timpano"),
                new OvenRecipe(IIngredient.of("foodUncookedtiropita"),  new ItemStack(TPUncooked.UNCOOKEDTIROPITAITEM.getItem()), 4*hour).setRegistryName("oven_tiropita"),
                new OvenRecipe(IIngredient.of("foodUncookedtoast"),  new ItemStack(TPUncooked.UNCOOKEDTOASTITEM.getItem()), 4*hour).setRegistryName("oven_toast"),
                new OvenRecipe(IIngredient.of("foodUncookedvanillacupcake"),  new ItemStack(TPUncooked.UNCOOKEDVANILLACUPCAKEITEM.getItem()), 4*hour).setRegistryName("oven_vanillacupcake")

                );

    }
}
