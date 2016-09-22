package com.idm.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class SpriteSheet {

	private Texture spriteSheet;
	
	public SpriteSheet(String sheetName) {
		spriteSheet = new Texture(Gdx.files.internal("spritesheets/"+sheetName));
	}
	
	public TextureRegion getTile(int x, int y){
		return new TextureRegion(spriteSheet,x*16,y*16, 16, 16);
	}
	
}
