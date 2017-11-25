package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Glass implements BaseGarbage {

    garbageType glassType = garbageType.GLASS;
    public Texture garbageTex;

    public garbageType returnType()
    {
        return glassType;
    }

    public Texture getGarbageTex ()
    {
        garbageTex = new Texture("image.png");
        return garbageTex;
    }

}
