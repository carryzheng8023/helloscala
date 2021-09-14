package xin.carryzheng.helloscala.chapter05

object Scala04_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 定义
        // 对于函数来讲，关心的是什么？ In, Name, Out

        // TODO 无参，无返回值
        def fun1(): Unit = {
            println("fun1...")
        }
        fun1()
        fun1 // 函数如果没有参数，那么调用的时候，小括号可以省略
        // TODO 无参，有返回值
        def fun2(): String = {
            return "zhangsan"
        }

        val name1 = fun2()
        val name2 = fun2
        println(name1)
        println(name2)

        // TODO 有参，无返回值
        // 参数名：参数类型
        def fun3( name : String ): Unit = {
            println(name)
        }

        fun3( "lisi" )
        //fun3  "lisi" // 函数如果有一个参数，那么小括号是不能省略的，但是方法在这个场合是可以的

        // TODO 有参，有返回值
        def fun4( name : String ): String = {
            return "Name : " + name
        }

        val s = fun4("lisi")
        println(s)

        // TODO 多参，无返回值
        def fun5( name:String, age:Int ): Unit = {
            println( name + ", " + age )
        }

        fun5( "zhangsan", 30)// 默认情况下，参数的声明和传值应该匹配，而且匹配方式是从左向右依次匹配

        // TODO 多参，有返回值
        def fun6( name:String, age:Int ): String = {
            return s"Name : ${name}, Age : ${age}"
        }

        val result = fun6("zhangsan", 20)
        println(result)

    }
}
