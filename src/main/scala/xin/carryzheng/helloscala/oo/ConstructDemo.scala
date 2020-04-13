package xin.carryzheng.helloscala.oo

import scala.beans.BeanProperty

/**
  *
  * @author zhengxin
  *         2019-08-30 10:23:44
  */
object ConstructDemo {

  def main(args: Array[String]): Unit = {
    val p = new People("jack", 20)
    println(p.age)

    val worker = new Worker("zhang san")
    println(worker.name) //不能访问inName

    val worker2 = new Worker2("li si")
    println(worker2.name)
    println(worker2.inName)

    val worker3 = new Worker3("wang wu")
    println(worker3.inName)
    worker3.inName = "fake name"
    println(worker3.inName)

  }


}

/**
  * 1、父类构造器
  * 2、主构造器
  * 3、辅助构造器
  */
class People() {
  @BeanProperty
  var name: String = _
  @BeanProperty
  var age: Int = _

  // 辅助构造器
  def this(name: String, age: Int) {
    this() //必须先调用主构造器
    this.name = name
    this.age = age
  }

  override def toString: String = {
    "name:" + this.name + ",age:" + this.age
  }
}

//如果 主构造器是Worker(inName: String)， 那么inName就是一个局部变量
class Worker(inName: String){
  var name = inName
}

//如果 主构造器是Worker2(val inName: String)， 那么inName就是Worker2的一个private的只读属性
class Worker2(val inName: String){
  var name = inName
}
//如果 主构造器是Worker3(var inName: String)， 那么inName就是Worker3的一个private的可读写的属性
class Worker3(var inName: String){
  var name = inName
}
