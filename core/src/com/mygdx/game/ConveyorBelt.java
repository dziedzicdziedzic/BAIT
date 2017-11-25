package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.LinkedList;
import java.util.Queue;

public class ConveyorBelt {
    private Queue<BaseGarbage> garbageQueue;

    public ConveyorBelt(Queue<BaseGarbage> garbageQueue) {
        this.garbageQueue = garbageQueue;
    }
    public void setGarbageQueue(Queue<BaseGarbage>  garbageQueue) {
        this.garbageQueue = garbageQueue;
    }
    public BaseGarbage returnPopped(){
        return garbageQueue.remove();
    }
}
