package xin.carryzheng.helloscala

/**
  * while循环示例
  *
  * @author zhengxin
  *         2019-05-22 15:54:59
  */
object WhileDemo {

  def main(args: Array[String]): Unit = {

    //输出 10 句 hello,scala
    //1. 定义循环变量
    var i = 0
    //2.i<10 条件
    while (i < 10) {
      println("hello,scala" + i) //循环体
      i += 1 //循环变量迭代
    }


    i = 0 // for
    do {
      printf(i + "hello,scala\n")
      i += 1
    } while (i < 10)

  }

}
