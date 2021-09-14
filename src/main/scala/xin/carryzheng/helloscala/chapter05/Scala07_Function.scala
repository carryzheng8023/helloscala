package xin.carryzheng.helloscala.chapter05

import scala.util.control.Breaks

object Scala07_Function {

    def main(args: Array[String]): Unit = {

        // 所谓的抽象，其实就是不完整
        // 所谓的控制抽象，其实就是让不完整的操作可以执行
        // 1. 函数作为参数使用时，参数类型省略输入类型，返回的类型为Unit
        // 2. 传递参数时，只需要传递代码即可，无需完整的函数声明, 传值使用大括号
        // 3. 在执行这个函数时，不能增加小括号
        def test( f : =>Unit ): Unit = {
            f
        }

        //test( ()=>{println("xxx")} )
        //test( val a = 1 + 1 ;println("xxx") )
        test {
            val a = 1 + 1
            println(a)
        }

        Breaks.breakable {
            for ( i <- 1 to 5 ) {
                if ( i == 3 ) {
                    Breaks.break()
                }
                println(i)
            }
        }


        println("main")
    }
}
