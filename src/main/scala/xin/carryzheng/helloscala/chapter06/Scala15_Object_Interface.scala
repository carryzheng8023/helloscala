package xin.carryzheng.helloscala.chapter06

object Scala15_Object_Interface {

    def main(args: Array[String]): Unit = {

        // TODO 马丁在scala中删除了接口的概念
        // scala中可以将多个对象的相同的特征从对象中剥离出来，形成一个特殊的语法结构，这个结构称之为特征（特质）
        // 如果一个对象符合这个特征，那么就可以将这个特征混入到对象中
        // 这里的特征（特质）使用关键字trait声明

        // TODO 动态混入
        val user = new User() with Runnable
        user.run()


    }
    trait Runnable {
        def run(): Unit = {
            println("123")
        }
    }
    class User {

    }
}
