// Arrays - fixed size and same datatype.
// index starts from 0
/*
 Default of Array Int = 0, String = null, Bool =  False
 */

import Array._

object Arrays {
  
  val arr1:Array[Int] =new Array[Int](4) 
  val arr2 = new Array[Int](5)         
  val arr3 = Array(1,2,3,4,5,6)
  
  def main(args:Array[String]){
    
    arr1(0) = 20
    arr1(1) = 10
    arr1(2) = 30
    arr1(3) = 40
    
    println(arr1)
    
    for (z <- arr1){
      println(z)
    }
    
    for (i <- 0 to (arr1.length - 1)){
      println(i,arr1(i)) 
    }
      
    val result = concat(arr1,arr3)
    for (x <- result)
      print(x + " ")
    
    
    
  }
}