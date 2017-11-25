package com.mygdx.game;
//import java.lang.Object;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;

public class Person {

    private SpriteBatch spriteBatch;
    private Texture texture;
    private float timer;
    private int counter;
    private boolean ifhappy;
    private Texture textures[]=new Texture[10];


    public void Happy(){
        if(!ifhappy)return;
        if(counter>10){
            ifhappy=false;
            counter=0;
        }
        else {
            ifhappy=true;
        }
        timer+=Gdx.graphics.getDeltaTime();
        if(timer>=0.2){
            timer=0;
            counter++;
        }
        return;
    }

    public void render(int ifhappy){

      texture = new Texture("ludek.png");
      Happy();
      if(ifhappy==1){

      }


      if(ifhappy==1)return;
      else timer=0;
    }

    public void initialization(){
        textures[0]=new Texture("ludek.png");
        textures[1]=new Texture("ludek2.png");
        textures[2]=new Texture("ludek3.png");
        textures[3]=new Texture("ludek4.png");
        textures[4]=new Texture("ludek5.png");
        textures[5]=new Texture("ludek6.png");
        textures[6]=new Texture("ludek7.png");
        textures[7]=new Texture("ludek8.png");
        textures[8]=new Texture("ludek9.png");
        textures[9]=new Texture("ludek10.png");
        //textures[2]=new Texture("ludek3.png");
        //we can do it as spritesheet :/

    }


}