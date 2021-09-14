package xin.carryzheng.helloscala.chapter07

object Scala11_Collection {

    def main(args: Array[String]): Unit = {
        val list = List(1,2,3,4,2)
        println(list)
        val set: Set[Int] = list.toSet
        println(set)


        val map: Map[Int, Int] = list.map((_, 1)).toMap
        val list1: List[(Int, Int)] = map.toList
    }


}
