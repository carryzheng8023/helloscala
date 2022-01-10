package xin.carryzheng.helloscala

/**
 *
 * @author zhengxin
 *         2021-09-25 09:53:31
 */
object Test2 extends App{

  val list = List(1,2,3)

//  def zxPrint(num: Int) : Unit = {
//    println("hh:" + num)
//  }
//  list.foreach(zxPrint)
//
//  list.foreach((num: Int) => println("hh:" + num))
//  list.foreach(num => println("hh:" + num))
//  list.foreach(num => {
//    println(num)
//    println("hh")
//  })



//  list.foreach( println("hh:" + _))

//  println("============list.foreach(println)=============")
//  list.foreach(num => println(num+2))
//  list.foreach(println(_))
//  list.foreach(println)
//
//  println(list.reduce(_+_))

  val ints: List[Int] = list.map(_ * 2)
  println(ints)


}
