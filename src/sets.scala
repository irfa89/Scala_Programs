/*
collection of different elements of same data type.
cannot have duplicate values
sets are not ordered - so cannot index sets - no index
sets can be of two types mutable and immutable
 */

object sets {
  
  var set1 = scala.collection.mutable.Set(1,2,3,9,6,5)  // mutable   
  var set2 = scala.collection.mutable.Set(7,8,4,6,5)
  val names:Set[String] = Set("Max","Tom","Joe") // immutable
  
  def main(args:Array[String]){
    println(set1 + 10) // add element to set.
    print(set1)      // set elements does not change.
    println(set1(5))   // returns boolean for element present.
    println(set1.head, set1.tail, set1.isEmpty)
    
    println(set1 ++ set2) // concat
    println(set1.++(set2)) // concat 
    
    println(set1.&(set2)) // intersection
    println(set1.intersect(set2)) //intersection
    
    println(set1.max,set1.min)
    
    set1.foreach(println) // iterate and print all values
    
    for (name <- names){
      println( name + " " )
      }
    
  }
}