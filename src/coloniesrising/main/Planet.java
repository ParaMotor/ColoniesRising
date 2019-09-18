package coloniesrising.main;

import coloniesrising.main.economy.Storage;

public class Planet { //all Characteristics a Planet could possibly have combined in this class
	
	public static String planetName;
	public static float energy;
	public static int size;
	public final int maxSize = 223350000; //maximum planet size, ca. 1,5x earth
	public final int minSize = 2850000; //minimum planet size, ca. Ceres
	public final float maximumAmmountRessources = 0.2f;
	
	
	public static int[] ammountCoal = new int[2]; //first entry: maximum district size, second entry: current district size
	public static int[] ammountSalt = new int[2];
	public static int[] ammountIron = new int[2];
	public static int[] ammountBauxite = new int[2];
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
	
	public static boolean fertilityFood = false;
	public static boolean fertilityHops = false;
	public static boolean fertilityGrape = false;
	public static boolean fertilityFiberPlants = false;
	public static boolean fertilityWood = false;
	public static boolean fertilitySpecialWood = false;
	public static boolean fertilityOilPlants = false;
	public static boolean fertilityRubber = false;
	public static boolean fertilityPasture = false;
	public static boolean fertilitySilicon = false;
	
	public static int districtEnergySolar = 0; //SoonTM
	public static int districtEnergyCoal = 0; //SoonTM
	public static int districtEnergyFission = 0; //SoonTM
	public static int districtEnergyFusionTritanium = 0; //SoonTM
	public static int districtEnergyFusionHelium3 = 0; //SoonTM
	
	public static int districtIndustrySteel = 0; //Iron, Coal
	public static int districtIndustryStainlessSteel = 0; //Steel, Coal, Nickel
	public static int districtIndustryAluminium = 0;
	public static int districtIndstryTools = 0; //Aluminum, Stainless Steel
	public static int districtIndustryConvenienceFoods = 0; //Food, Pasture, Aluminum
	public static int districtIndustryBattery = 0; //Salt, Stainless Steel
	public static int districtIndustryCircuitBoard = 0; //Silicon, Copper
	public static int districtIndustryDevices = 0; //Circuit Board, Copper, Silver
	public static int districtIndustryTransport = 0; //Stainless Steel, Aluminum, Rubber
	public static int districtIndustryAirTransport = 0; //Stainless Steel, Aluminum, Devices
	public static int districtIndustryJewllery = 0; //Silver, Gold, Platinum
	public static int districtIndustryWood = 0;
	public static int districtIndustrySpecialWood = 0;
	public static int districtIndustryFuelRod = 0;
	public static int districtIndustrySuperconducter = 0; //Platinum
	public static int districtIndustryGasStorage = 0; //Palladium
	public static int districtIndustryClothing = 0; //Fibre
	public static int districtIndustryIndustrialFibre = 0; //Fibre, Iron, Titanium
	public static int districtIndustryBeer = 0; //Hops, Food
	public static int districtIndustryChampagne = 0; //Grape
	public static int districtPlantOil = 0; //Oil Plants
	public static int districtHighEnergyFuel = 0; //Plant Oil, Coal
	
	public static int districtFood = 0;
	public static int districtHops = 0;
	public static int districtGrapes = 0;
	public static int districtFiberPlants = 0;
	public static int districtWood = 0;
	public static int districtSpecialWood = 0;
	public static int districtOilPlants = 0;
	public static int districtRubber = 0;
	public static int districtPasture = 0;
	public static int districtSilicon = 0;
	
	
	public static int districtServices = 0; //SoonTM
	
	public static int districtTourismPoor = 0; //SoonTM
	public static int districtTourismRich = 0; //SoonTM
	public static int districtTourismNature = 0; //SoonTM
	public static int districtTourismCommercial = 0; //SoonTM
	
	
	public static void endOfMonth() {
		
		Storage.Coal = Storage.Coal + ammountCoal[1] / 2000;
		Storage.Salt = Storage.Salt + ammountSalt[1] / 2000;
		Storage.Iron = Storage.Iron + ammountIron[1] / 2000;
		Storage.Bauxite = Storage.Bauxite + ammountBauxite[1] / 2000;
		Storage.Copper = Storage.Copper + ammountCopper[1] / 2000;
		Storage.Nickel = Storage.Nickel + ammountNickel[1] / 2000;
		Storage.Silver = Storage.Silver + ammountSilver[1] / 2000;
		Storage.Uranium = Storage.Uranium + ammountUranium[1] / 2000;
		Storage.Gold = Storage.Gold + ammountGold[1] / 2000;
		Storage.Titanium = Storage.Titanium + ammountTitanium[1] / 2000;
		Storage.Tritium = Storage.Tritium + ammountTritium[1] / 2000;
		Storage.Palladium = Storage.Palladium + ammountPalladium[1] / 2000;
		Storage.Platinum = Storage.Platinum + ammountPlatinum[1] / 2000;
		Storage.Helium3 = Storage.Helium3 + ammountHelium3[1] / 2000;
		
		Storage.Food = Storage.Food + districtFood / 2000;
		Storage.Hops = Storage.Hops + districtHops / 2000;
		Storage.Grapes = Storage.Grapes + districtGrapes / 2000;
		Storage.FiberPlants = Storage.FiberPlants + districtFiberPlants / 2000;
		Storage.Wood = Storage.Wood + districtWood / 2000;
		Storage.SpecialWood = Storage.SpecialWood + districtSpecialWood / 2000;
		Storage.OilPlants = Storage.OilPlants + districtOilPlants / 2000;
		Storage.Rubber = Storage.Rubber + districtRubber / 2000;
		Storage.Pasture = Storage.Pasture + districtPasture / 2000;
		Storage.Silicon = Storage.Silicon + districtSilicon / 2000;
	}
	
	
}
