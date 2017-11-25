package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PaperBucket extends Buckets implements ApplicationListener{
    SpriteBatch batch;
    Texture bucketImg;

    @Override
    public void create(){
        batch = new SpriteBatch();
        bucketImg = new Texture("core/assets/badlogic.jpg");
    }

    @Override
    public void render (){
        batch.begin();
        batch.draw(bucketImg, 120, 240);
        batch.end();
    }

    public boolean collision(){
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            if((Gdx.input.getX() >= 120 && Gdx.input.getX() <= 160) && (Gdx.input.getY() >= 280 && Gdx.input.getY() <= 240)){
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
