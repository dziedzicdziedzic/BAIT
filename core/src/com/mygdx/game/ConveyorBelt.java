package com.mygdx.game;


import java.util.Queue;

public class ConveyorBelt {
    private Queue<Garbage> garbageQueue;

    public ConveyorBelt(Queue<Garbage> garbageQueue) {
        this.garbageQueue = garbageQueue;
    }
    public void setGarbageQueue(Queue<Garbage>  garbageQueue) {
        this.garbageQueue = garbageQueue;
    }
    public BaseGarbage.garbageType returnPopped(){
        return garbageQueue.remove().returnType();
    }
}
