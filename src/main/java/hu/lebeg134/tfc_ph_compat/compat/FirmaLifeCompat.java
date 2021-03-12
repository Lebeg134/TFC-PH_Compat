package hu.lebeg134.tfc_ph_compat.compat;

import com.eerussianguy.firmalife.recipe.DryingRecipe;
import com.eerussianguy.firmalife.registry.ItemsFL;
import com.pam.harvestcraft.item.ItemRegistry;
import hu.lebeg134.tfc_ph_compat.types.RecipeModifier;
import hu.lebeg134.tfc_ph_compat.util.handlers.OreDictHandler;
import net.dries007.tfc.objects.inventory.ingredient.IIngredient;
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
        OreDictionary.registerOre("cropPumpkin", new ItemStack(ItemsFL.PUMPKIN_CHUNKS));
        OreDictionary.registerOre("cropPumpkin", new ItemStack(ItemsFL.PUMPKIN_SCOOPED));
        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemsFL.PUMPKIN_CHUNKS));
        OreDictionary.registerOre("listAllveggie", new ItemStack(ItemsFL.PUMPKIN_SCOOPED));
        OreDictionary.registerOre("foodChocolatebar", new ItemStack(ItemsFL.DARK_CHOCOLATE));
        OreDictionary.registerOre("foodChocolatebar", new ItemStack(ItemsFL.MILK_CHOCOLATE));
        OreDictionary.registerOre("foodCocoapowder", new ItemStack(ItemsFL.COCOA_POWDER));
        OreDictionary.registerOre("cropCinnamon", new ItemStack(ItemsFL.CINNAMON));
        OreDictionary.registerOre("foodGroundcinnamon", new ItemStack(ItemsFL.GROUND_CINNAMON));
        OreDictionary.registerOre("cropCoconut", new ItemStack(ItemsFL.COCONUT));
        OreDictionary.registerOre("foodFlour", new ItemStack(ItemsFL.CHESTNUT_FLOUR));
        OreDictionary.registerOre("foodDough", new ItemStack(ItemsFL.CHESTNUT_DOUGH));
        OreDictionary.registerOre("foodBread", new ItemStack(ItemsFL.CHESTNUT_BREAD));
        OreDictionary.registerOre("bread", new ItemStack(ItemsFL.CHESTNUT_BREAD));
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
    }
    @SubscribeEvent
    public static void onRegisterDryingRecipeEvent(RegistryEvent.Register<DryingRecipe> event)
    {
        IForgeRegistry<DryingRecipe> r = event.getRegistry();
        r.registerAll(
                new DryingRecipe(IIngredient.of(ItemRegistry.stockItem), new ItemStack(ItemRegistry.driedsoupItem),24000).setRegistryName("dried_soup_drying2")
        );
    }
}
