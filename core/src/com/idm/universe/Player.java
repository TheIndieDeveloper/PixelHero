package com.idm.universe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class Player {
	
	private OrthographicCamera camera;
	
	public Player() {
		
	}
	
	public void init(){
		camera = new OrthographicCamera(1280 * 2, 720 * 2);
	}
	
	public void render(SpriteBatch batch, float delta){
		
	}
	
	public void dispose(){
		
	}
	
	public OrthographicCamera getCamera() {
		return camera;
	}
	
	public Vector3 getWorldMouseLocation(){
		return camera.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
	}
	
}
