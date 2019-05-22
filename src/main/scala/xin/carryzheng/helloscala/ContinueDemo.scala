package xin.carryzheng.helloscala

/**
  * continue示例
  *
  * @author zhengxin
  *         2019-05-22 18:00:35
  */
object ContinueDemo {

  def main(args: Array[String]): Unit = {

    //1. 1 to 10
    //2. 循环守卫 if (i != 2 && i != 3) 这个条件为 ture,才执行循环体
    //即当i ==2 或者 i == 3时，就跳过
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)
    }
    //也可以写成如下的形式 println("============================")
    for (i <- 1 to 10) {
      if (i != 2 && i != 3) {
        println("i=" + i)
      }
    }
  }

}
