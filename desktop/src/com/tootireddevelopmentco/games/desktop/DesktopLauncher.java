package com.mygdx.mygame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.mygame.RabbitRun;

public class Main {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Rabbit Run";
		config.height = 630;
		config.width = 945; 
		
		
		new LwjglApplication(new RabbitRun(), config);
	}
}
