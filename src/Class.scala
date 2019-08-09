/*
 var getter and setter available
 val getter available but not setter
 default none is available
 */

class User1(var name:String,var age:Int) // () constructor, var is muttable

class User2(private var name:String,var age:Int) {// cannot use outside the class
                                                  // if private is used.
 def printName {print(name)} 
}
object Class { // Singleton class , cannot create instances 
  def main(args:Array[String]){
    
    var user1 = new User1("James", 39)
    println(user1.name,user1.age)
    
    user1.name = "Tom"   // override the value
    user1.age = 27      // since it is not val
    println(user1.name,user1.age)
    
    var user2 = new User2("harry",29)
    user2.printName
  }
  
}