package xin.carryzheng.helloscala.chapter06

object Scala15_Object_Interface_4 {

    def main(args: Array[String]): Unit = {

        // TODO java不允许类的多继承 -> 钻石问题
        //new User().test()
    }
    trait Test {
        def test(): Unit = {
            println("Test")
        }
    }
    class Person {
        def test(): Unit = {
            println("Person")
        }
    }
//    class User extends Person with Test{
//
//    }
}
