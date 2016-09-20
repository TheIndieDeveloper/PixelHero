package com.idm.states;

import com.badlogic.gdx.Screen;
import com.idm.game.Main;
import com.idm.universe.Universe;

public class PlayState implements Screen {

	public Main main;
	public Universe universe;

	public PlayState(Main main) {
		this.main = main;
	}

	@Override
	public void show() {
		universe = new Universe(5, 5);
		universe.init();
	}

	@Override
	public void render(float delta) {
		universe.render(delta);
	}

	@Override
	public void resize(int width, int height) {
		universe.getPlayer().getCamera().viewportWidth = width;
		universe.getPlayer().getCamera().viewportHeight = height;
		universe.getPlayer().getCamera().update();
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
		universe.dispose();
	}

}
