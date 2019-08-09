/*
 Lazy - evaluated when called
 Strict type - Java
 Lazy type - Haskel
 strict but can be lazy if explicit mentioned - lazy
 
 lazy evaluation can also be achieved by call by name method.
 */

class strict{
  val e = {
    println("strict")
    9
  }
}

class LazyEval{
  lazy val l = {
    println("lazy")
    9
  }
}
  

object lazyEvaluation {
  
  def method1(n:Int){
    println("Method 1")
    println(n)
  }
  
  def method2(n: => Int){   // call by value method
        println("Method 2")
    println(n)
  }
  
  
  def main(args:Array[String]){
    
    val e = 9
    println(e)
    lazy val l = 9 // value will be assigned when used somewhere.
    
    val x = new strict
    val y = new LazyEval;
    
    println(x.e)
    println(y.l)
    
    val add = (a:Int,b:Int) => {
      println("Add")
      a + b
    }
    method1(add(5,6))
    method2(add(5,6))
    
    
    
  }
  
}