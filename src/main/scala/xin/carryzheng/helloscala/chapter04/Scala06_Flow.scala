package xin.carryzheng.helloscala.chapter04

object Scala06_Flow {

    def main(args: Array[String]): Unit = {
        val result = for ( i <- 1 to 5 ) yield {
            i * 2
        }

        // Unit or 1 or 5

        println(result)

        Thread.`yield`()
    }

}
