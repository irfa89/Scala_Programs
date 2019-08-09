

object conditionals {
  def main(args:Array[String]){  
    val x = 20
    val y = 30
    var res = ""
    
    //as statements
    if (x == 20 && y ==30){   // || -> OR, > ,<
      println("True")
      res = "x == 20"
    }else
      println("False")
      res = "x != 20"
      
      println(res)
    
    //as expressions
    val res2 = if ( x!=20 ) "x==20" else "x!=20"
    println(res2)
    
    println(if ( x!=20 ) "x==20" else "x!=20")
    
  }
}