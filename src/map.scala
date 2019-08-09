/*
collection of key value pairs, keys are unique. if keys are duplicate
then will return last key value.

Maps are of two types mutable and immutable.
*/

object map {
  
  val map1: Map[Int,String] = 
    Map(801 -> "Joe", 802 -> "Tom", 804 -> "James")
    
  val map2: Map[Int,String] = Map(806 -> "Ron")
  
  def main(args:Array[String]){
    println(map1)
    println(map1(802))
    println(map1.keys)
    println(map1.values)
    println(map1.isEmpty)
    
    map1.keys.foreach { 
      key => println("key " + key)
      println("Value " + map1(key))
    }
    
    println(map1.contains(801)) // contains to check and avoid exceptions
    
    println(map1 ++ map2)   // concatenation of two maps
    
    
  }
  
}