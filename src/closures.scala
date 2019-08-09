/*
 A closure is a function which uses one or more
 variable declared outside this function.
 
 impure closure : datatype of variable is var,
 									the variable can change inside or outside the closure
 
 pure closure : datatype of variable is val, and it cannot be changed.
 
 */
import java.util.Date

object clousures {
  
  var number = 20      // free variable
  val add = (x:Int) => x + number
  
  val sum = (x:Int)=> {
    number = number + x
    number
  }
  
  
  
  def main(args:Array[String]){
    number =100      // closure takes the last valid state of variable
    println(add(20))
    
    print(sum(10)) // changes made inside closure are passed into the variable
  }
  
}