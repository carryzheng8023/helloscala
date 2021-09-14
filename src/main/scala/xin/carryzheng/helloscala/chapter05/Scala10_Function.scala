package xin.carryzheng.helloscala.chapter05

object Scala10_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数柯里化 - 库里 Curry
        def test( x : Int, y : Int ): Unit = {
            for ( i <- 1 to x ) { // 5min
                println(i)
            }

            for ( i <- 1 to y ) { // 10min
                println(i)
            }
        }

        val x = 5 // 5min
        val y = 10 // 10min

        //test(x, y)
        // 函数柯里化 可以将完整的参数列表进行拆分，参数之间是独立。
        def test1(x:Int)(y:Int): Unit = {

        }

        test1(10)(20)
    }
}
