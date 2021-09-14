package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable

object Scala04_Collection_Set {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Set - 集
        // 无序，数据不可重复
        //val set : Set[Int] = Set(1,2,3,4,1,2,3)

        // 可变Set集合
        val set = mutable.Set(1,2,3,4)

        //set.add(5)
        //set.add(6)

//        set.update(5, true)
//        println(set)
//        set.update(3, false)
//        println(set)

        set.remove(2)
        println(set)

    }

}
