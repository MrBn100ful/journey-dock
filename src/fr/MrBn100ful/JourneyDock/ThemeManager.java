package fr.MrBn100ful.JourneyDock;

import java.awt.Color;

import javafx.stage.Stage;

public class ThemeManager {

//	public static void SetColorstage(String color) {
//
//		if (color.equals("gray")) {
//
//			stage.setBackground(new Color(91, 91, 91, 200));
//
//		} else if (color.equals("red")) {
//
//			stage.setBackground(new Color(246, 44, 44, 200));
//
//		} else if (color.equals("green")) {
//
//			stage.setBackground(new Color(22, 205, 52, 200));
//
//		} else if (color.equals("blue")) {
//
//			stage.setBackground(new Color(26, 138, 212, 200));
//
//		} else if (color.equals("white")) {
//
//			stage.setBackground(new Color(255, 255, 255, 200));
//
//		} else if (color.equals("yellow")) {
//
//			stage.setBackground(new Color(255, 230, 0, 200));
//
//		} else if (color.equals("pink")) {
//
//			stage.setBackground(new Color(235, 35, 195, 200));
//
//		} else if (color.equals("purple")) {
//
//			stage.setBackground(new Color(95, 35, 235, 200));
//
//		} else if (color.equals("orange")) {
//
//			stage.setBackground(new Color(235, 148, 35, 200));
//
//		}
//		
//		return scene;
//
//	}

	public static void SetDecoration(Stage stage) {

		stage.setResizable(false);

	}

	public static void SetDockSize(Stage dock, int dockmargin) {

		int height = GetInfoComputer.GetHeight();

		int width = GetInfoComputer.GetWidth();

		if ((ConfigManager.GetConfig("possition")).equals("left")) {
			
			dock.setWidth(dockmargin);
			
			dock.setHeight(height);

			dock.setY(0);
			
			dock.setX(0);

		} else if ((ConfigManager.GetConfig("possition")).equals("right")) {

			dock.setWidth(dockmargin);
			
			dock.setHeight(height);
			
			dock.setX(width - dockmargin);
			
			dock.setY(0);


		} else if ((ConfigManager.GetConfig("possition")).equals("top")) {
			
			dock.setWidth(width);
			
			dock.setHeight(dockmargin);
			
			dock.setY(0);
			
			dock.setX(0);

		} else if ((ConfigManager.GetConfig("possition")).equals("down")) {
	
			dock.setWidth(width);
			
			dock.setHeight(dockmargin);
			
			dock.setY(height - dockmargin);
			
			dock.setX(0);

		}

	}

}
