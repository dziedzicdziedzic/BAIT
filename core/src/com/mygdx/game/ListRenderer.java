package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ListRenderer extends ApplicationAdapter {
    public ConveyorBelt cnb;
    SpriteBatch batch;

    public void setCnb(ConveyorBelt cnb) {
        this.cnb = cnb;
    }

    public ListRenderer() {
        super();
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void render() {
        int offset= 0;
        for(Garbage s: cnb.getGarbageQueue()){
            BaseGarbage.garbageType garbageType = s.returnType();
            String filepath;
            switch (garbageType){
                case GLASS:
                    filepath="core/assets/szkło.png";
                    break;
                case PAPER:
                    filepath="core/assets/papier.png";
                    break;
                case PLASTIC:
                    filepath="core/assets/plastik.png";
                    break;
                default:
                    filepath=null;
            }
            Sprite garbageSprite = new Sprite(new Texture(filepath));
            batch.begin();
            batch.draw(garbageSprite, 510+offset, 350,60,100);
            batch.end();
            offset-=120;
        }
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void dispose() {
       batch.dispose();
    }
}
