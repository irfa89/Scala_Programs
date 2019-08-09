

object stringInterpolation {
  def main(args:Array[String]){
    val name = "mark"
    val age = 18.0
    
    // Concatanation
    println(name + " is " + age + " years") 
    
    // s string interpolation - not type safe
    println(s"$name is $age years old")  
    
    //f string interpolation - type safe
    println(f"$name%s is $age%f years old")
    
    //raw interpolation
    println(raw"hello \nworld")
    println(s"hello \nworld")
    
  }
}