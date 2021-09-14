package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable

object Scala07_Collection_Par {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 并行
        val list = 1 to 100

        // A => B
//        val result = list.map(num => {
//            Thread.currentThread.getName
//        })
//        println(result)

        val result1 = list.par.map(num => {
            Thread.currentThread.getName
        })
        println(result1)

    }

}
