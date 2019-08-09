package Inheritance

class Triangle(var width:Double,var height:Double) extends Polygon
with Shape{
  
  def color: String = "Red"
  
}