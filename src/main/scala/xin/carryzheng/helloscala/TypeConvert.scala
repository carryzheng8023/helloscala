package xin.carryzheng.helloscala

/**
  * 基本数据类型转换
  *
  * @author zhengxin
  *         2019-05-20 16:19:43
  */
object TypeConvert {

  def main(args: Array[String]): Unit = {

    var n1 = 10
    var n2 = 1.1f
    //有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
    var n3 = n1 + n2


    //(byte, short) 和 char 之间不会自动的转换类型
    var n4: Byte = 10
    //var char1 : Char = n4 // 错误，因为byte不能自动转换char


    val num1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt // 36
    val num2: Int = (10 * 3.5 + 6 * 1.5).toInt // 44
    println(num1 + " " + num2)

    val char1 : Char = 1
    val num3 = 1
    //val char2 : Char = num3 //错


  }

}
