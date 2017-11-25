package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Queue;

public class ConveyorBelt {
    private com.badlogic.gdx.utils.Queue<BaseGarbage> garbageQueue;
    Sprite belt;
    private int xspeed;

    public void setGarbageQueue(com.badlogic.gdx.utils.Queue<BaseGarbage>  garbageQueue) {
        this.garbageQueue = garbageQueue;
    }

    public void render(int xspeed){

        ShapeRenderer shapeRenderer = new ShapeRenderer();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        for(int i=0; i<5; i++){
            shapeRenderer.setColor(Color.BLACK);
            shapeRenderer.rect(50+60*i+xspeed, 50, 60, 100);
            shapeRenderer.setColor(Color.GRAY);
            shapeRenderer.rect(60+60*i+xspeed, 60, 40, 80);
        }
        shapeRenderer.end();
    }
}
