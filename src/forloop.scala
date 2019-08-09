

object forloop {
  
  def main(args:Array[String]){
    
    // to  and until is a method which takes one argument
    // <- generator 
    // 1 to 5 is the range
    
    for(i <- 1 to 5){ // print 1 to 5 inclusive   
      // 1.to(5)
      println(i)
    }
    
    for (i <- 1.until(5)) { // goes till 4
      // 1 until 6 is also valid 
      print(i + " ") // prints in same line
    }
    
    println(" ")
    
    for (i <- 1 to 3;j <- 1 to 2){ // Nested loops
      println("i : "+ i + " j : " + j) 
    }
    
    val lst = List("a","b","c",4)
    for (i<-lst){
      print(" list :" + i)
    }
    
    println()
    val l = List(1,2,4,5,6)
    for (i<-l;if i < 6){
      print( " filters :" + i)
    }
    
    println()
    //as expressions
    val result = for {i<- l; if i < 4} yield { i * i}
    print("result: " + result + " ")
    
  }
  
}