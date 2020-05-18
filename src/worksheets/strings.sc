package worksheets

object strings {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 /*
 val s = "Hello, World"
 s.length
 "Hello, World".getClass.getName
  
 "hello".foreach(println)
  
 for (c <- "hello") println(c)
  
 s.getBytes.foreach(println)
 val result = "hello world".filter( _ != 'l')
 "scala".drop(2).take(2).capitalize

 val s1 = "Hello"
 val s2 = "hello"
 val s3 = "H" + "ello"
 
 s1 == s2
 s1 == s3
 
 val s4: String = null
 
 s4 == s3
 s1.toUpperCase == s2.toUpperCase
 
 s1.equalsIgnoreCase(s2)
   
 val foo = """This is
 a multiline
 String"""
 val speech ="""Four score and
 | seven years ago""".stripMargin('|')
  val speech1 ="""Four score and
 | seven years ago""".stripMargin.replaceAll("\n"," ")

 
 "hello world".split(" ").foreach(println)
 val s = "eggs, milk, butter, Coco Puffs"
 s.split(",")
s.split(",").map(_.trim)

"hello world, this is Al".split("\\s+")

val name = "Fred"
val age = 33
val weight = 200.00

println(s"$name is $age years old, and weight $weight pounds.")

println(s"Age next year : ${age + 1}")

println(s"You are 33 years old : ${age == 33}")

println(f"$name is $age years old, and weight $weight%.2f pounds.")
println(f"$name is $age years old, and weight $weight%.0f pounds.")

val s = "%s is %d years old".format(name,age)
println("%s is %d years old".format(name,age))

case class Student(name:String, score: Int)
val hannah = Student("Hannah",95)

println(s"${hannah.name} has a score of ${hannah.score}")


val upper = "hello, world".map(c => c.toUpper)
val upper2 = "hello, world".map(_.toUpper)
val upper3 = "hello, world".filter(_ != 'l').map(_.toUpper)
for (c <- "hello") println(c)
val upper4= for (c <- "hello") yield c.toUpper

val result = for {
c <- "hello, world"
if c != 'l'
} yield c.toUpper

"hello".foreach(println)

 
def toLower(c:Char) : Char = (c.toByte+32).toChar
"HELLO".map(toLower)

val s = "HELLO"
 for (c <- s) yield toLower(c)
 
 
 // Pattern Matching
val numPattern = "[0-9]+".r
val address = "123 Main Street Suite 101"

val match1 = numPattern.findFirstIn(address)
val match2 = numPattern.findAllIn(address)
match2.foreach(println)
val match3 = numPattern.findAllIn(address).toArray

val result = numPattern.findFirstIn(address).getOrElse("no match")

// Replacing Patterns

val address = "123 Main Street Suite 101".replaceAll("[0-9]", "x")
val regex = "[0-9]".r
val newAddress =  regex.replaceAllIn("123 Main Street Suite 101","x")
val result1 = "123".replaceFirst("[0-9]", "x")


// Extracting Patterns of String

val pattern = "([0-9]+) ([A-Za-z]+)".r

val pattern(count,fruit) = "100 Bananas"

"hello".charAt(0)
"hello".charAt(1)
"hello"(2)


class StringImprovements(val s : String) {
def increment = s.map( c => (c+1).toChar)
def decrement = s.map( c => (c-1).toChar)
def hideAll = s.replaceAll(".","*")
def plusOne = s.toInt + 1
def asBoolean = s match {
	case "0" | "zero" | "" | " " => false
	case _ => true
	}
}

implicit def stringToString(s: String) = new StringImprovements(s)

"HAL".decrement
"4".plusOne
"0".asBoolean
"1".asBoolean

*/
}