/*
 contains different kind of elements(data types) - heterogenous
 immutable, fixed size once declared,can have 1-22 elements
 */

object tuples {
  
  val tuple1 = (3,2,"James",true) // can have objects also
  val tuple2 = new Tuple3(1,2,"hello") // write no.of elements after tuple
  val tuple3 = new Tuple3("Hello", "World",("a","b")) 
  
  def main(args:Array[String]){
      println(tuple1) 
      println(tuple1._3) // access tuples by . operator
      println(tuple1._2)  // have 4 methods to get elements
      
      tuple1.productIterator.foreach{   // loop in tuple
        i => println(i)
      }
      
      println(1 -> "Tom") // creates tuples and valid for 2 elements
      
      println(1-> "Tom" -> true) // -> joins tuples
      
      println(tuple3._3._2)
  }
}