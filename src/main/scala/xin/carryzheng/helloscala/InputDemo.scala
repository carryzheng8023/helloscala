package xin.carryzheng.helloscala

import scala.io.StdIn

/**
  * 键盘输入示例
  *
  * @author zhengxin
  *         2019-05-22 09:16:37
  */
object InputDemo {

  def main(args: Array[String]): Unit = {

    //要求:可以从控制台接收用户信息，【姓名，年龄，薪水】
    println("请输入姓名")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println("请输入薪水")
    val sal = StdIn.readDouble()
    printf("用户的信息为 name=%s age=%d sal=%.2f", name, age, sal)

    println()

    Cat.sayHi()
    Cat.sayHello()

  }

}

//声明了一个对象(伴生对象)
object Cat extends AAA {
  //方法
  def sayHi(): Unit = {
    println("小狗汪汪叫....")
  }
}

trait AAA { //AAA是特质，等价于java中的interface + abstract class
  def sayHello(): Unit = {
    println("AAA sayHello")
  }
}