package fr.MrBn100ful.JourneyMobile;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageManager  {

	public static void start(Stage primaryStage) {
		
		Group root = new Group();
	        
		Scene scene = new Scene(root);
	       
	    primaryStage.setScene(scene);

		ThemeManager.SetDecoration(primaryStage);

		ThemeManager.SetColorstage(scene, ConfigManager.GetConfig("color"));

		ThemeManager.SetDockSize(primaryStage, 50);

	    primaryStage.show();
	    
	}

}
