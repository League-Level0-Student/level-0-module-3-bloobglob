void setup(){
  for(int i = 99; i > -1; i--){
    int i2 = i-1;
    if(i>1){
      println(i+ " bottles of beer on the wall, " + i + " bottles of beer.");
      println("Take one down and pass it around, " + i2 + " bottles of beer on the wall.");
    }else if(i==1){
      println(i+ " bottles of beer on the wall, " + i + " bottles of beer.");
      println("Take one down and pass it around, no more bottles of beer on the wall");
    }else{
      println("No more bottles of beer on the wall, no more bottles of beer.");
      println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
  }
}
