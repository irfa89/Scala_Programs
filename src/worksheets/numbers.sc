package worksheets

object numbers {
/*

Short.MinValue
Short.MaxValue
Int.MinValue
Float.MinValue

"100".toInt
"100".toDouble
"100".toFloat
"1".toLong
"1".toShort

val b = BigInt("1")
val a = BigDecimal("3.14159")

Integer.parseInt("1",2)
Integer.parseInt("10",2)


implicit class StringToInt(s: String){
def toInt(radix:Int) = Integer.parseInt(s,radix)
}
"1".toInt(2)
"100".toInt(2)


def toInt(s:String):Option[Int] = {
	try{
	Some(s.toInt)
	}catch{
	case e: NumberFormatException => None
	}
}

println(toInt("1").getOrElse(0))
println(toInt("a").getOrElse(0))

val x = toInt("b").getOrElse(0)

val a = 1000L
a.isValidByte
a.isValidShort

val b = 0 : Byte
val c = 0 : Int
val d = 0 : Short

val a = 0x20
val b = 0x20L


def ~=(x:Double, y:Double, precision:Double)={
	if ((x - y).abs < precision) true else false
}

val a = 0.3
val b = 0.1 + 0.2
~=(a,b,0.0001)


val r = scala.util.Random

r.nextInt
r.nextInt(100)
r.nextPrintableChar

val range = 0 to r.nextInt(10)

for (i <- 0 to r.nextInt(10)) yield i*3
for (i <- 0 to r.nextInt(10)) yield (i*r.nextFloat)
*/
val r = 1 to 10                                   //> r  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
val r1 = 1 to 10 by 2                             //> r1  : scala.collection.immutable.Range = inexact Range 1 to 10 by 2

for (i <- 1 to 5) println(i)                      //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
for (i <- 1 until 5) println(i)                   //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4






























}