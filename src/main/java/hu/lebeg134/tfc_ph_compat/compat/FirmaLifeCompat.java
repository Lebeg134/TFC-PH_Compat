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
        OreDictionary.registerOre("cropMelon", new ItemStack(ItemsFL.getFood(FoodFL.MELON)));


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
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:roastedchestnutitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:melonjuiceitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:melonsmoothieitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:melonyogurtitem");
        RecipeModifier.dummyOutRecipe(recipeRegistry, "harvestcraft:watermelonjellyitem");
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
                new OvenRecipe(IIngredient.of("foodUncookedanchovypepperonipizza"),  new ItemStack(ItemRegistry.anchovypepperonipizzaItem), 4*hour).setRegistryName("oven_anchovypepperonipizza"),
                new OvenRecipe(IIngredient.of("foodUncookedapplepie"),  new ItemStack(ItemRegistry.applepieItem), 4*hour).setRegistryName("oven_applepie"),
                new OvenRecipe(IIngredient.of("foodUncookedbbqchickenpizza"),  new ItemStack(ItemRegistry.bbqchickenpizzaItem), 4*hour).setRegistryName("oven_bbqchickenpizza"),
                new OvenRecipe(IIngredient.of("foodUncookedbiscuit"),  new ItemStack(ItemRegistry.biscuitItem), 4*hour).setRegistryName("oven_biscuit"),
                new OvenRecipe(IIngredient.of("foodUncookedblackberrycobbler"),  new ItemStack(ItemRegistry.blackberrycobblerItem), 4*hour).setRegistryName("oven_blackberrycobbler"),
                new OvenRecipe(IIngredient.of("foodUncookedblueberrymuffin"),  new ItemStack(ItemRegistry.blueberrymuffinItem), 4*hour).setRegistryName("oven_blueberrymuffin"),
                new OvenRecipe(IIngredient.of("foodUncookedblueberrypie"),  new ItemStack(ItemRegistry.blueberrypieItem), 4*hour).setRegistryName("oven_blueberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedbriochebun"),  new ItemStack(ItemRegistry.briochebunItem), 4*hour).setRegistryName("oven_briochebun"),
                new OvenRecipe(IIngredient.of("foodUncookedbuttercookie"),  new ItemStack(ItemRegistry.buttercookieItem), 4*hour).setRegistryName("oven_buttercookie"),
                new OvenRecipe(IIngredient.of("foodUncookedbuttertart"),  new ItemStack(ItemRegistry.buttertartItem), 4*hour).setRegistryName("oven_buttertart"),
                new OvenRecipe(IIngredient.of("foodUncookedcaramelcupcake"),  new ItemStack(ItemRegistry.caramelcupcakeItem), 4*hour).setRegistryName("oven_caramelcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedcarrotcupcake"),  new ItemStack(ItemRegistry.carrotcupcakeItem), 4*hour).setRegistryName("oven_carrotcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedchaoscookie"),  new ItemStack(ItemRegistry.chaoscookieItem), 4*hour).setRegistryName("oven_chaoscookie"),
                new OvenRecipe(IIngredient.of("foodUncookedcherrypie"),  new ItemStack(ItemRegistry.cherrypieItem), 4*hour).setRegistryName("oven_cherrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedchickenpotpie"),  new ItemStack(ItemRegistry.chickenpotpieItem), 4*hour).setRegistryName("oven_chickenpotpie"),
                new OvenRecipe(IIngredient.of("foodUncookedchilicupcake"),  new ItemStack(ItemRegistry.chilicupcakeItem), 4*hour).setRegistryName("oven_chilicupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedchocolatecupcake"),  new ItemStack(ItemRegistry.chocolatecupcakeItem), 4*hour).setRegistryName("oven_chocolatecupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedcinnamonbread"),  new ItemStack(ItemRegistry.cinnamonbreadItem), 4*hour).setRegistryName("oven_cinnamonbread"),
                new OvenRecipe(IIngredient.of("foodUncookedcinnamonroll"),  new ItemStack(ItemRegistry.cinnamonrollItem), 4*hour).setRegistryName("oven_cinnamonroll"),
                new OvenRecipe(IIngredient.of("foodUncookedcoffeecupcake"),  new ItemStack(ItemRegistry.coffeecupcakeItem), 4*hour).setRegistryName("oven_coffeecupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedcottagepie"),  new ItemStack(ItemRegistry.cottagepieItem), 4*hour).setRegistryName("oven_cottagepie"),
                new OvenRecipe(IIngredient.of("foodUncookedcracker"),  new ItemStack(ItemRegistry.crackerItem), 4*hour).setRegistryName("oven_cracker"),
                new OvenRecipe(IIngredient.of("foodUncookedcrackers"),  new ItemStack(ItemRegistry.crackersItem), 4*hour).setRegistryName("oven_crackers"),
                new OvenRecipe(IIngredient.of("foodUncookedcroissant"),  new ItemStack(ItemRegistry.croissantItem), 4*hour).setRegistryName("oven_croissant"),
                new OvenRecipe(IIngredient.of("foodUncookeddamper"),  new ItemStack(ItemRegistry.damperItem), 4*hour).setRegistryName("oven_damper"),
                new OvenRecipe(IIngredient.of("foodUncookedeggtart"),  new ItemStack(ItemRegistry.eggtartItem), 4*hour).setRegistryName("oven_eggtart"),
                new OvenRecipe(IIngredient.of("foodUncookedfruitcrumble"),  new ItemStack(ItemRegistry.fruitcrumbleItem), 4*hour).setRegistryName("oven_fruitcrumble"),
                new OvenRecipe(IIngredient.of("foodUncookedgingerbread"),  new ItemStack(ItemRegistry.gingerbreadItem), 4*hour).setRegistryName("oven_gingerbread"),
                new OvenRecipe(IIngredient.of("foodUncookedgingersnaps"),  new ItemStack(ItemRegistry.gingersnapsItem), 4*hour).setRegistryName("oven_gingersnaps"),
                new OvenRecipe(IIngredient.of("foodUncookedgooseberrypie"),  new ItemStack(ItemRegistry.gooseberrypieItem), 4*hour).setRegistryName("oven_gooseberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedhoneybun"),  new ItemStack(ItemRegistry.honeybunItem), 4*hour).setRegistryName("oven_honeybun"),
                new OvenRecipe(IIngredient.of("foodUncookedlemoncupcake"),  new ItemStack(ItemRegistry.lemoncupcakeItem), 4*hour).setRegistryName("oven_lemoncupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedmeatpie"),  new ItemStack(ItemRegistry.meatpieItem), 4*hour).setRegistryName("oven_meatpie"),
                new OvenRecipe(IIngredient.of("foodUncookedmincepie"),  new ItemStack(ItemRegistry.mincepieItem), 4*hour).setRegistryName("oven_mincepie"),
                new OvenRecipe(IIngredient.of("foodUncookedmintcupcake"),  new ItemStack(ItemRegistry.mintcupcakeItem), 4*hour).setRegistryName("oven_mintcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedmochicake"),  new ItemStack(ItemRegistry.mochicakeItem), 4*hour).setRegistryName("oven_mochicake"),
                new OvenRecipe(IIngredient.of("foodUncookedpeachcobbleritem"),  new ItemStack(ItemRegistry.peachcobblerItem), 4*hour).setRegistryName("oven_peachcobbleritem"),
                new OvenRecipe(IIngredient.of("foodUncookedpeanutbuttercookies"),  new ItemStack(ItemRegistry.peanutbuttercookiesItem), 4*hour).setRegistryName("oven_peanutbuttercookies"),
                new OvenRecipe(IIngredient.of("foodUncookedpeanutbuttercupcake"),  new ItemStack(ItemRegistry.peanutbuttercupcakeItem), 4*hour).setRegistryName("oven_peanutbuttercupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedpizza"),  new ItemStack(ItemRegistry.pizzaItem), 4*hour).setRegistryName("oven_pizza"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinbread"),  new ItemStack(ItemRegistry.pumpkinbreadItem), 4*hour).setRegistryName("oven_pumpkinbread"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinmuffin"),  new ItemStack(ItemRegistry.pumpkinmuffinItem), 4*hour).setRegistryName("oven_pumpkinmuffin"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinoatscones"),  new ItemStack(ItemRegistry.pumpkinoatsconesItem), 4*hour).setRegistryName("oven_pumpkinoatscones"),
                new OvenRecipe(IIngredient.of("foodUncookedpumpkinpie"),  new ItemStack(ItemRegistry.pumpkinpieItem), 4*hour).setRegistryName("oven_pumpkinpie"),
                new OvenRecipe(IIngredient.of("foodUncookedraisincookiesitem"),  new ItemStack(ItemRegistry.raisincookiesItem), 4*hour).setRegistryName("oven_raisincookiesitem"),
                new OvenRecipe(IIngredient.of("foodUncookedraspberrypie"),  new ItemStack(ItemRegistry.raspberrypieItem), 4*hour).setRegistryName("oven_raspberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedredvelvetcupcake"),  new ItemStack(ItemRegistry.redvelvetcupcakeItem), 4*hour).setRegistryName("oven_redvelvetcupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedrivermudcake"),  new ItemStack(ItemRegistry.rivermudcakeItem), 4*hour).setRegistryName("oven_rivermudcake"),
                new OvenRecipe(IIngredient.of("foodUncookedshepardspie"),  new ItemStack(ItemRegistry.shepardspieItem), 4*hour).setRegistryName("oven_shepardspie"),
                new OvenRecipe(IIngredient.of("foodUncookedsoftpretzel"),  new ItemStack(ItemRegistry.softpretzelItem), 4*hour).setRegistryName("oven_softpretzel"),
                new OvenRecipe(IIngredient.of("foodUncookedspinachpie"),  new ItemStack(ItemRegistry.spinachpieItem), 4*hour).setRegistryName("oven_spinachpie"),
                new OvenRecipe(IIngredient.of("foodUncookedsprinklescupcake"),  new ItemStack(ItemRegistry.sprinklescupcakeItem), 4*hour).setRegistryName("oven_sprinklescupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedstrawberrycupcake"),  new ItemStack(ItemRegistry.strawberrycupcakeItem), 4*hour).setRegistryName("oven_strawberrycupcake"),
                new OvenRecipe(IIngredient.of("foodUncookedstrawberrypie"),  new ItemStack(ItemRegistry.strawberrypieItem), 4*hour).setRegistryName("oven_strawberrypie"),
                new OvenRecipe(IIngredient.of("foodUncookedsugarcookie"),  new ItemStack(ItemRegistry.sugarcookieItem), 4*hour).setRegistryName("oven_sugarcookie"),
                new OvenRecipe(IIngredient.of("foodUncookedsunflowerwheatrolls"),  new ItemStack(ItemRegistry.sunflowerwheatrollsItem), 4*hour).setRegistryName("oven_sunflowerwheatrolls"),
                new OvenRecipe(IIngredient.of("foodUncookedsweetpotatopie"),  new ItemStack(ItemRegistry.sweetpotatopieItem), 4*hour).setRegistryName("oven_sweetpotatopie"),
                new OvenRecipe(IIngredient.of("foodUncookedtimpano"),  new ItemStack(ItemRegistry.timpanoItem), 4*hour).setRegistryName("oven_timpano"),
                new OvenRecipe(IIngredient.of("foodUncookedtiropita"),  new ItemStack(ItemRegistry.tiropitaItem), 4*hour).setRegistryName("oven_tiropita"),
                new OvenRecipe(IIngredient.of("foodUncookedtoast"),  new ItemStack(ItemRegistry.toastItem), 4*hour).setRegistryName("oven_toast"),
                new OvenRecipe(IIngredient.of("foodUncookedvanillacupcake"),  new ItemStack(ItemRegistry.vanillacupcakeItem), 4*hour).setRegistryName("oven_vanillacupcake")

                );

    }
}
