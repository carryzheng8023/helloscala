package xin.carryzheng.helloscala


/**
 *
 * @author zhengxin
 *         2021-09-22 15:47:47
 */
object Test {

  def main(args: Array[java.lang.String]): Unit = {
    val str = new String
    str.test()
  }
}

class String{
  def test(): Unit ={
    println("hello String")
  }
}
