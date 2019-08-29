package xin.carryzheng.helloscala.oo

/**
  *
  * @author zhengxin
  *         2019-05-28 17:01:42
  */
object PropertyDemo {

  def main(args: Array[String]): Unit = {

    val p1 = new Person
    //    println(p1.name) // null
    //    println(p1.address) // String类型

    val a = new A
    println(a.var1)
    println(a.var2)
    println(a.var3)
    println(a.var4)
    println(a.var5)

  }
}

class Person {
  var age: Int = 10
  var sal = 8988.0
  var name = null
  var address: String = null
}

class A {
  var var1: String = _ //null
  var var2: Byte = _ //0
  var var3: Float = _ //0.0
  var var4: Double = _ //0.0
  var var5: Boolean = _ // false
}


