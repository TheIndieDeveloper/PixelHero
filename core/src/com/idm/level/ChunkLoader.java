package com.idm.level;

import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class ChunkLoader {
	
	CopyOnWriteArrayList<Chunk> chunks = new CopyOnWriteArrayList<Chunk>();
	private int uni_w;
	private int uni_h;
	
	public ChunkLoader(int uni_width, int uni_height) {
		this.uni_w = uni_width;
		this.uni_h = uni_height;
	}

	public void init() {
		
		for(int x = 0; x < uni_w;x++){
			for(int y = 0; y < uni_h;y++){
				chunks.add(new Chunk(x * 32 * 8, y * 32 * 8));
			}
		}
		
		
		for(Chunk chunk : chunks){
			chunk.init();
		}
	}

	public void render(SpriteBatch batch, float delta) {
		for(Chunk chunk : chunks){
			chunk.render(batch, delta);
		}
	}

	public void dispose() {
		for(Chunk chunk : chunks){
			chunk.dispose();
		}
	}
	
	public CopyOnWriteArrayList<Chunk> getChunks() {
		return chunks;
	}

}
