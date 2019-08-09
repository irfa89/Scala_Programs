

object matchExpression {
  def main(args:Array[String]){
    val age = 100
    
    val color = "Blue"
    
    // as statement 
    age match {
      case 20  => println(age)
      case 50  => println(age)
      case 30  => println(age)
      case 40  => println(age)
      case 18  => println(age)
      case _  => println("Default")   // _ is case when it does not match
    }
    
    color match {
      case "Blue" => println(color)
      case _ => println("Default")
    }
    
    // as expression
    val name = "YYYY"
    
    val res = name match{
                          case "XXXX" => name
                          case _ => "default"
                          }
    println(res)
    
    val i = 7
    
    i match {
      case 1 | 3 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 => println("even")
    }
    
    
  }
}