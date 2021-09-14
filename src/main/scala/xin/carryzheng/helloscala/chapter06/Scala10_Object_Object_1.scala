package xin.carryzheng.helloscala.chapter06

object Scala10_Object_Object_1 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象  - 构造方法

        // 1. scala中的构造方法分为两大类
        //    第一类：主构造函数，主要完成类的初始化 => 类名后面的构造方法就是主构造方法
        //    第二类：辅助构造函数，主要完成类的辅助功能 => 使用this关键字声明的构造方法
        //          辅助构造方法在调用时，必须直接或间接地调用主构造函数，完成类的初始化

        new User()
        new User("zhangsan")
        new User("zhangsan", 20)

        // 2. 辅助构造方法在互相调用时，必须保证提前声明
    }
    class User() {


        // TODO 辅助构造方法
        def this( name : String) {
            this()
        }

        def this( name : String, age:Int) {
            this(name)
        }



        // 构造函数体 & 类体
        var age : Int = _
        //println("user...")
    }
}
