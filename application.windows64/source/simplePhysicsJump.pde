float speed = 0;
float gravity = 0.1;
float x, y, w, h;

void setup() {
  size(400, 400);
  w = 20;
  h = 20;
  x = width/2;
  y = height-h/2;
}

void draw() {
  background(0);
  drawBox();
}

void drawBox() {
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