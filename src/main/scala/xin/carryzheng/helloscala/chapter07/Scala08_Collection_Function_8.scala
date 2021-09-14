package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala08_Collection_Function_8 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能函数
        // 所谓的功能函数,就是我们提供功能,而函数帮咱们执行功能

        // 1,2,3,4
        // 2,4,6,8
        // 把 A => B, 这个操作称之为转换,映射,集合提供了这样的函数:map
        val list : List[Int] = List(1,2,3,4)

        // map方法可以将集合中的每一条数据进行指定功能的处理.
        def mapFunction( num : Int ): Int = {
            num * 2
        }

        //val strings: List[Int] = list.map(mapFunction)
        val strings: List[Int] = list.map(_ * 2)

        println(strings)


    }

}
