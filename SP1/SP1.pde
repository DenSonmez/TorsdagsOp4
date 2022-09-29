float t;

int numLine = 300;


void setup () {

  background(20);
  size (800, 600);
}

void draw () {
  background(20);
  if(mousePressed){
  stroke (random (255), random (255), random (255));
  } else {
    stroke(255);
  }
  strokeWeight (2);


  translate(width/2, height/2);
  for ( int  i = 0; i < numLine; i++) {
     line(x1(t + i ), y1 (t + i), x2 (t + i), y2 (t + i));
  }
  
  t++;
 
}

float x1(float t) {
       return sin(t / 40) * 100 + sin(t/5 ) *5;
}

float y1(float t) {
  return cos(t / 20) * 100;
}

float x2(float t) {
      return sin(t / 20) * 300 + sin(t ) *2;
}

float y2(float t) {
    return cos(t / 500) * 200+ cos (t /12 ) *40;
}
