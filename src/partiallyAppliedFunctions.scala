import java.util.Date

object partiallyAppliedFunctions {
  
  def log(date : Date,message:String)={
    println(date + "   " + message)
  }
  
  def main(args:Array[String]){
    
    // fully applied function
    val sum = (a:Int,b:Int, c: Int) => a+b+c
    
    // partially applied function * use wildcard
    val f = sum(10,20,_:Int)
    println(f(30))
    
    val g = sum(10,_:Int,_:Int)
    println(g(20,1))
    
    val date = new Date
    var newLog = log(date,_:String)
    newLog("Message 1")
    newLog("Message 2")
    
  }
}