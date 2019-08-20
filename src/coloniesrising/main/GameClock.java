package coloniesrising.main;

import java.util.Timer;
import java.util.TimerTask;

import coloniesrising.main.Main;
import javafx.application.Platform;

public class GameClock {

	public static void gameClock() {
			
			final int slow = 2000;
			final int fast = 500;
			long delay = slow;
			long startTime;
			long endTime;
			Timer gameSpeed = new Timer();
			
			TimerTask gameGlock = new TimerTask() {
				
				public void run() {
					Platform.runLater(() -> {
						
						if (Main.stop == false) {
							Main.day++;
						}
						coloniesrising.gui.GameGuiController.changingDate.setValue(String.valueOf(Main.day));
					});
				};
			};
			
			gameSpeed.scheduleAtFixedRate(gameGlock, 0, delay);
		}
}
