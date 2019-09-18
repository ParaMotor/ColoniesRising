package coloniesrising.main;

import java.util.Timer;
import java.util.TimerTask;

import coloniesrising.main.Main;
import javafx.application.Platform;

public class GameClock {
	
	public static final int slow = 2000;
	public static final int fast = 500;
	public static long delay = slow;

	public static void gameClock() {
			
			final int slow = 2000;
			final int fast = 500;
			long delay = slow;
			Timer gameSpeed = new Timer();
			
			TimerTask gameGlock = new TimerTask() {
				
				public void run() {
					Platform.runLater(() -> {
						
						if (Main.stop == false) {
							Main.day++;
						}
						coloniesrising.gui.GameGuiController.changingDate.setValue(String.valueOf(Main.day));
						coloniesrising.gui.GameGuiController.changingMoney.setValue(String.valueOf(Main.money));
						
						System.out.println(String.valueOf(coloniesrising.main.Main.planetCount));
						System.out.println(String.valueOf(coloniesrising.main.Main.asteroidCount));
						
						if (Main.day % 30 == 0) {
							
							for (int i = 0; i <= coloniesrising.main.Main.planetCount; i++) {
								
								Planet.endOfMonth();
								
							}
							
						}
						
					});
				};
				
			};
			
			gameSpeed.scheduleAtFixedRate(gameGlock, 0, delay);
		}
}
