package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import java.util.Random;

public abstract class Garbage implements BaseGarbage {


    public abstract garbageType returnType();
    public abstract Texture getGarbageTex ();

}
