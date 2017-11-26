package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import java.util.concurrent.TimeUnit;


public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Sprite conveyor_belt;
	Texture backGroundImage;
	ConveyorBelt cnb;
	com.badlogic.gdx.utils.Queue queue;
	GlassBucket glass = new GlassBucket();
	PlasticBucket plastic = new PlasticBucket();
	PaperBucket paper = new PaperBucket();
	Person person=new Person();
	ListRenderer lrender = new ListRenderer();
    Sound paperSound;
    Sound plasticSound;
    Sound glassSound;
    Sound bgSound;


	@Override
	public void create () {
		batch = new SpriteBatch();
		conveyor_belt = new Sprite(new Texture("core/assets/conveyor.png"));
		backGroundImage = new Texture("core/assets/bg.jpg");
        bgSound=Gdx.audio.newSound(Gdx.files.internal("core/assets/ogg/326639_monkeyman535_happy-music.ogg"));
        paperSound=Gdx.audio.newSound(Gdx.files.internal("core/assets/ogg/82378_gynation_paper-flip-2.ogg"));
        plasticSound=Gdx.audio.newSound(Gdx.files.internal("core/assets/ogg/405702_apinasaundi_found-plastic-bottle-1.ogg"));
        glassSound=Gdx.audio.newSound(Gdx.files.internal("core/assets/ogg/338692_natemarler_glass-break-small.ogg"));
		cnb = new ConveyorBelt();
		lrender = new ListRenderer();
		plastic.create();
		glass.create();
		paper.create();
		lrender.create();
		lrender.setCnb(cnb);
		person.initialization();
		bgSound.loop(1.0f);
	}
	@Override
	public void render () {
		batch.begin();
		batch.draw(backGroundImage, 0, 0);
		conveyor_belt.setPosition(0,300);
		conveyor_belt.setSize(600,200);
		conveyor_belt.draw(batch);
		batch.end();
		glass.render();
		paper.render();
		plastic.render();
		person.render();
		lrender.render();
		Buckets bucket = new Buckets()
		{
			@Override
			public boolean collision(BaseGarbage.garbageType type){

				if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
					if((Gdx.input.getX() >= 30 && Gdx.input.getX() <= 190) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
						System.out.println("kolizja-szkło");
						if(type.equals(BaseGarbage.garbageType.GLASS)){
                            final long playGlass = glassSound.play(1.0f);
						    return true;
                        }
                        System.out.println("zle");
						return false;
					} else if ((Gdx.input.getX() >= 220 && Gdx.input.getX() <= 380) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
						System.out.println("kolizja-plastik");
                        if(type.equals(BaseGarbage.garbageType.PLASTIC)){
                            final long playPlastic = plasticSound.play(1.0f);
                            return true;
                        }
                        System.out.println("zle");
						return false;
					} else if((Gdx.input.getX() >= 410 && Gdx.input.getX() <= 570) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
                        if(type.equals(BaseGarbage.garbageType.PAPER)){
                            final long playPaper = paperSound.play(1.0f);
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
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
			if(bucket.checkIfValid(cnb)){
				person.addscore();
				person.setIfhappy(true);
			}
			else
			{
				person.livesminus();
			}
			if(!person.returnAlive()){
				dispose();
			}

			cnb.Setup();
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void dispose () {
		batch.dispose();
		paperSound.dispose();
		plasticSound.dispose();
		glassSound.dispose();
		bgSound.dispose();
	}
}
