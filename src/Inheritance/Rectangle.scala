
package Inheritance

class Rectangle (var width:Double,var height:Double) extends Polygon 
with Shape{
  
  override def area: Double = width * height // are method must be implemented
  def color:String = "Green"

}

