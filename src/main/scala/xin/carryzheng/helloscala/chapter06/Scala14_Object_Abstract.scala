package xin.carryzheng.helloscala.chapter06

object Scala14_Object_Abstract {

    def main(args: Array[String]): Unit = {

        // TODO 抽象属性
        // 不完整的属性(只有声明，没有初始化)，就称之为抽象属性
        // 子类需要将属性补充完整

        // 编译时，抽象属性并不会编译为属性，而是编译为抽象的set，get方法
        // 子类将父类的属性补全，其实底层编译的就是普通的属性

        new User().test()
    }

    class Person {
        //var name:String
        val name:String = "zhangsan"

        def test(): Unit = {
           //name = "wangwu" // 给属性赋值，调用属性的set方法
            println(name)   // 访问属性，调用属性的get方法
        }
    }
    class User extends Person {
        //var name:String = _
        override val name:String = "lisi"
    }

}
