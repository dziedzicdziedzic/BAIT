package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.compression.lzma.Base;

import java.util.Queue;


public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture conveyor_belt;
	ShapeRenderer shapeRenderer;
	com.badlogic.gdx.utils.Queue queue;
	boolean running = true;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		conveyor_belt= new Texture("conveyor.png");
		queue = new com.badlogic.gdx.utils.Queue();
	}

	@Override
	public void render () {
		ConveyorBelt cnb = new ConveyorBelt();
		cnb.setGarbageQueue(queue);
		while (running) {
			Gdx.gl.glClearColor(255, 255, 255, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			batch.begin();
			cnb.render();
			batch.end();
		}
	}

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
