package com.mygdx.game;
import java.lang.Object;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;

public class Person {
    private Sprite sprite;
    private SpriteBatch spriteBatch;
    private Texture texture;
    private Animation playerAnimation;
    private TextureRegion[] playerTextureRegion;
    private Texture playerAnimationTexture;
    private TextureRegion currentFrame;
    float stateTime = 0;



    public void load(){
        texture=new Texture("spacecraftanimation.png");
    }
    public void render(){
        stateTime += Gdx.graphics.getDeltaTime();
        currentFrame =  playerAnimation.getKeyFrame(stateTime, true);

        spriteBatch.begin();
        sprite.draw(spriteBatch);
        spriteBatch.draw(currentFrame,30,30,100f,200f);
        spriteBatch.end();
    }
    //x=100
    //y=200
    //row =10
    //column=6
    public static TextureRegion[] createRegion(TextureRegion[] outputRegion, Texture texture, int sizeX, int sizeY, int row, int column){

        TextureRegion[][] tmp = TextureRegion.split(texture, sizeX, sizeY);
        outputRegion = new TextureRegion[row*column];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                outputRegion[index++] = tmp[i][j];
            }
        }
        return outputRegion;
    }
}
