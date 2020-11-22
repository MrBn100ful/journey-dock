package fr.MrBn100ful.JourneyMobile;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Frame  {

	public void start(Stage primaryStage) {
		
		Group root = new Group();
	        
		Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
	       
	    primaryStage.setScene(scene);

	    primaryStage.show();

		ThemeManager.SetDecoration(primaryStage);

		//ThemeManager.SetColorstage(primaryStage, ConfigManager.GetConfig("color"));

		ThemeManager.SetDockSize(primaryStage, 50);


	}

}
