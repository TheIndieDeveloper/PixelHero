package com.idm.assets;

public class Assets {

	
	public static SpriteSheet sheetOne;
	public static SpriteSheet core_sheet;
	
	public Assets() {

	}
	
	public void init(){
		sheetOne = new SpriteSheet("SpriteSheet.png");
		core_sheet = new SpriteSheet("game_sheet.png");
	}
	
	
	
	public static SpriteSheet getSheetOne() {
		return sheetOne;
	}

	public static SpriteSheet getCoreSheet() {
		return core_sheet;
	}
	
}
