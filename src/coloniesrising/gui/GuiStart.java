package coloniesrising.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

public class GuiStart extends Application {

@Override
public void start(Stage primaryStage) throws IOException {
	
	   Parent root = FXMLLoader.load(getClass().getResource("GameGui.fxml"));
	   Scene scene = new Scene(root);

	   primaryStage.setTitle("Colonies Rising");
	   primaryStage.setScene(scene);
	   primaryStage.show();

}

public static void drawGui() {

launch();

}
}

