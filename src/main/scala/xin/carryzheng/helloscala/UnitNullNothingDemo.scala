package xin.carryzheng.helloscala

/**
  * Unit、Null、Nothing类型
  *
  * @author zhengxin
  *         2019-05-15 09:16:03
  */
object UnitNullNothingDemo {

  def main(args: Array[String]): Unit = {

    val res = sayHello()
    println("res=" + res)


    //Null类只有一个实例对象，null类似于Java中的null引用。null可以赋值给任意引用类型(AnyRef)，
    //但是不能赋值给值类型(AnyVal: 比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)
    val dog: Dogg = null
//    val char1: Char = null //错误
    println("ok~~~")

  }

  //Unit 等价于 java 的 void,只有一个实例值()
  def sayHello(): Unit = {

  }

}

class Dogg {}