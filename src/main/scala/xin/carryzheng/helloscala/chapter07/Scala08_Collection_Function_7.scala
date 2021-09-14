package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable

object Scala08_Collection_Function_7 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - map合并
        val map1 = mutable.Map(
            ("a", 1), ("b", 2), ("c", 3)
        )
        val map2 = mutable.Map(
            ("a", 4), ("d", 5), ("c", 6)
        )

        val wc = map2.foldLeft(map1)(
            (map, kv) => {

                val k = kv._1
                val v = kv._2

                val oldCnt = map.getOrElse(k, 0)
                val newCnt = oldCnt + v
                //map.update(k, newCnt)
                //map
                map.updated(k, newCnt)
            }
        )
        println(wc)


    }

}
