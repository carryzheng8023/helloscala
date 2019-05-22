package xin.carryzheng.helloscala

/**
  * 分支控制
  *
  * @author zhengxin
  *         2019-05-22 10:27:58
  */
object IfElseDemo {

  def main(args: Array[String]): Unit = {
    val sumVal = 9
    val result =
      if(sumVal > 20){
        "结果大于 20"
      }
    println("res=" + result) //返回的是() 即 Unit
  }

}
