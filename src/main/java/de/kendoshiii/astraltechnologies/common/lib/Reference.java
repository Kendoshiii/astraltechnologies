package de.kendoshiii.astraltechnologies.common.lib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {

	public static final String MODID = "astraltechnologies";
	public static final String MODNAME= "Astral Technologies";
	public static final String VERSION = "0.0.1";

	public static final Logger logger = LogManager.getFormatterLogger(MODNAME);
	
	public static final String COMMONPROXY = "de.kendoshiii.astraltechnologies.common.proxy.CommonProxy";
	public static final String CLIENTPROXY = "de.kendoshiii.astraltechnologies.common.proxy.ClientProxy";
	
}
