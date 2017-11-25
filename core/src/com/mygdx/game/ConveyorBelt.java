package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.LinkedList;
import java.util.Queue;

public class ConveyorBelt {
    public ConveyorBelt(com.badlogic.gdx.utils.Queue<BaseGarbage> garbageQueue, LinkedList<Sprite> belt) {
        this.garbageQueue = garbageQueue;
        this.belt = belt;
    }

    public ConveyorBelt() {
        belt=new LinkedList<Sprite>();
    }

    private com.badlogic.gdx.utils.Queue<BaseGarbage> garbageQueue;
    LinkedList<Sprite> belt;


    public void setGarbageQueue(com.badlogic.gdx.utils.Queue<BaseGarbage>  garbageQueue) {
        this.garbageQueue = garbageQueue;
    }
}
