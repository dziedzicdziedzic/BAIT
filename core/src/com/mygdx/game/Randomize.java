package com.mygdx.game;
import java.util.Random;

public class Randomize {

    public int rand()
    {
        Random generator = new Random();
        int a = generator.nextInt(2);
        return a;
    }
}
