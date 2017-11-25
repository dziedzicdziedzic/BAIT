package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlasticBucket extends Buckets{
    SpriteBatch batch;
    Texture bucketImg;

    public PlasticBucket(){
        this.create();
        this.render();
    }

    @Override
    public void create(){
        batch = new SpriteBatch();
        bucketImg = new Texture("core/assets/plastic.png");
    }

    @Override
    public void render (){
        batch.begin();
        batch.draw(bucketImg, 220, 0,160,256);
        batch.end();
    }

    public boolean collision(){
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            if((Gdx.input.getX() >= 220 && Gdx.input.getX() <= 380) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
                System.out.println("kolizja-plastik");
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
