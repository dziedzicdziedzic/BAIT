package com.mygdx.game;


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
