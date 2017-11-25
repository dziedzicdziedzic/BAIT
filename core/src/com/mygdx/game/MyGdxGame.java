package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
<<<<<<< HEAD
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
=======
	Sprite conveyor_belt;

	ShapeRenderer shapeRenderer;
	com.badlogic.gdx.utils.Queue queue;


	@Override
	public void create () {
		batch = new SpriteBatch();
		conveyor_belt = new Sprite(new Texture("C:\\Users\\Dziedzic\\Downloads\\test\\core\\assets\\conveyor.png"));
		queue = new com.badlogic.gdx.utils.Queue();
>>>>>>> origin/master
	}

	@Override
	public void render () {
<<<<<<< HEAD
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
=======
		batch.begin();
		conveyor_belt.setSize(420,100);
		conveyor_belt.draw(batch);
		batch.end();
	}

>>>>>>> origin/master
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
