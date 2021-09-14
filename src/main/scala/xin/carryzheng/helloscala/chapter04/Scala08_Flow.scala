package xin.carryzheng.helloscala.chapter04

import scala.util.control.Breaks._

object Scala08_Flow {

    def main(args: Array[String]): Unit = {

        // break(没有), continue(没有)
//        Breaks.breakable {
//            for ( i <- 1 to 5 ) {
//                if ( i == 3 ) {
//                    Breaks.break()
//                }
//                println(i)
//            }
//        }
//        println("main....")

        breakable {
            for ( i <- 1 to 5 ) {
                if ( i == 3 ) {
                    break
                }
                println(i)
            }
        }
        println("main....")

    }

}
