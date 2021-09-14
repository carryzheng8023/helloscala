package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable

object Scala05_Collection_Map_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Map - 映射
        val map = Map(
            "a" -> 1, "b" -> 2, "c" -> 3
        )

        // Option : Some None
        val maybeInt: Option[Int] = map.get("a")
        val maybeInt1: Option[Int] = map.get("d")
        //println(maybeInt1.get)
//        if ( maybeInt1.isEmpty ) {
//            println("数据不存在")
//        } else {
//            println(maybeInt1.get)
//        }

        //println(maybeInt.getOrElse(0))

        println(map.getOrElse("d", 0))
    }

}
