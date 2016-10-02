package com.idm.core;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.idm.assets.Assets;

public class GameCore {

	private Vector2 core_location = new Vector2();
	private Sprite texture;
	
	public GameCore(float x, float y) {
		core_location.x = x;
		core_location.y = y;
		texture = new Sprite(Assets.getCoreSheet().getTile(0, 0, 64, 64));
		texture.setPosition(core_location.x * 16, core_location.y * 16);
	}
	
	public void render(SpriteBatch batch){
		if(texture != null){
			texture.draw(batch);
		}
	}
	

}
