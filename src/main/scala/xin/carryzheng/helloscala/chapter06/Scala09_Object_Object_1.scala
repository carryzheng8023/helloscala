package xin.carryzheng.helloscala.chapter06

class Scala09_Object_Object_1 {

}
object Scala09_Object_Object_1 {
    def main(args: Array[String]): Unit = {

        // TODO - 面向对象 - 单例

        // scala中声明单例对象非常简单，只需要一个关键字即可 : object

        // 当前使用object声明的对象就是单例对象
        // 使用object声明类的时候，可以简单理解为这个单例对象是伴随着类所产生的对象
        // 所以将这个单例对象也称之为伴生对象,而这个类称之为伴生类
        // TODO 伴生类和伴生对象如何区分?
        //println(Scala09_Object_Object_1)
        //println(new Scala09_Object_Object_1())
        // TODO : java中存在静态语法和成员操作
        //        scala没有静态的语法,采用object关键字声明伴生对象，模拟静态语法
        System.out.println("123")
        Scala09_Object_Object_1.test()
        // TODO 伴生类需要通过构建对象来访问其中的属性和方法
        //      而伴生对象可以直接访问其属性和方法，所以一般将静态方法放置在伴生对象中，将成员方法放置在伴生类中

    }
    def  test(): Unit = {

    }
//    class User {
//
//    }
}