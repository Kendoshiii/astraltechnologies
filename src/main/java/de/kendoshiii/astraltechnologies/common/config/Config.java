package de.kendoshiii.astraltechnologies.common.config;

import org.apache.logging.log4j.Level;

import de.kendoshiii.astraltechnologies.common.proxy.CommonProxy;
import de.kendoshiii.astraltechnologies.core.Core;
import net.minecraftforge.common.config.Configuration;

public class Config {

	private static final String CATEGORY_GENERAL = "general";
	
	public static boolean testBool = true;
	
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            Core.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

	private static void initGeneralConfig(Configuration cfg) {

		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General settings");
		
		testBool = cfg.getBoolean("Test Boolean", CATEGORY_GENERAL, testBool, "This is a test boolean to see if the config works properly");
		
	}
    
}
