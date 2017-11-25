package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Buckets extends ApplicationAdapter implements CollisionHandler{
    public abstract boolean collision();
    public abstract boolean checkIfValid(ConveyorBelt cnb);
}
