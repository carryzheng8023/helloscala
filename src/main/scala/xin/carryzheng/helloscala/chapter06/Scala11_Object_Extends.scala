package xin.carryzheng.helloscala.chapter06

object Scala11_Object_Extends {

    def main(args: Array[String]): Unit = {

        new User("lisi")

        // 11111
        // 33333
        // 44444
        // 66666
    }
    class Person(name:String) {
        println("11111")
        def this() {
            this("zhangsan")
            println("2222")
        }
        println("3333...")
    }
    class User(name:String) extends Person(name) {
        println("4444...")
        def this() {
            this("lisi")
            println("5555...")
        }
        println("6666...")
    }

}
