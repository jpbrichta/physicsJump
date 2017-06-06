import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class simplePhysicsJump extends PApplet {

float speed = 0;
float gravity = 0.1f;
float x, y, w, h;

public void setup() {
  
  w = 20;
  h = 20;
  x = width/2;
  y = height-h/2;
}

public void draw() {
  background(0);
  drawBox();
}

public void drawBox() {
  if (mousePressed && y >= height-h/2) {
    speed = -5;
    mousePressed = false;
  }
  speed += gravity;
  y += speed;
  if (y > height - h/2) {
    speed =0;
    y = height - h/2;
  }
  rectMode(CENTER);
  rect(x, y, w, h);
}
  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "simplePhysicsJump" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
