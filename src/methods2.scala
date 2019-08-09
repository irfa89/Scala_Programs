/*
Scala - Reduce,fold or scan (Left/Right)
reduceLeft,reduceRight,foldLeft,foldRight,scanLeft,scanRight 
*/

object methods2 {
  
  val lst1 = List(1,2,3,5,7,10,13)
  val lst2 = List("A","B","C")
  
  def main(args:Array[String]){
    println(lst2.reduceLeft( _ + _ )) //concat of alphabets
    println(lst1.reduceLeft( _ + _ )) // sum of digits
    println(lst1.reduceLeft((x,y) => {println(x + "," + y);x+y;}))
    
    println(lst1.reduceLeft(_ - _)) // same as below explanation
    println(lst1.reduceLeft((x,y) => {println(x + "," + y);x-y;}))
    
    println(lst1.reduceRight(_ - _)) // same as below explanation
    println(lst1.reduceRight((x,y) => {println(x + "," + y);x-y;}))
    
    println(lst1.foldLeft(100)(_ + _)) // passed an initial value, same as reduce
    println(lst2.foldLeft("z")(_ + _)) // fold pass start value
    
    println(lst1.scanLeft(100)(_ + _)) // gives map of intermediate results.
    println(lst2.scanLeft("z")( _ + _ )) // returns List
    
  }
}