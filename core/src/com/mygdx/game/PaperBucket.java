package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PaperBucket extends Buckets{
    SpriteBatch batch;
    Texture bucketImg;


    public PaperBucket(){
        this.create();
        this.render();
    }

    @Override
    public void create(){
        batch = new SpriteBatch();
        bucketImg = new Texture("core/assets/paper.png");
    }

    @Override
    public boolean checkIfValid(ConveyorBelt cnb) {
        if(cnb.returnPopped().equals(BaseGarbage.garbageType.PAPER)){
            if (this.collision()){
                return true;
            }
        }
        return false;
    }

    @Override
    public void render (){
        batch.begin();
        batch.draw(bucketImg, 410, 0,160, 256);
        batch.end();
    }

    public boolean collision(){
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            if((Gdx.input.getX() >= 410 && Gdx.input.getX() <= 570) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
                System.out.println("kolizja-papier");
                return true;
            }
        }
        return false;
    }

    @Override
    public void dispose () {
        batch.dispose();
        bucketImg.dispose();
    }
}
