package xin.carryzheng.helloscala.visit

/**
  *
  * @author zhengxin
  *         2020-07-01 17:07:00
  */
object TestVisit {

  def main(args: Array[String]): Unit = {
    val c = new Clerk()
    c.showInfo()

    //同包下 protected关键字不能访问
    //c.sal

    Clerk.test(c)

    val p1 = new Person()

    println(p1.name)


  }

}


//类
class Clerk {

  var name: String = "Jack"
  private var age: Int = 27
  protected var sal = 9999.99

  def showInfo(): Unit = {
    println("name: " + name + " , age: " + age)
  }

}

// 当同一个文件中出现class Clark 和 objec Clark 的时候
// class Clark 被称为伴生类
// object Clark 被称为伴生对象
// scala将static关键字去掉了，使用伴生对象代替
// 在伴生类写非静态内容，在半生对象中写静态内容
object Clerk {

  def test(c: Clerk): Unit = {
    //私有属性可以在伴生对象中访问
    println("test(): name = " + c.name + ", age = " + c.age)
  }

}


class Person {
  //[包名] 增加包访问权限
  //仍然是私有的 在visit包下可以访问 包括其子包 相当于扩大了访问范围
  private [visit] val name = "Tom"
}