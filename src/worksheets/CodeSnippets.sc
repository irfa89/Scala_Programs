object CodeSnippets {
  //println("Welcome to the Scala worksheet")
  
  for (i <- Array(1,2,3)) println(i)              //> 1
                                                  //| 2
                                                  //| 3
  // transform elements to new collection (yield)
  for (i <- Array(1,2,3)) yield i*2               //> res0: Array[Int] = Array(2, 4, 6)
  //map using place holders.
  Array(1,2,3).map(_ * 2)                         //> res1: Array[Int] = Array(2, 4, 6)
  
  val nums = List(1,2,3,4,5).filter(_ < 4)        //> nums  : List[Int] = List(1, 2, 3)
  
  val nums1 = List(1,2,3,4,5).filter(_ < 4).map( _ * 2 )
                                                  //> nums1  : List[Int] = List(2, 4, 6)
}