/*
 container which can give two values (Some or None)
 */

object options {
  
  val lst1 = List(1,2,3)
  val map1 = Map(1->"Tom",2 -> "Harry", 3 -> "John")
  
  val opt1 : Option[Int] = Some(5)
  val opt2 : Option[Int] = None
  
  def main(args:Array[String]){
    
    println(lst1.find( _ > 6)) // None
    println(lst1.find( _ > 1)) // first result
    
    println(map1.get(1)) // instance of Some
    
    println(lst1.find( _ > 1).get) // get values from some use get
    println(map1.get(1).get)
    
    println(map1.get(4).getOrElse("No name")) // avoid exception and return
    
    println(opt2.isEmpty)
    println(opt1.isEmpty)
    println(opt1.get)
    
    
    
  }
}