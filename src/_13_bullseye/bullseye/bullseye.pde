void setup(){
  size(500, 500);
  for(int i=10; i>0; i--){
    if(i%2==0){
      fill(#FF0000);
      ellipse(250, 250, i*50, i*50);
    }else{
      fill(#000000);
      ellipse(250, 250, i*50, i*50);
    }
  }
}
