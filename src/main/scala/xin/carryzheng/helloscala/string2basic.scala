package xin.carryzheng.helloscala

/**
  * string和基本类型相互转化
  *
  * @author zhengxin
  *         2019-05-20 17:09:16
  */
object string2basic {

  def main(args: Array[String]): Unit = {


    //基本数据类型转string
    val d1 = 1.2
    val s1 = d1 + "" //以后看到有下划线，就表示编译器做了转换


    //string转基本数据类型
    val s2 = 12
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toDouble
    val num4 = s2.toLong


    //在将 String 类型转成 基本数据类型时，要确保 String 类型能够转成有效的数据，比如我们可以把"123"转成一个整数，但是不能把"hello"转成一个整数
    //val s3 = "hello" println(s3.toInt)

    //在scala中，不是将小数点后的数据进行截取，而是会抛出异常
    val s4 = "12.5"
    //println(s4.toInt) // error
    println(s4.toDouble) // ok


  }

}
