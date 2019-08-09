/*
Collection of similar data types, index starts from 0

Arrays are muttable and list is immuttable (can not changed)
Array are flat and list is linked list

List - nil , cons ( ::) -> prepend 
 */

object lists {
  
  val lis1:List[Int] = List(1,2,3,5,8)
  val names:List[String] = List("Tom" , "Harry", "Ron")
  
  def main(args:Array[String]){
    println(lis1)
    println(names)
    
    println(0 :: lis1)   // using cons 0 prepended  but list does not change
    println(1:: 5:: 9:: Nil)
    
    println(names.head,names.tail) // tail you get all other elements in list except head
    println(names.isEmpty)
    println(lis1.reverse)
    println(List.fill(5)(2)) // crates a list of 5 elements each having 2
    println(lis1.max)
    
    names.foreach(println)
    
    var sum:Int = 0
    lis1.foreach(sum += _) // iterate over list and add to sum.
    println(sum)
    
    for (name <- names){ println(name) }
    println(names(0))
    
    
    
    
    
  }
}