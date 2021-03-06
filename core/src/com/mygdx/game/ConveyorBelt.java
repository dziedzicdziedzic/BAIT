package com.mygdx.game;
import java.util.LinkedList;

public class ConveyorBelt {
    private LinkedList<Garbage> garbageQueue;

    Randomize randomize = new Randomize();

    public BaseGarbage.garbageType returnPopped(){
        if (garbageQueue.isEmpty())
            System.out.println("empty");
        return garbageQueue.removeFirst().returnType();
    }

    public ConveyorBelt() {
        garbageQueue = new LinkedList<Garbage>();
        SetupBelt();
    }

    public LinkedList<Garbage> getGarbageQueue() {
        return garbageQueue;
    }

    public void Setup()
    {

        int a = randomize.rand();
        if (a == 0) {
            garbageQueue.add(new Paper());
        }
        else if(a == 1){
            garbageQueue.add(new Plastic());
        }
        else if(a == 2){
            garbageQueue.add(new Glass());
        }

    }

    public void SetupBelt()
    {
        for(int i=0; i<5; i++)
        {
            Setup();
        }
    }

}
