package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Glass extends Garbage {

    garbageType glassType = garbageType.GLASS;
    public Texture garbageTex;

    public garbageType returnType()
    {
        return glassType;
    }

    public Texture getGarbageTex ()
    {
        garbageTex = new Texture("core/assets/szkło.jpg");
        return garbageTex;
    }

}
