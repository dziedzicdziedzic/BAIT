package com.mygdx.game;


import java.util.LinkedList;
import java.util.Queue;

public class ConveyorBelt {
    private LinkedList<Garbage> garbageQueue;

    public ConveyorBelt(LinkedList<Garbage> garbageQueue) {
        this.garbageQueue = garbageQueue;
    }
    public void setGarbageQueue(LinkedList<Garbage>  garbageQueue) {
        this.garbageQueue = garbageQueue;
    }
    public BaseGarbage.garbageType returnPopped(){
        if (garbageQueue.isEmpty())
            System.out.println("empty");
        return garbageQueue.removeFirst().returnType();
    }
}
