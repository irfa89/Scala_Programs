/*
predicate is a function which return a boolean value
*/

object methods1 {
  
  val lst = List(1,2,3,5,7,10,13)
  val map1 = Map (1 -> "Tom", 2 -> "Harry", 3 -> "James")
  
  def main(args:Array[String]){
    println(lst.map( _ * 2))   // new list
    println(lst.map(x => x*2)) // same as above
    println(lst.map( _ + 2))
    println(lst.map( _ + "hi"))
    println(map1.map(x => "hi" + x)) // hi(1,Tom) .. tuples of k,v - List
    println(map1.mapValues(x => "hi" + x)) // apply on values
    println("hello".map(_.toUpper)) 
    println(List(List(1,2,3),List(3,4,5))) // List of List
    println(List(List(1,2,3),List(3,4,5)).flatten) // gives one list
    println(lst.flatMap(x => List(x,x+1))) // flatten + map => flatMap
    
    println(lst.filter( x => x%2 == 0)) // filter is used with predicate.
    
  }
}