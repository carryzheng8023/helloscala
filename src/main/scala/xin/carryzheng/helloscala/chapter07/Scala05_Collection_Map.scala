package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable

object Scala05_Collection_Map {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Map - 映射
        // map中存储的是键值对，K-V
        // map描述了一个无序，key不能重复的集合
        val kv = "a" -> 1
        val map = Map(
            "a" -> 1, "b" -> 2, "c" -> 3,
            "a" -> 4, "b" -> 5, "c" -> 6,
            "e" -> 4, "f" -> 5, "g" -> 6
        )

        // 可变Map集合
        val map1 = mutable.Map(
            "a" -> 1, "b" -> 2, "c" -> 3,
            "a" -> 4, "b" -> 5, "c" -> 6,
            "e" -> 4, "f" -> 5, "g" -> 6
        )

        map1.put("aa", 11)
        map1.update("bb", 22)
        map1.remove("a")

        println(map1)
        map1.keysIterator
        map1.valuesIterator
        map1.keys
        map1.values
    }

}
