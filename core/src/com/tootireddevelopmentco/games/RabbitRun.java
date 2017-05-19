package com.tootireddevelopmentco.games;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RabbitRun extends ApplicationAdapter {
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
