package xin.carryzheng.helloscala.chapter06

object Scala12_Object_Abstract {

    def main(args: Array[String]): Unit = {

        // 抽象类无法实例化
        println(new User())
    }

    // TODO 抽象类
    abstract class Person {
        println("person...")
        // TODO 抽象方法
        def test()
    }
    class User extends Person {
        def test(): Unit = {

        }
    }

}
