package fr.MrBn100ful.JourneyDock;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	
	
	public static void main(String[] args){		

		// check is config file exist if not it create it.
		
		Path configpath = Paths.get("config.properties");
			
		if (Files.notExists(configpath)) {
			ConfigManager.CreateConfig();
		}	
		
		// launch Main Frame
		
		Frame.MainFrame();
		
	}

}
