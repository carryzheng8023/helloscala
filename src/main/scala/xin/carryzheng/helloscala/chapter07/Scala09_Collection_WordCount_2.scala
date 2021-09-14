package xin.carryzheng.helloscala.chapter07

import scala.io.{BufferedSource, Source}

object Scala09_Collection_WordCount_2 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - WordCount

        // Hello World Hello World
        // =>
        // (Hello, 2), (World, 2)
        val dataList1 = List(
            "Hello Scala",
            "Hello Spark"
        )

        val dataList2 = List(
            ("Hello Scala", 4), ("Hello Spark", 2)
        )

        val dataList3 = List(
            ("Hello", 1), ("Hello", 1), ("Hello", 1),("Hello", 1),
            (" Scala", 1), (" Scala", 1),(" Scala", 1),(" Scala", 1),
            ("Hello", 1),  ("Hello", 1),
            (" Spark", 1),(" Spark", 1)
        )

        // (Hello, 4), (scala,4),(Hello,2),(SPark, 2)
        // (Hello, List( (Hello, 4), (Hello,2) ))
        // (Hello, List( 4, 2 ))
        // (Hello, 6)
        dataList2.flatMap(
            t => {
                val line = t._1
                val cnt = t._2
                val words = line.split(" ")
                words.map((_, cnt))
            }
        ).groupBy(_._1)
        .mapValues(
            list => {
                list.map( _._2 ).sum
            }
        ).foreach(println)

//        dataList2.map(
//            t => {
//                val word = t._1
//                val cnt = t._2
//                (word + " ") * cnt
//            }
//        ).foreach(println)

        // (Hello, 4)
        // (Hello, 1),(Hello, 1),(Hello, 1),(Hello, 1)
//        val list1 = List( ("Hello", 4) )
//        val list2 = List( ("Hello", 1),("Hello", 1),("Hello", 1),("Hello", 1) )
//        List.fill(4)(("Hello", 1))
//        Array.fill(-1)

    }

}
