package xin.carryzheng.helloscala.function

/**
  * 函数定义
  *
  * @author zhengxin
  *         2019-05-24 09:09:43
  */
object FuncDemo {

  def main(args: Array[String]): Unit = {

    val n1 = 10
    val n2 = 20
    println("res=" + getRes(n1, n2, ')'))


    //形参列表和返回值列表的数据类型可以是值类型和引用类型
    val tiger = new Tiger
    val tiger2 = setTigerName(10, tiger)
    println(tiger2.name) // jack
    println(tiger.name) // jack
    println(tiger.hashCode() + " " + tiger2.hashCode())


    def f1(): Unit = { //ok private final
      println("f1")
    }

    //Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，即:函数中可以再声明/定义函数，
    //类中可以再声明类 ，方法中可以再声明/定义方法
    def sayOk(): Unit = { // private final sayOk$1 ()
      println("main sayOk")

      def sayOk(): Unit = { //private final sayOk$2 ()
        println("sayok sayok")
      }
    }

    //可变参数
    println(sum(10, 20, 30, 40))


  }

  //定义函数/方法
  def getRes(n1: Int, n2: Int, op: Char) = {
    if (op == '+') {
      //返回
      n1 + n2
    } else if (op == '-') {
      n1 - n2
    } else {
      //返回 null
      null
    }
  }

  def setTigerName(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name = "jack"
    tiger
  }

  //Scala中的函数可以根据函数体最后一行代码自行推断函数返回值类型。
  //那么在这种情况下，return关键字可以省略
  def getSum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  //因为Scala可以自行推断，所以在省略return关键字的场合，返回值类型也可以省略
  def getSum2(n1: Int, n2: Int) = {
    n1 + n2
  }

  /** 如果函数明确使用return关键字，那么函数返回就不能使用自行推断了
    * 这时要明确写成 : 返回类型 = ，当然如果你什么都不写，即使有return返回值为()
    */
  //如果写了return ,返回值类型就不能省略
  def getSum3(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //如果返回值这里什么都没有写，即表示该函数没有返回值
  //这时return无效
  def getSum4(n1: Int, n2: Int) {
    return n1 + n2
  }

  //如果函数明确声明无返回值(声明Unit)
  //那么函数体中即使使用return关键字也不会有返回值
  def getSum5(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }

  //如果明确函数无返回值或不确定返回值类型，那么返回值类型可以省略(或声明为Any)
  def f1(s: String) = {
    if (s.length >= 3)
      s + "123"
    else
      3
  }

  def f2(s: String): Any = {
    if (s.length >= 3)
      s + "123"
    else
      3
  }


  def sayOk(): Unit = { //成员
    println("main sayOk")
  }


  def sum(n1: Int, args: Int*): Int = {
    println("args.length" + args.length) //遍历
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }

}

class Tiger {
  //一个名字属性
  var name = ""
}