package com.idm.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.idm.game.Main;

public class PlayState implements Screen {

	public Main main;

	public PlayState(Main main) {
		this.main = main;
	}

	@Override
	public void show() {
	
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {

	}

}
