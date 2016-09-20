package com.idm.universe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class Player {
	
	private OrthographicCamera camera;
	private float speed = 2.2f;
	
	
	public Player() {
		
	}
	
	public void init(){
		camera = new OrthographicCamera(1280 * 2, 720 * 2);
		camera.zoom -= 0.75f;
		camera.position.set(16 * 5 / 2 * 32 / 2, 16 * 5 / 2 * 32 / 2, 0);
		camera.update();
	}
	
	private void tick() {
		
		if(Gdx.input.isKeyPressed(Keys.W)){
			camera.position.y += speed;
		}
		if(Gdx.input.isKeyPressed(Keys.S)){
			camera.position.y -= speed;
		}
		if(Gdx.input.isKeyPressed(Keys.D)){
			camera.position.x += speed;
		}
		if(Gdx.input.isKeyPressed(Keys.A)){
			camera.position.x -= speed;
		}
		
		camera.update();
	}
	
	public void render(SpriteBatch batch, float delta){
		tick();
		//CODE
		
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
