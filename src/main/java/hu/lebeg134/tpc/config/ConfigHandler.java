package hu.lebeg134.tpc.config;

import com.pam.harvestcraft.HarvestCraft;
import net.minecraftforge.common.config.Configuration;

import java.util.HashMap;

public class ConfigHandler {
    private final Configuration config;

    private static final String Category_general = "general";

    public boolean overwritePHConfig;
    public boolean enablePHMeats;
    public boolean disableOredictRemoval;
    public boolean detectOtherModCompat;
    public boolean manualCaffeineCompat;
    public boolean disablePHcrops;

    public final HashMap<String,Boolean> oreDictRemoval = new HashMap<String, Boolean>();



    public ConfigHandler(Configuration config){
        this.config = config;

        initSettings();
    }

    private void initSettings(){
        config.load();

        initGeneralConfig();

        if (config.hasChanged())
            config.save();
    }

    private void initGeneralConfig(){
        overwritePHConfig =config.getBoolean("overwritePHConfig", Category_general, true, "Overwrites PH config in some places" );
        enablePHMeats = config.getBoolean("enablePHMeats", Category_general, true, "Makes turkeys drop turkey and ducks drop duck");
        disableOredictRemoval = config.getBoolean("disableOredictRemoval", Category_general, false, "Disables the removal of oredict from most PH items");
        detectOtherModCompat = config.getBoolean("detectOtherModCompat", Category_general, true, "Automaticly detects compatible mods and adjusts Oredict and recipes");
        manualCaffeineCompat = config.getBoolean("manualCaffeineCompat", Category_general, false, "if detectOtherModCompat is disabled you can manualy turn on compatibility for some mods WARNING this may cause crashes!");
        disablePHcrops = config.getBoolean("disablePHcrops", Category_general, false, "Disables the new 22crops from spawning in the wild");

    }
    public void overwritePHConfig(){
        HarvestCraft.config.squiddropCalamari = false;
        HarvestCraft.config.enablecroptoseedRecipe = false;
        HarvestCraft.config.enablehoneyslimeballPresser = false;
    }
}
