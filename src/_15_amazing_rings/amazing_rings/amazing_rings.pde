int x = 1;
int x2 = 999;
int speed = 4;
void setup(){
    size(1000, 500);
}
void draw(){
background(#C1BBBB);
noFill();
  for(int i=35; i>0; i--){
      ellipse(x, 250, i*15, i*15);
    }
  for(int i=35; i>0; i--){
      ellipse(x2, 250, i*15, i*15);
    }
x+=speed;
x2-=speed;
if(x<=0){
speed=-speed;
}else if(x>=1000){
  speed=-speed;
}
}
