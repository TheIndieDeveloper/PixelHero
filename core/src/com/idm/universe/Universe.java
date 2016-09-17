package com.idm.universe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class Universe {

	
	private int uni_width;
	private int uni_height;
	private World world;
	
	public Universe(int uni_width, int uni_height) {
		this.uni_width = uni_width;
		this.uni_height = uni_height;
	}

	public void init() {
		world = new World(new Vector2(0, -98f), true);
	}

	private void tick() {
		world.step(Gdx.graphics.getDeltaTime(), 6, 2);
	}
	
	public void render(float delta) {
		tick();
		
		
	}

	public void dispose() {
		world.dispose();
	}

}
