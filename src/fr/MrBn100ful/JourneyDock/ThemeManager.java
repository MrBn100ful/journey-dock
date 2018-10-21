package fr.MrBn100ful.JourneyDock;

import java.awt.Color;
import javax.swing.JFrame;

public class ThemeManager {

	public static void SetColorFrame(JFrame frame, String color) {

		if (color.equals("gray")) {

			frame.setBackground(new Color(91, 91, 91, 200));

		} else if (color.equals("red")) {

			frame.setBackground(new Color(246, 44, 44, 200));

		} else if (color.equals("green")) {

			frame.setBackground(new Color(22, 205, 52, 200));

		} else if (color.equals("blue")) {

			frame.setBackground(new Color(26, 138, 212, 200));

		} else if (color.equals("white")) {

			frame.setBackground(new Color(255, 255, 255, 200));

		} else if (color.equals("yellow")) {

			frame.setBackground(new Color(255, 230, 0, 200));

		} else if (color.equals("pink")) {

			frame.setBackground(new Color(235, 35, 195, 200));

		} else if (color.equals("purple")) {

			frame.setBackground(new Color(95, 35, 235, 200));

		} else if (color.equals("orange")) {

			frame.setBackground(new Color(235, 148, 35, 200));

		}

	}

	public static void SetDecoration(JFrame frame) {

		frame.setUndecorated(true);

		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void SetDockSize(JFrame dock, int dockmargin) {

		int height = GetInfoComputer.GetHeight();

		int width = GetInfoComputer.GetWidth();

		if ((ConfigManager.GetConfig("possition")).equals("left")) {

			dock.setSize(dockmargin, height);

			dock.setLocation(0, 0);

		} else if ((ConfigManager.GetConfig("possition")).equals("right")) {

			dock.setSize(dockmargin, height);

			dock.setLocation(width - dockmargin, 0);

		} else if ((ConfigManager.GetConfig("possition")).equals("top")) {

			dock.setSize(width, dockmargin);

			dock.setLocation(0, 0);

		} else if ((ConfigManager.GetConfig("possition")).equals("down")) {

			dock.setSize(width, dockmargin);

			dock.setLocation(0, height - dockmargin);

		}

	}

}
