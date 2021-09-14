package xin.carryzheng.helloscala.chapter06

object Scala13_Object_Abstract {

    def main(args: Array[String]): Unit = {

        // 子类重写父类的完整方法时，需要增加override关键字
        // 子类重写父类的抽象方法时，不需要增加override关键字
        println(new User())
    }

    // TODO 抽象类
    abstract class Person {
        def test(): Unit = {

        }
    }
    class User extends Person {
        override def test(): Unit = {

        }
    }

}
