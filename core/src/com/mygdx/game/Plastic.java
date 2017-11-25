package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Plastic implements BaseGarbage {
    garbageType PlasticType = garbageType.PLASTIC;
    public Texture garbageTex;

    public garbageType returnType()
    {
        return PlasticType;
    }

    public Texture getGarbageTex ()
    {
        garbageTex = new Texture("image.png");
        return garbageTex;
    }

}
