package coloniesrising.gui;
import java.net.URL;
import java.util.ResourceBundle;

import coloniesrising.main.Planet;
import coloniesrising.main.economy.Storage;
import coloniesrising.main.economy.StorageTableView;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class GameGuiController implements Initializable {
	@FXML
	Label labelTime = new Label();
	Label labelMoney = new Label();
	public static StringProperty changingDate = new SimpleStringProperty();
	public static StringProperty changingMoney = new SimpleStringProperty();
	
	
	Button buttonStop = new Button();
	Button buttonSlow = new Button();
	Button buttonFast = new Button();
	Button buttonPlay = new Button();
	Button buttonDebugPlanets = new Button();
	
	TextField textfieldID = new TextField();
	TextField textfieldAmmount = new TextField();
	
	@FXML TableView<StorageTableView> tableViewStorage;
	@FXML TableColumn<StorageTableView, String> IDColumn;
	@FXML TableColumn<StorageTableView, String> ressourceColumn;
	@FXML TableColumn<StorageTableView, String> ammountColumn;
	@FXML TableColumn<StorageTableView, String> priceColumn;

	public void initialize(URL url, ResourceBundle rb) {
		
		labelTime.setId("labelTime");	
		changingDate.set("0");
		labelTime.textProperty().bind(changingDate);
		labelMoney.setId("labelMoney");
		changingMoney.set("10000");
		labelMoney.textProperty().bind(changingMoney);
		
		buttonStop.setId("buttonStop");		
		buttonPlay.setId("buttonPlay");	
		buttonSlow.setId("buttonSlow");
		buttonFast.setId("buttonFast");
		buttonDebugPlanets.setId("buttonDebugPlanets");
		
		IDColumn.setCellValueFactory(new PropertyValueFactory<StorageTableView, String>("ID"));
		ressourceColumn.setCellValueFactory(new PropertyValueFactory<StorageTableView, String>("ressource"));
		ammountColumn.setCellValueFactory(new PropertyValueFactory<StorageTableView, String>("ammount"));
		priceColumn.setCellValueFactory(new PropertyValueFactory<StorageTableView, String>("price"));
		
		tableViewStorage.setItems(StorageTableView.getList());
		
	}
	
	public void eventStop(ActionEvent event) {
		
		if (coloniesrising.main.Main.stop == false) {
			coloniesrising.main.Main.stop = true;
		} else {coloniesrising.main.Main.stop = false;}
	}
	
	public void eventPlay(ActionEvent event) {
		
		coloniesrising.main.GameClock.gameClock();
		
	}
	
	public void eventSlow(ActionEvent event) {
		
		coloniesrising.main.GameClock.delay = coloniesrising.main.GameClock.slow;
		
	}
	
	public void eventFast(ActionEvent event) {
		
		coloniesrising.main.GameClock.delay = coloniesrising.main.GameClock.fast;
		
	}
	
	public void eventDebugPlanets(ActionEvent event) {
		
		for (int i = 0; i <= coloniesrising.main.Main.planetCount; i++) {
			
			System.out.println(String.valueOf(Planet.ammountCoal[0]));
			
		}
		
	}
	
	public void eventExpedition(ActionEvent event) {
		
		coloniesrising.main.Expedition.expedition();
		
	}
	
	public void eventCreatePlanetTableEntry(ActionEvent event) {
		
		
		
	}
	
	public void eventCreateAsteroidTableEntry(ActionEvent event) {
		
		
		
	}
	
	public void eventSellRessources(ActionEvent event) {
		
        if ((textfieldID.getText() != null && !textfieldID.getText().isEmpty())) {
        	Storage.id = Integer.parseInt(textfieldID.getText());
        }
        
        if ((textfieldAmmount.getText() != null && !textfieldAmmount.getText().isEmpty())) {
        	Storage.ammountSelling = Integer.parseInt(textfieldAmmount.getText());
        }
		
		
		
	}
		
}
