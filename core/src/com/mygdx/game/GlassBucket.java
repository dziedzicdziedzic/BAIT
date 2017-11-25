package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GlassBucket extends Buckets {
    SpriteBatch batch;
    Texture bucketImg;

    public GlassBucket(){
        this.create();
        this.render();
    }

    @Override
    public boolean checkIfValid() {
        return true;
    }

    @Override
    public void create(){
        batch = new SpriteBatch();
        bucketImg = new Texture("core/assets/glass.png");
    }

    @Override
    public void render (){
        batch.begin();
        batch.draw(bucketImg, 30, 0,160,256);
        batch.end();
    }

    public boolean collision(){
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            if((Gdx.input.getX() >= 30 && Gdx.input.getX() <= 190) && (Gdx.input.getY() >= 344 && Gdx.input.getY() <= 600)){
                System.out.println("kolizja-szkło");
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
