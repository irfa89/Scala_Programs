package worksheets

object controlStructures {
 /*
val a = Array("apple","banana","orange")
for (e <- a){
val s = e.toUpperCase
println(s)
}
val newArray = for (e <- a) yield e.toUpperCase

for (i <- 0 until a.length){
println(s"$i is ${a(i)}")
}

for ((e,count) <- a.zipWithIndex) {
println(s"$count is $e")
}

for (i <- 1 to 10 if i < 4) println(i)
 

val names = Map( "fname" -> "Ron","lname" -> "Jon")
for ((k,v) <- names) println(s"key: $k, value:$v")
                                                  

val a = Array("apple","banana","orange")
a.foreach { e =>
val s = e.toUpperCase
println(s)
}

 
 val array = Array.ofDim[Int](2,2)
 for {
 i <- 0 to 1
 j <- 0 to 1
 } println(s"($i)($j)=${array(i)(j)}")
  */
val fruits = "apple" :: "bananana" :: "orange" :: Nil
                                                  //> fruits  : List[String] = List(apple, bananana, orange)
val out = fruits.map(_.toUpperCase)               //> out  : List[String] = List(APPLE, BANANANA, ORANGE)







































}