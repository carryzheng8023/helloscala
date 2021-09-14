package xin.carryzheng.helloscala.chapter06

object Scala10_Object_Object_2 {
    println("aaa")
    def main(args: Array[String]): Unit = {
        println("bbb")
        //new User("zhangsan", 30)
    }
    println("ccc")



    class User() {
        println("1111")
        def this( name : String) {
            this()
            println("2222")
        }

        def this( name : String, age:Int) {
            this(name)
            println("3333")
        }
        println("4444")
    }
}
