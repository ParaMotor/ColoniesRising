package coloniesrising.main;

import java.util.Random;

public class Expedition {
	
	public static Planet[] planet = new Planet[10000];
	public static Asteroid[] asteroid = new Asteroid[10000];
	
	public static void expedition() {
		
		if (coloniesrising.main.Main.money > 100) {
		
		coloniesrising.main.Main.money = coloniesrising.main.Main.money - 100;
		Random rng = new Random();
		int randomNumber = 0;
		int randomNumberPlanet;
		
		randomNumberPlanet = rng.nextInt(100);
		
		if (randomNumberPlanet >= 85) {
		
			Planet.size = rng.nextInt(220500000) + 2850000;
			
			randomNumber = rng.nextInt(71)-20;
			Planet.ammountCoal[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(46)-5;
			Planet.ammountSalt[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(41)-5;
			Planet.ammountIron[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(41)-10;
			Planet.ammountBauxite[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(36)-10;
			Planet.ammountCopper[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(36)-10;
			Planet.ammountNickel[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(36)-15;
			Planet.ammountSilver[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(26)-15;
			Planet.ammountUranium[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(36)-20;
			Planet.ammountGold[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(36)-10;
			Planet.ammountTitanium[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(31)-23;
			Planet.ammountTritium[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(36)-20;
			Planet.ammountPalladium[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(31)-22;
			Planet.ammountPlatinum[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(11)-8;
			Planet.ammountHelium3[0] = (Planet.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
				Planet.fertilityFood = true;
			
			}
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
				Planet.fertilityHops = true;
			
			}
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
				Planet.fertilityGrape = true;
			
			}
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
				Planet.fertilityFiberPlants = true;
			
			}
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
				Planet.fertilityWood = true;
			
			}
		
			randomNumber = rng.nextInt(3)-1;
		
			if (randomNumber == 1) {
			
				Planet.fertilitySpecialWood = true;
			
			}
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
				Planet.fertilityOilPlants = true;
			
			}
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
				Planet.fertilityRubber = true;
			
			}
		
			randomNumber = rng.nextInt(2);
		
			if (randomNumber == 1) {
			
			Planet.fertilityPasture = true;
			
			}
		
			randomNumber = rng.nextInt(3)-1;
		
			if (randomNumber == 1) {
			
				Planet.fertilitySilicon = true;
				
			}
		
		
			Planet.planetName = String.valueOf(coloniesrising.main.Main.planetCount);
			coloniesrising.main.Main.planetCount++;
			
		}
		
		if (randomNumberPlanet <= 35 || randomNumberPlanet >= 95) {
			
			randomNumber = rng.nextInt(31)-60;
			Asteroid.ammountIron = (Asteroid.size * randomNumber) / 100;
			
			randomNumber = rng.nextInt(31)-75;
			Asteroid.ammountBauxite = (Asteroid.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(31)-75;
			Asteroid.ammountCopper = (Asteroid.size * randomNumber) / 100;
		
			randomNumber = rng.nextInt(26)-75;
			Asteroid.ammountNickel = (Asteroid.size * randomNumber) / 100;
			
			if (Asteroid.ammountIron + Asteroid.ammountBauxite + Asteroid.ammountCopper + Asteroid.ammountNickel < Asteroid.size) {
		
				randomNumber = rng.nextInt(31)-75;
				Asteroid.ammountSilver = (Asteroid.size * randomNumber) / 100;
		
			}
			
			if (Asteroid.ammountIron + Asteroid.ammountBauxite + Asteroid.ammountCopper + Asteroid.ammountNickel + Asteroid.ammountSilver < Asteroid.size) {
			
				randomNumber = rng.nextInt(26)-75;
				Asteroid.ammountGold = (Asteroid.size * randomNumber) / 100;
				
			}
			
			if (Asteroid.ammountIron + Asteroid.ammountBauxite + Asteroid.ammountCopper + Asteroid.ammountNickel + Asteroid.ammountSilver + Asteroid.ammountGold < Asteroid.size) {
		
				randomNumber = rng.nextInt(31)-75;
				Asteroid.ammountTitanium = (Asteroid.size * randomNumber) / 100;
				
			}
			
			if (Asteroid.ammountIron + Asteroid.ammountBauxite + Asteroid.ammountCopper + Asteroid.ammountNickel + Asteroid.ammountSilver + Asteroid.ammountGold + Asteroid.ammountTitanium < Asteroid.size) {
		
				randomNumber = rng.nextInt(21)-75;
				Asteroid.ammountPalladium = (Asteroid.size * randomNumber) / 100;
				
			}
			
			if (Asteroid.ammountIron + Asteroid.ammountBauxite + Asteroid.ammountCopper + Asteroid.ammountNickel + Asteroid.ammountSilver + Asteroid.ammountGold + Asteroid.ammountTitanium + Asteroid.ammountPalladium < Asteroid.size) {
		
				randomNumber = rng.nextInt(21)-75;
				Asteroid.ammountPlatinum = (Asteroid.size * randomNumber) / 100;
				
			}
			
			coloniesrising.main.Main.asteroidCount++;
		
		}
		
	}
	}

}
