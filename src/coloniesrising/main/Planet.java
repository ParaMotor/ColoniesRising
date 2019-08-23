package coloniesrising.main;

public class Planet { //all Characteristics a Planet could possibly have combined in this class
	
	public static float energy;
	public static int size;
	public final int maxSize = 223350000; //maximum planet size, ca. 1,5x earth
	public final int minSize = 2850000; //minimum planet size, ca. Ceres
	public final float maximumAmmountRessources = 0.2f;
	
	
	public static int[] ammountCoal = new int[2]; //first entry: maximum district size, second entry: current district size
	public static int[] ammountSalt = new int[2];
	public static int[] ammountIron = new int[2];
	public static int[] ammountAluminium = new int[2];
	public static int[] ammountCopper = new int[2];
	public static int[] ammountNickel = new int[2];
	public static int[] ammountSilver = new int[2];
	public static int[] ammountUranium = new int[2];
	public static int[] ammountGold = new int[2];
	public static int[] ammountTitanium = new int[2];
	public static int[] ammountTritium = new int[2];
	public static int[] ammountPalladium = new int[2];
	public static int[] ammountPlatinum = new int[2];
	public static int[] ammountHelium3 = new int[2];
	
	public static boolean fertilityFood;
	public static boolean fertilityHops;
	public static boolean fertilityGrape;
	public static boolean fertilityFiberPlants;
	public static boolean fertilityWood;
	public static boolean fertilitySpecialWood;
	public static boolean fertilityOilPlants;
	public static boolean fertilityRubber;
	public static boolean fertilityPasture;
	public static boolean fertilitySilicon;
	
	public static int districtMineCoal = 0;
	public static int districtMineSalt = 0;
	public static int districtMineIron = 0;
	public static int districtMineAluminium = 0;
	public static int districtMineCopper = 0;
	public static int districtMineNickel = 0;
	public static int districtMineSilver = 0;
	public static int districtMineUranium = 0;
	public static int districtMineGold = 0;
	public static int districtMineTitanium = 0;
	public static int districtMineTritium = 0;
	public static int districtMinePalladium = 0;
	public static int districtMinePlatinum = 0;
	public static int districtMineHelium3 = 0;
	
	public static int districtEnergySolar = 0;
	public static int districtEnergyCoal = 0;
	public static int districtEnergyFission = 0;
	public static int districtEnergyFusionTritanium = 0;
	public static int districtEnergyFusionHelium3 = 0;
	
	public static int districtIndustrySteel = 0; //Iron, Coal
	public static int districtIndustryStainlessSteel = 0; //Steel, Coal, Nickel
	public static int districtIndustryAluminium = 0;
	public static int districtIndstryTools = 0; //Aluminum, Stainless Steel
	public static int districtIndustryConvenienceFoods = 0; //Food, Aluminum
	public static int districtIndustryBattery = 0; //Salt, Stainless Steel
	public static int districtIndustryCircuitBoard = 0; //Silicon, Copper
	public static int districtIndustryDevices = 0; //Circuit Board, Copper, Silver
	public static int districtIndustryTransport = 0; //Stainless Steel, Aluminum, Rubber
	public static int districtIndustryAirTransport = 0; //Stainless Steel, Aluminum, Devices
	public static int districtIndustryJewlerry = 0; //Silver, Gold, Platinum
	public static int districtIndustryWood = 0;
	public static int districtIndustrySpecialWood = 0;
	public static int districtIndustryFuelRod = 0;
	public static int districtIndustrySuperconducter = 0; //Platinum
	public static int districtIndustryGasStorage = 0; //Palladium
	
	public static int districtServices = 0; //SoonTM
	
	public static int districtTourismPoor = 0; //SoonTM
	public static int districtTourismRich = 0; //SoonTM
	public static int districtTourismNature = 0; //SoonTM
	public static int districtTourismCommercial = 0; //SoonTM
	
	
	
}
