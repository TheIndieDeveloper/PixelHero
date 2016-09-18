package com.idm.level;

public enum BlockType {
	
	GRASS_ONE("grass_one.png", false),
	GRASS_TWO("grass_two.png", false);
	
	private String textureName;
	private boolean isSoild;
	
	private BlockType(String textureName, boolean isSoild) {
		this.textureName = textureName;
		this.isSoild = isSoild;
	}
	
	public boolean isSoild() {
		return isSoild;
	}
	
	public String getTextureName() {
		return textureName;
	}
	
}
