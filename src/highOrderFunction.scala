/*
 High Order Functions take arguments and return functions
*/

object highOrderFunction {
  
  def math(x:Double,y:Double,f:(Double,Double)=> Double):Double = f(x,y);
  
  def Math(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double = f(f(x,y),z)
  
  def main(args:Array[String]){
    
    val result1 = math(50,20, (x,y)=> x+y) // _+_ equivalent
    println(result1)
    val result2 = math(50,20, (x,y)=> x*y)  // _*_ equivalent
    println(result2)
    
    val result3 = math(30,20, (x,y)=> x min y)
    println(result3)
    val result4 = math(30,20, (x,y)=> x max y)
    println(result4)
    
    val result5 = Math(10,20,30, (x,y) => x+y)
    println(result5)
    
    val result6 = Math(10,20,30, (x,y) => x*y)
    println(result6)
    
    val result7 = Math(10,20,30, (x,y) => x min y)
    println(result7)
    
    val result8 = Math(10,20,30,_+_) // _ wild card
    println(result8)
    
    val result9 = Math(10,20,30,_*_) // _ wild card
    println(result9)
    
    val result10 = Math(10,20,30,_ max _) // _ wild card
    println(result10)
    
  }
  
}