package xin.carryzheng.helloscala.exception

/**
  * 抛出异常
  *
  * @author zhengxin
  *         2019-05-24 16:39:47
  */
object ThrowDemo {

  def main(args: Array[String]): Unit = {

    f()

    val res = test()
    println(res.toString)


  }

  def test(): Nothing = {
    throw new ArithmeticException("算术异常") //Exception("异常出现~")
  }

  @throws(classOf[NumberFormatException]) //等同于 NumberFormatException.class
  def f() = {
    "abc".toInt
  }

}
