package fr.MrBn100ful.JourneyDock;

import javax.swing.JFrame;

public class Frame {

	static JFrame dock = new JFrame();

	public static void MainFrame() {

		ThemeManager.SetDecoration(dock);

		ThemeManager.SetColorFrame(dock, ConfigManager.GetConfig("color"));

		ThemeManager.SetDockSize(dock, 50);

		dock.setVisible(true);

	}

}
