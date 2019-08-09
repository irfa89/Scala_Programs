

object anonymousFunctions {
  
  object math{
    def add(x:Int = 45,y:Int =15):Int = {
      x + y        // +,*,- is not an operator but a function
    }
    
    def **(x:Int) = x*x
  }
  
  def pn(x:Int,y:Int):Unit = {   // Unit does not return anything.
    println(x+y)
  }
  
  def main(args:Array[String]){
    println(math.add())
    println(math.add(10))
    pn(40,12)
    println(math.**(2))
    
    // Anonymous function
    var add = (x:Int,y:Int) => x+y
    println(add(300,2))
    
  }
  
}