object CodeSnippets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 
  //println("Welcome to the Scala worksheet")
  
  for (i <- Array(1,2,3)) println(i);$skip(86); val res$0 = 
  // transform elements to new collection (yield)
  for (i <- Array(1,2,3)) yield i*2;System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(55); val res$1 = 
  //map using place holders.
  Array(1,2,3).map(_ * 2);System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(47); 
  
  val nums = List(1,2,3,4,5).filter(_ < 4);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(60); 
  
  val nums1 = List(1,2,3,4,5).filter(_ < 4).map( _ * 2 );System.out.println("""nums1  : List[Int] = """ + $show(nums1 ))}
}
