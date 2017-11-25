package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PaperBucket extends Buckets implements ApplicationListener{
    SpriteBatch batch;
    Texture bucketImg;

    public PaperBucket(){
        this.create();
        this.render();
    }

    @Override
    public void create(){
        batch = new SpriteBatch();
        bucketImg = new Texture("core/assets/badlogic.jpg");
    }

    @Override
    public void render (){
        batch.begin();
        batch.draw(bucketImg, 410, 0,160, 160);
        batch.end();
    }

    public boolean collision(){
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            if((Gdx.input.getX() >= 410 && Gdx.input.getX() <= 570) && (Gdx.input.getY() >= 480 && Gdx.input.getY() <= 600)){
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
