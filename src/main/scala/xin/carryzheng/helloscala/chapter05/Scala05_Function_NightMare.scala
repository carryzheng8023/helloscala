package xin.carryzheng.helloscala.chapter05

object Scala05_Function_NightMare {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 噩梦版

        // TODO 马丁想：希望程序员在写程序时，心情是愉悦的，心态是美好的。 爽！！！简单
        //      如何让程序变的简单：代码量少，逻辑清晰
        //      至简原则：能简单则简单，能简化则简化，总结来讲：能省则省
        def test(): String = {
            return "zhangsan"
        }

        // TODO 1. 如果函数体中存在return关键字返回结果，那么这个关键字可以省略
        def test1(): String = {
            val age = 30
            if ( age == 30 ) {
                "zhangsan"
            } else {
                "lisi"
            }
        }

        // TODO 2. 如果通过返回值推断出类型，那么返回值类型可以省略
        def test2() = {
            val age = 30
            if ( age == 30 ) {
                "zhangsan"
            } else {
                123
            }
        }

        // TODO 3. 如果逻辑代码只有一行,大括号可以省略
        def test3() = println("123")

        // TODO 4. 如果参数列表中没有声明参数，意味着不需要传递参数，那么小括号可以省略的
        def test4 = println("456")

        //println(test())
        //test4
        //test4() // 如果函数明确声明没有参数（省略小括号），那么调用时不能增加小括号

        // 为什么scala中要使用关键字来区分方法和变量
        // def name = "zhangsan"
         //val age = 10

        // TODO 5. 如果希望函数的返回值类型省略（自动推断），又希望return关键字不起作用，
        //         可以在省略返回值类型时，同时将等号省略,将这样的函数称之为过程函数
        // 如果函数明确使用Unit声明返回值类型，那么return不起作用
        def test5(): Unit = {
            return "zhangsan"
        }
        // 如果逻辑代码中存在return操作，那么必须声明返回值类型
        def test55() : String = {
            return "zhangsan"
        }
        def test555()  {
            return "zhangsan"
        }

        // TODO 6. 如果在特殊场景下，名称没有那么重要的时候，关键字def和函数的名称可以省略
        //         需要使用特殊的方式告诉编译器，省略的代码是函数声明,将这样的函数称之为匿名函数
        //         匿名函数不能直接运行，因为没有名称
        def test6(x:Int, y:Int) = {
            x + y
        }
        val f = (x:Int, y:Int) => {
            x + y
        }

        //println(f(10, 20))

        println(List(1, 2, 3).reduce(_ - _))



    }
}
