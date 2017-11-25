package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GlassBucket extends Buckets implements ApplicationListener{
    SpriteBatch batch;
    Texture bucketImg;

    @Override
    public void create(){
        batch = new SpriteBatch();
        //bucketImg = new Texture("path");
    }

    @Override
    public void render (){
        batch.begin();
        batch.draw(bucketImg, 0, 0);
        batch.end();
    }

    public boolean collision(){
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            if((Gdx.input.getX() >= 0 && Gdx.input.getX() <= 40) && (Gdx.input.getY() >= 280 && Gdx.input.getY() <= 240)){
                return true;
            }
        }
        return false;
    }
}
