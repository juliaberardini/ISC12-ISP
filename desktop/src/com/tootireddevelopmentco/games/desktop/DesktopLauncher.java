package com.tootireddevelopmentco.games;

 
 import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
 import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
 import com.mygdx.RabbitRun.RabbitRun;

 public class Main {
 	
 	public static final String NAME = "Rabbit Run";  
 	
 	public static void main (String[] arg) {
 		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
 		cfg.title = RabbitRun.TITLE;
 		cfg.useGL30 = true; 
 		cfg.width = 945;
 		cfg.height = 630; 
		cfg.vSyncEnabled = true; 
		
		new LwjglApplication(new RabbitRun(), cfg);
	}
}