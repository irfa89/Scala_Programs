/*
 auxiliary constructors are alternative constructors of the class
 this defines aux. constructors :
 1. different signatures - class can many
 2. they must called previously defined constructor
*/
class User3(var name:String, val age:Int){
  def this(){
    this("Tom",32)
  }  
  def this(name:String){
    this(name,32)
  }              
}

object auxilaryConstructor {
  def main(args:Array[String]){
    
    var user1 = new User3("Jai",30)
    var user2 = new User3()
    var user3 = new User3("Max")
    
    
  }
}