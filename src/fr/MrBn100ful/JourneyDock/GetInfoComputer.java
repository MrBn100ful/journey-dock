package fr.MrBn100ful.JourneyDock;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GetInfoComputer {

	static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

	public static int GetWidth() {

		int width = 0;

		width = gd.getDisplayMode().getWidth();

		return width;

	}

	public static int GetHeight() {

		int height = 0;

		height = gd.getDisplayMode().getHeight();

		return height;

	}

}
