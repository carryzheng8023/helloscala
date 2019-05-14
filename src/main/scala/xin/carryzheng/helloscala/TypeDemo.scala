package xin.carryzheng.helloscala

/**
  * 数据类型
  *
  * @author zhengxin
  *         2019-05-13 23:35:57
  */
object TypeDemo {

  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    //因为 Int 是一个类，因此他的一个实例，就是可以使用很多方法
    //在scala中，如果一个方法，没有形参，则可以省略()
    println(num1.toDouble + "\t" + num1.toString + "\t" + 100.toDouble)

    var isPass = true
    println(isPass.toString)

    sayHi()
    sayHi

    //    println(sayHello)


    var num = 1.2 //默认为 double
    var num2 = 1.7f //这是 float
    //num2 = num //error
    //修改
    num2 = num.toFloat


    println("byte取值范围：" + Byte.MinValue + "~" + Byte.MaxValue)
    println("short取值范围：" + Short.MinValue + "~" + Short.MaxValue)
    println("int取值范围：" + Int.MinValue + "~" + Int.MaxValue)
    println("long取值范围：" + Long.MinValue + "~" + Long.MaxValue)

    var e = 9223372036854775807L //9223372036854775807 超过int 加L


    println("float取值范围：" + Float.MinValue + "~" + Float.MaxValue)
    println("double取值范围：" + Double.MinValue + "~" + Double.MaxValue)

    //2.2345678912f , 2.2345678912
    var n1: Float = 2.2345678912F
    var n2: Double = 2.2345678912
    println("n1=" + n1 + "\t" + "n2=" + n2)

  }

  def sayHi(): Unit = {
    println("say hi")
  }

  //比如开发中，我们有一个方法，就会异常中断，这时就可以返回 Nothing
  //即当我们 Nothing 做返回值，就是明确说明该方法没有没有正常返回值
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }

}
