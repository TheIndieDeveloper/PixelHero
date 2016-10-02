package com.idm.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class SpriteSheet {

	private Texture spriteTexture;
	
	public SpriteSheet(String sheetName) {
		spriteTexture = new Texture(Gdx.files.internal("spritesheets/"+sheetName));
	}
	
	
	public TextureRegion getTile(int x, int y){
		return new TextureRegion(spriteTexture, x*16, y*16, 16, 16);
	}
	
	public TextureRegion getTile(int x, int y, int width, int height){
		return new TextureRegion(spriteTexture, x, y, width, height);
	}

}
