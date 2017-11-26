package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ListRenderer extends ApplicationAdapter {
    public ConveyorBelt cnb;
    SpriteBatch batch;
    Sprite garbageSprite;
    Sprite glassSprite;
    Sprite plasticSprite;
    Sprite paperSprite;

    public void setCnb(ConveyorBelt cnb) {
        this.cnb = cnb;
    }

    public ListRenderer() {
        super();
    }
    @Override
    public void create() {
        batch = new SpriteBatch();
        garbageSprite=new Sprite();
        glassSprite = new Sprite(new Texture("core/assets/szkło.png"));
        plasticSprite = new Sprite(new Texture("core/assets/plastik.png"));
        paperSprite = new Sprite(new Texture("core/assets/papier.png"));
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
                    garbageSprite = glassSprite;
                    break;
                case PAPER:
                    garbageSprite = paperSprite;
                    break;
                case PLASTIC:
                    garbageSprite = plasticSprite;
                    break;
                default:
                    garbageSprite=null;
            }
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
