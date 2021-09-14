package xin.carryzheng.helloscala.chapter05

object Scala09_Function {

    def main(args: Array[String]): Unit = {

        // TODO 闭包的产生
        // 1. 内部函数返回到外部使用
        // 2. 函数访问外部的变量，并改变其生命周期
        // 3. 将函数作为对象使用
        // 4. 所有的匿名函数都是闭包

        val x  = 10
        def test(y : Int): Unit = {
            println(x + y)
        }

        val f = test _
        f(20)

//        def outer( x : Int) = {
//            def inner( y : Int): Unit = {
//                println(x + y)
//            }
//            inner _
//        }
//
//        outer(10)(20)
    }
}
