

object functions {
  
  object math{
    def add(x:Int,y:Int):Int = x+y
    
    def square(x:Int):Int = x*x
  }
  
  def add(x:Int,y:Int):Int = {
    return x+y
  }
  
  def substract(x:Int,y:Int):Int = {
    x - y
  }
  
  def multiply(x:Int,y:Int):Int = x*y
  
  def divide(x:Int,y:Int)= x/y
  
  def main(args:Array[String]){
    println(add(45,15))
    println(substract(45,15))
    println(multiply(45,15))
    println(divide(45,15))
    
    println(math.add(50,12))
    println(math square (5)) // valid for only one argument
    
  }
}