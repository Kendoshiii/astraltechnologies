package de.kendoshiii.astraltechnologies.common.config;

import java.util.HashMap;

public class ConfigValues {

	public static int modGuiIndex = 0;
	public static int furnaceGeneratorGui = modGuiIndex++;
	public static int culinaryGeneratorGui = modGuiIndex++;
	public static int endGeneratorGui = modGuiIndex++;
	public static int netherGeneratorGui = modGuiIndex++;
	public static int handCrafterGui = modGuiIndex++;

    public static final String updateURL = "https://raw.githubusercontent.com/CJMinecraft01/CJCore/master/update.json";

    public static HashMap<String, Boolean> UPDATE_CHECKER_MODS = new HashMap<String, Boolean>();
	
	//Energy Cluster 0 = Astralium, 1 = Lunarium, 2 = Solarium, 3 = Voidium
	
	public static int[] energyClusterCapacity = {1000000, 5000000, 15000000, 30000000};
	
	//Panel
	
	public static int[] astralPanelGeneration = {5, 15, 45};
	public static int[] solarPanelGeneration = {5, 15, 45};
	
	//Generator
	
	public static int[] generatorRFGeneration = {40, 80, 30, 4000};
	
	//Ores
	public static int[] oreSize = {4, 4, 5, 2, 4};
	public static int[] oreYLevel = {64, 40, 128, 16, 128};
	public static int[] oreRarity = {15, 10, 10};
}
