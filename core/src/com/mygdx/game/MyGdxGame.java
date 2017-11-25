package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.compression.lzma.Base;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;


public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Sprite conveyor_belt;
	Texture backGroundImage;
	ConveyorBelt cnb;

	ShapeRenderer shapeRenderer;
	com.badlogic.gdx.utils.Queue queue;


	@Override
	public void create () {
		batch = new SpriteBatch();
		conveyor_belt = new Sprite(new Texture("core/assets/conveyor.png"));
		queue = new com.badlogic.gdx.utils.Queue();
		cnb = new ConveyorBelt();
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

		Buckets bucket = new Buckets() {
			@Override
			public boolean collision(BaseGarbage.garbageType type){

				if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
					if((Gdx.input.getX() >= 30 && Gdx.input.getX() <= 190) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
						System.out.println("kolizja-szkło");
						if(type.equals(BaseGarbage.garbageType.GLASS)){
						    System.out.println("dobrze");
						    return true;
                        }
                        System.out.println("zle");
						return false;
					} else if ((Gdx.input.getX() >= 220 && Gdx.input.getX() <= 380) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
						System.out.println("kolizja-plastik");
                        if(type.equals(BaseGarbage.garbageType.PLASTIC)){
                            System.out.println("dobrze");
                            return true;
                        }
                        System.out.println("zle");
						return false;
					} else if((Gdx.input.getX() >= 410 && Gdx.input.getX() <= 570) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
						System.out.println("kolizja-papier");
                        if(type.equals(BaseGarbage.garbageType.PAPER)){
                            System.out.println("dobrze");
                            return true;
                        }
                        System.out.println("zle");
						return false;
					}
				}
				return false;
			}

			@Override
			public boolean checkIfValid(ConveyorBelt cnb) {
				BaseGarbage.garbageType type = cnb.returnPopped();
				if(type.equals(BaseGarbage.garbageType.GLASS)){
					if (this.collision(type)){
						return true;
					}
				}else if (type.equals(BaseGarbage.garbageType.PLASTIC)){
					if (this.collision(type)){
						return true;
					}
				}else if (type.equals(BaseGarbage.garbageType.PAPER)){
					if (this.collision(type)){
						return true;
					}
				}
				return false;
			}
		};
		bucket.checkIfValid(cnb);
		cnb.Setup();

	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
