package xin.carryzheng.helloscala

/**
  * 变量定义
  *
  * @author zhengxin
  *         2019-05-09 23:47:04
  */
object VarDemo {

  def main(args: Array[String]): Unit = {
    //编译器，动态的（逃逸分析）
    var age: Int = 10
    var salary: Double = 10.9
    var name: String = "zx"
    var isPass: Boolean = true
    //在scala中，小数默认为Double，整数默认为Int
    var score: Float = 70.9f

    println(s"${age} ${isPass}")

    //类型推导
    var num = 10 //这是num就是Int
    println(num.isInstanceOf[Int])

    //类型确定后，就不能修改，说明 Scala 是强数据类型语言()
    // num = 2.3, 错误


    //在声明/定义一个变量时，可以使用var或者val来修饰，
    //var修饰的变量可改变，val 修饰的变量不可改
    var a = 10 //即 age 是可以改变的.
    a = 30 // ok
    val b = 30
    //b = 40 // val 修饰的变量是不可以改变.

    //scala 设计者为什么设计var和val
    //(1) 在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性，
    //或者是修改对象的属性值, 但是我们很少去改变这个对象本身
    // dog = new Dog() dog.age = 10 dog = new Dog()
    // 这时，我们就可以使用val
    //(2) 因为val没有线程安全问题，因此效率高，scala的设计者推荐我们val
    //(3) 如果对象需要改变，则使用var

    val dog = new Dog
    //dog = new Dog //Reassignment to val
    dog.age = 90 //ok
    dog.name = "小花" //ok
  }

}

class Dog {
  //声明一个 age 属性，给了一个默认值
  var age: Int = 0 //
  //声明名字
  var name: String = "" //
}
