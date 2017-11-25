package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Plastic extends Garbage {
    garbageType PlasticType = garbageType.PLASTIC;
    public Texture garbageTex;

    public garbageType returnType()
    {
        return PlasticType;
    }

    public Texture getGarbageTex ()
    {
        garbageTex = new Texture("core/assets/butelka.jpg");
        return garbageTex;
    }

}
