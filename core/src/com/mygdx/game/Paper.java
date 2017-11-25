package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Paper extends Garbage{

    garbageType paperType = garbageType.PAPER;
    public Texture garbageTex;


    public garbageType returnType()
    {
        return paperType;
    }

    public Texture getGarbageTex ()
    {
        garbageTex = new Texture("core/assets/papier.png");
        return garbageTex;
    }
}
