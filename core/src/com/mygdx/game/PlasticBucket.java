package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlasticBucket extends Buckets{
    SpriteBatch batch;
    Texture bucketImg;

    public PlasticBucket(){

    }

    public void PlasticBucketMake()
    {
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

    @Override
    public void dispose () {
        batch.dispose();
        bucketImg.dispose();
    }

    @Override
    public boolean collision(BaseGarbage.garbageType type) {
        return false;
    }

    @Override
    public boolean checkIfValid(ConveyorBelt cnb) {
        return false;
    }
}
