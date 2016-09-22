package com.idm.assets;

public class Assets {

	
	public static SpriteSheet sheetOne;
	
	public Assets() {

	}
	
	public void init(){
		sheetOne = new SpriteSheet("SpriteSheet.png");
	}
	
	
	
	public static SpriteSheet getSheetOne() {
		return sheetOne;
	}

}
