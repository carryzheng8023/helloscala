package xin.carryzheng.helloscala.function

/**
  * 懒加载
  *
  * @author zhengxin
  *         2019-05-24 11:05:57
  */
object LazyDemo {

  /**
    * lazy不能修饰var类型的变量
    * 不单是在调用函数时，加了lazy ,会导致函数的执行被推迟，
    * 我们在声明一个变量时，如果声明了lazy ,那么变量值得分配也会推迟。
    * 比如 lazy val i = 10
    */
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("-----------------")
    println("res=" + res) //在要使用res前，才执行
  }

  //sum 函数，返回和
  def sum(n1: Int, n2: Int): Int = {
    println("sum() 执行了..") //输出一句话
    return n1 + n2
  }

}
