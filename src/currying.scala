/*
 Currying is the technique of transforming a function
 that takes multiple arguments into a function that takes
 a single argument.
 */

object currying {
  
  def add(x:Int) = (y:Int) => x + y  // add and Add are equivalent
  def Add (x:Int) (y:Int) = x + y    // simpler curry function
  
  
  def main(args:Array[String]){
    
    println(add(10)(20))
    
    val sum40 = add(40)
    println(sum40(100))
    
    println(Add(20)(30))
    
    val sum50 = Add(50)_  // has to be use wildcard for simpler curry function
    println(sum50(400))
    
  }
}