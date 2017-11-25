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
	Texture backGroundImage;

	ShapeRenderer shapeRenderer;
	com.badlogic.gdx.utils.Queue queue;


	@Override
	public void create () {
		batch = new SpriteBatch();
		conveyor_belt = new Sprite(new Texture("core/assets/conveyor.png"));
		queue = new com.badlogic.gdx.utils.Queue();
	}

	@Override
	public void render () {
		batch.begin();
		backGroundImage = new Texture("core/assets/bg.jpg");
		batch.draw(backGroundImage, 0, 0);
		conveyor_belt.setPosition(0,200);
		conveyor_belt.setSize(630,100);
		conveyor_belt.draw(batch);
		batch.end();
		GlassBucket glass = new GlassBucket();
		PlasticBucket plastic = new PlasticBucket();
		PaperBucket paper = new PaperBucket();
		glass.collision();
		plastic.collision();
		paper.collision();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
