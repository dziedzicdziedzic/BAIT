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
    //private Sprite sprite;
    private Texture texture;
    private float timer;
    private int counter;
    private boolean ifhappy;
    private Texture textures[]=new Texture[11];
    public void setIfhappy(boolean ifHappy)
    {
        ifhappy=ifHappy;
    }

    public void Happy(){

        if(ifhappy==false){
        }
        else {
            System.out.println(timer);
            //System.out.println(counter);
            if (counter > 10) {
                ifhappy = false;
                counter = 0;
            } else {
                ifhappy = true;
            }
            timer += Gdx.graphics.getDeltaTime();
            //System.out.println(timer);
            if (timer >= 0.2) {
                timer = 0;
                this.texture = textures[counter];
                counter++;

            }
        }
    }

    public void render(){


      spriteBatch.begin();
      spriteBatch.draw(this.texture,0,200);
      System.out.println("super");
      spriteBatch.end();
      Happy();
    }

    public void initialization(){
        counter=0;
        texture = new Texture("core/assets/ludek.png");   ///początkowa
        ifhappy=false;
        spriteBatch=new SpriteBatch();

        textures[0]=new Texture("core/assets/ludek.png");
        textures[1]=new Texture("core/assets/ludek2.png");
        textures[2]=new Texture("core/assets/ludek3.png");
        textures[3]=new Texture("core/assets/ludek4.png");
        textures[4]=new Texture("core/assets/ludek5.png");
        textures[5]=new Texture("core/assets/ludek6.png");
        textures[6]=new Texture("core/assets/ludek7.png");
        textures[7]=new Texture("core/assets/ludek8.png");
        textures[8]=new Texture("core/assets/ludek9.png");
        textures[9]=new Texture("core/assets/ludek10.png");
        textures[10]=new Texture("core/assets/ludek.png");  //machanie będzie lepiej wyglądało ;)
        //textures[2]=new Texture("ludek3.png");
        //we can do it as spritesheet :/

    }


}