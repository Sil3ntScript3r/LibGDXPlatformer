package com.sil3nt.platformer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sil3nt.platformer.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Platformer";
        config.width = 1280;
        config.height = 720;

		new LwjglApplication(new Main(), config);
	}
}
