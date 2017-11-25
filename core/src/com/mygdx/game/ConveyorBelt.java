package com.mygdx.game;
import java.util.LinkedList;

public class ConveyorBelt {
    private LinkedList<Garbage> garbageQueue;

    Randomize randomize = new Randomize();

    public ConveyorBelt() {
        garbageQueue = new LinkedList<Garbage>();
    }

    enum Type {
        PLASTIC,GLASS,PAPER
    }
    public void Setup()
    {

        int a = randomize.rand();
        if (a==0)
        {
            garbageQueue.add(new Paper());
        }
        else
        {
            if(a==1) {
                garbageQueue.add(new Glass());
            }
            else
            {
                garbageQueue.add(new Plastic());
            }
        }
    }

    public void SetupBelt()
    {
        for(int i=0; i<4; i++)
        {
            Setup();
        }
    }

    public Type Shift()
    {
        Garbage element = garbageQueue.poll();
        Setup();
        if (element.returnType() == BaseGarbage.garbageType.PLASTIC) return Type.PLASTIC;
        if (element.returnType() == BaseGarbage.garbageType.GLASS) return Type.GLASS;
        else return Type.PAPER;
    }
}
