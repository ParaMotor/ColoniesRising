package coloniesrising.gui;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameGuiController implements Initializable {
	@FXML
	Label labelTime = new Label();
	Label labelMoney = new Label();
	public static StringProperty changingDate = new SimpleStringProperty();
	
	
	Button buttonStop = new Button();
	Button buttonSlow = new Button();
	Button buttonFast = new Button();
	Button buttonPlay = new Button();

	public void initialize(URL url, ResourceBundle rb) {
		
		labelTime.setId("labelTime");	
		changingDate.set("0");
		labelTime.textProperty().bind(changingDate);
		//labelTime.setText(String.valueOf(coloniesrising.main.Main.day));
		labelMoney.setId("labelMoney");
		
		buttonStop.setId("buttonStop");		
		buttonPlay.setId("buttonPlay");			
	}
	
	public void eventStop(ActionEvent event) {
		
		if (coloniesrising.main.Main.stop == false) {
			coloniesrising.main.Main.stop = true;
		} else {coloniesrising.main.Main.stop = false;}
	}
	
	public void eventPlay(ActionEvent event) {
		
		coloniesrising.main.GameClock.gameClock();
		
	}
		
}
