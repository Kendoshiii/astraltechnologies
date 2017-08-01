package de.kendoshiii.astraltechnologies.core;

import de.kendoshiii.astraltechnologies.common.config.ConfigValues;
import de.kendoshiii.astraltechnologies.common.lib.Reference;
import de.kendoshiii.astraltechnologies.common.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static de.kendoshiii.astraltechnologies.common.lib.Reference.MODID;

@Mod(modid = MODID,
     name = Reference.MODNAME,
     version = Reference.VERSION,
     useMetadata = true,
     customProperties = {@Mod.CustomProperty(k = "useVersionChecker", v = "true")}
)
public class Core {

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.Instance
    public static Core instance;

    public static Logger logger;

    public static final List<String> DEPENDANTS = new ArrayList<>();

    public final CreativeTabs tab = new CreativeTabs(MODID) {

		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(InitItems.ingotAstralium);
		}

		@Override
		public ItemStack getTabIconItem() {
            return null;
        }

    };

    private static void updateDependants() {
        ConfigValues.UPDATE_CHECKER_MODS.put(MODID, true);
        for (ModContainer mod : Loader.instance().getActiveModList()) {
            for (ArtifactVersion version : mod.getDependencies()) {
                if (version.getLabel().equals(MODID)) {
                    if (!DEPENDANTS.contains(mod.getModId())) {
                        DEPENDANTS.add(mod.getModId());
                        if (mod.getCustomModProperties().containsKey("useVersionChecker")) {
                            if (Boolean.valueOf(mod.getCustomModProperties().get("useVersionChecker"))) {
                                if (!ConfigValues.UPDATE_CHECKER_MODS.containsKey(mod.getModId())) {
                                    ConfigValues.UPDATE_CHECKER_MODS.put(mod.getModId(), true);
                                }
                            }
                        } else {
                            logger.error(String.format("Mod %s does not say whether it uses an version checker! Please fix this!", mod.getModId()));
                            FMLCommonHandler.instance().exitJava(0, false);
                        }
                    }
                }
            }
            for (ArtifactVersion version : mod.getRequirements()) {
                if (version.getLabel().equals(MODID)) {
                    if (!DEPENDANTS.contains(mod.getModId())) {
                        DEPENDANTS.add(mod.getModId());
                        if (mod.getCustomModProperties().containsKey("useVersionChecker")) {
                            if (Boolean.valueOf(mod.getCustomModProperties().get("useVersionChecker"))) {
                                if (!ConfigValues.UPDATE_CHECKER_MODS.containsKey(mod.getModId())) {
                                    ConfigValues.UPDATE_CHECKER_MODS.put(mod.getModId(), true);
                                }
                            }
                        } else {
                            logger.error(String.format("Mod %s does not say whether it uses an version checker! Please fix this!", mod.getModId()));
                            FMLCommonHandler.instance().exitJava(0, false);
                        }
                    }
                }
            }
        }
        DEPENDANTS.forEach(mod -> logger.info("Found dependant: " + mod));
        ConfigValues.UPDATE_CHECKER_MODS.forEach((key, value) -> logger.info("Mod " + key + " says it has a version checker!"));
    }
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        updateDependants();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
	
}
