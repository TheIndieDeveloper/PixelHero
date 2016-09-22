package com.idm.game;

public class Assets {
	
	public static SpriteSheet sheet_one;
	
	
	public Assets() {
		
	}
	
	public void init(){
		sheet_one = new SpriteSheet("SpriteSheet.png");
	}
	
	public static SpriteSheet getSheet_one() {
		return sheet_one;
	}
	
}
