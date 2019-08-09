

object loops {
  def main(args:Array[String]){
    var x = 0
    var y = 3
    
    while(x < 5){
      println("x = " + x)
      x += 1   //  x++,++x (prefix or suffix) not supported
    }
    
    do{    // run at least once
    println("y = "+ y)
    y += 1
    }while(y < 3)
    
  }
  
}