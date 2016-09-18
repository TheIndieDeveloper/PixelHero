package com.idm.level;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Block {

	private BlockType type;
	private int blockSize = 32;
	private boolean isSoild;
	private Texture texture;
	private Vector2 block_location = new Vector2();

	public Block(int xpos, int ypos, BlockType type) {
		this.block_location.x = xpos;
		this.block_location.y = ypos;
		this.type = type;
		this.isSoild = type.isSoild();
		texture = new Texture(Gdx.files.internal(type.getTextureName()));
	}

	public void render(SpriteBatch batch, float delta) {
		if(texture != null){
			batch.draw(texture, block_location.x, block_location.y);
		}
	}

	public void dispose() {
		texture.dispose();
	}

}
