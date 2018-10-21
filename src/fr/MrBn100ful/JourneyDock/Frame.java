package fr.MrBn100ful.JourneyDock;

import javax.swing.JFrame;

public class Frame {
	
	static JFrame dock = new JFrame();
	
	public static void MainFrame() {
		
		ThemeMananger.SetDecoration(dock);
		
		ThemeMananger.SetColorFrame(dock,ConfigManager.GetConfig("color"));
		
		ThemeMananger.SetDockSize(dock);
		
		dock.setVisible(true);
		 
	}

}
