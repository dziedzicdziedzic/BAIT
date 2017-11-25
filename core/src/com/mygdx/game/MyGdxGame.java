package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.compression.lzma.Base;

import java.util.Queue;


public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Sprite conveyor_belt;
	ShapeRenderer shapeRenderer;
	com.badlogic.gdx.utils.Queue queue;


	@Override
	public void create () {
		batch = new SpriteBatch();
		conveyor_belt = new Sprite(new Texture("C:\\Users\\Dziedzic\\Downloads\\test\\core\\assets\\conveyor.png"));
		queue = new com.badlogic.gdx.utils.Queue();
	}

	@Override
	public void render () {
		int xspeed = 10;
		ConveyorBelt cnb = new ConveyorBelt();
		cnb.setGarbageQueue(queue);
			Gdx.gl.glClearColor(255, 255, 255, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			batch.begin();
			conveyor_belt.draw(batch);
			conveyor_belt.translateX(10);

			batch.end();
	}

	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
