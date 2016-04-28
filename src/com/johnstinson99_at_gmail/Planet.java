package com.johnstinson99_at_gmail;

/**
 * Created by John on 28/04/2016.
 */
public class Planet extends Point {
    float size;
    int hue;

    Planet(){
        size = (float)(Math.random()*100 + 30);
        hue = (int)(Math.random()*255);
    }

    protected void draw(Galaxy galaxy){
        galaxy.translate(x(), y(), z());
        galaxy.fill(hue, 255, 255);
        galaxy.sphere(size);
        galaxy.translate(-x(), -y(), -z());
        this.move();
    }
}
