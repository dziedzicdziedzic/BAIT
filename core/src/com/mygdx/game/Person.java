package com.mygdx.game;
//import java.lang.Object;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.Texture;

public class Person {

    private SpriteBatch spriteBatch;
    //private Sprite sprite;
    private BitmapFont font;
    private Texture texture;
    private float timer;
    private int counter;
    private boolean ifhappy;
    private double score;
    private Texture textures[]=new Texture[3];
    public void setIfhappy(boolean ifHappy)
    {
        ifhappy=ifHappy;
    }

    public void Happy(){

        if(ifhappy==false){
        }
        else {

            if (counter > 2) {
                ifhappy = false;
                counter = 0;
            } else {
                //ifhappy = true;
            }
            timer += Gdx.graphics.getDeltaTime();

            if (timer >= 0.2) {  //czas zmiany animacji
                timer = 0;
                this.texture = textures[counter];
                counter++;

            }
        }
    }

    public void render(){


      spriteBatch.begin();
      spriteBatch.draw(this.texture,600,100);
      font.draw(spriteBatch,"Score:"+score,700,600);

      spriteBatch.end();
      Happy();
    }
    public void addscore(){
        score+=100;
    }
    public void subscore(){
        score-=5;
        if(score<0){
            score=0;

        }
    }
    public void initialization(){
        counter=0;
        score=0;
        font=new BitmapFont();
        font.setColor(0,0,0,1);

        texture = new Texture("core/assets/ludek.png");   ///początkowa
        ifhappy=false;
        spriteBatch=new SpriteBatch();

        textures[0]=new Texture("core/assets/ludek.png");
        textures[1]=new Texture("core/assets/ludek2.png");
        textures[2]=new Texture("core/assets/ludek.png");
        /*
        textures[3]=new Texture("core/assets/ludek4.png");
        textures[4]=new Texture("core/assets/ludek5.png");
        textures[5]=new Texture("core/assets/ludek6.png");
        textures[6]=new Texture("core/assets/ludek7.png");
        textures[7]=new Texture("core/assets/ludek8.png");
        textures[8]=new Texture("core/assets/ludek9.png");
        textures[9]=new Texture("core/assets/ludek10.png");
        textures[10]=new Texture("core/assets/ludek.png");  //machanie będzie lepiej wyglądało ;)
        */
        //textures[2]=new Texture("ludek3.png");
        //we can do it as spritesheet :/

    }


}