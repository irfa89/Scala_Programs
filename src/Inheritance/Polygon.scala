package Inheritance

trait Shape{
  def color:String
}

abstract class Polygon {
  
  def area:Double = 0.0; // no body then abstract method
  
}

object Polygon{
  def main(args:Array[String]){
    
  //  var rect = new Rectangle(55.2,20.0)
  //  printArea(rect)
    
    
    var tri = new Triangle(55.2,20.0)
    printArea(tri)
    println(tri.color)
  }
  
  def printArea(p: Polygon){
    println(p.area)
  }
  
}