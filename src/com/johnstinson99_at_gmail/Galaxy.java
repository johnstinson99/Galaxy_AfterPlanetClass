package com.johnstinson99_at_gmail;

import processing.core.PApplet;

/**
 * Graphics class extending PApplet from Processing.org.
 */

public class Galaxy extends PApplet{
    Planet[] planetArray;

    public static void main(String[] args) {
        PApplet.main("com.johnstinson99_at_gmail.Galaxy");
    }

    public void settings(){
        this.size(700,700,P3D);
    }

    public void setup(){
        this.colorMode(PApplet.HSB);
        planetArray = new Planet[20];
        for (int i = 0; i < 20; i++){
            planetArray[i] = new Planet();
        }
    }

    public void draw(){
        // draw() method is repeatedly called, rendering objects on the screen.
        this.background(0);
        this.lights();
        this.noStroke();
        this.translate(width/2, height/2);
        for (Planet aPlanet: planetArray){
            aPlanet.draw(this);
        }
    }
}
