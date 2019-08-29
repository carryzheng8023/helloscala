package xin.carryzheng.helloscala.ex

/**
  *
  * @author zhengxin
  *         2019-08-29 13:44:28
  */
object Ex01 {

  def main(args: Array[String]): Unit = {
    val t = {}
    println("t=" + t + "  " + t.isInstanceOf[Unit]) //()


    //for(int i=10; i>=0; i--) System.out.print(i)
    for(i <- 0 to 10 reverse){
      print(i)
    }


    val list = List(1, 2 ,3)
    println(list.reverse)
    println((1 to 3).reverse)

    (0 to 3).reverse.foreach(print)
    (0 to 3).reverse.foreach(myshow)

    println()


    var res : Long = 1
    "Hello".foreach(res *= _.toLong)
    println(res)


  }

  def myshow(n:Int): Unit = {
    print(n)
  }

}
