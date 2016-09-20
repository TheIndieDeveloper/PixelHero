package com.idm.universe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.idm.level.ChunkLoader;

public class Universe {

	
	private int uni_width;
	private int uni_height;
	
	private World world;
	private ChunkLoader loader;
	private SpriteBatch batch;
	private Player player;
	
	public Universe(int uni_width, int uni_height) {
		this.uni_width = uni_width;
		this.uni_height = uni_height;
	}

	public void init() {
		
		
		player = new Player();
		player.init();

		batch = new SpriteBatch();
		
		world = new World(new Vector2(0, -98f), true);
		loader = new ChunkLoader(uni_width, uni_height);
		loader.init();
	}

	private void tick() {
		world.step(Gdx.graphics.getDeltaTime(), 6, 2);
	}
	
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		tick();
		
		batch.setProjectionMatrix(player.getCamera().combined);
		
		batch.begin();
		
		loader.render(batch, delta);
		player.render(batch, delta);
		
		batch.end();
		
	}

	public void dispose() {
		world.dispose();
		loader.dispose();
	}

	public Player getPlayer() {
		return player;
	}

}
