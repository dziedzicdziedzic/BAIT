package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Paper implements BaseGarbage{

    garbageType paperType = garbageType.PAPER;
    public Texture garbageTex;


    public garbageType returnType()
    {
        return paperType;
    }

    public Texture getGarbageTex ()
    {
        garbageTex = new Texture("image.png");
        return garbageTex;
    }
}
