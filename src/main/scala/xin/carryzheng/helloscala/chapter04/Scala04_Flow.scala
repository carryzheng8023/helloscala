package xin.carryzheng.helloscala.chapter04

object Scala04_Flow {

    def main(args: Array[String]): Unit = {
//        val a = 10 to 1 by -1
//        // 循环时，循环变量是val声明，值不能改变
//        for ( i <- a ) {
//            //i = 20
//            println(i)
//        }

        // 字符串为什么可以循环?
        for ( c <- "abc" ) {
            println(c)
        }
    }

}
