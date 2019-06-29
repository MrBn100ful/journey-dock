package fr.MrBn100ful.JourneyDock;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	public static void main(String[] args) {
       
		// check is config file exist if not it create it.

		Path configpath = Paths.get("config.properties");

		if (Files.notExists(configpath)) {
			
			ConfigManager.CreateConfig();
			
		}
			
		// start stage
		
		ConfigManager.SetConfig("possition", "down");
		
		launch(args);
    }
	
	@Override
    public void start(Stage primaryStage) {
		
		ThemeManager.SetDecoration(primaryStage);

		//ThemeManager.SetColorFrame(dock, ConfigManager.GetConfig("color"));

		ThemeManager.SetDockSize(primaryStage, 50);
		
		
        primaryStage.show();
    }
    
}
