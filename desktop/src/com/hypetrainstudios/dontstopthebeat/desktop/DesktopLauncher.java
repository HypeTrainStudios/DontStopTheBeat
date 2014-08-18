package com.hypetrainstudios.dontstopthebeat.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hypetrainstudios.dontstopthebeat.DontStopTheBeat;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		config.x = 0;
		config.y = 0;
		config.resizable = false;
		new LwjglApplication(new DontStopTheBeat(), config);
	}
}
