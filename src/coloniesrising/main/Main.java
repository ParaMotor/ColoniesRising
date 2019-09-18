package coloniesrising.main;

import coloniesrising.gui.GuiStart;
import coloniesrising.main.economy.Storage;

public class Main {

	public static int day = 0;
	public static boolean stop = false;
	public static int speed = 0; // 0 = fast, 1 = slow, maybe more to come
	public static int planetCount = 0;
	public static int asteroidCount = 0;
	public static int money = 10000;
	public static Storage playerStorage = new Storage();

	public static void main(String[] args) {
		
		GuiStart.drawGui();
		
	}
	
}
