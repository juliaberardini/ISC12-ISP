package com.mygdx.mygame;

import com.badlogic.gdx.Game;
import com.mygdx.mygame.screens.Splash;

public class RabbitRun extends Game{
	public static final String TITLE = "Rabbit Run"; 
	
	@Override
	public void create () {
		setScreen (new Splash ()); 
	}

	@Override
	public void render () {
		super.render ();
	}
	
	@Override
	public void dispose () {
		super.dispose ();
	}

	@Override
	public void resize(int width, int height) {
		super.resize (width, height);
		
	}

	@Override
	public void pause() {
		super.pause ();
		
	}

	@Override
	public void resume() {
		super.resume (); 
		
	}
}
