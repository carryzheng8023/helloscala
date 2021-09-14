package xin.carryzheng.helloscala.chapter07

import scala.io.{BufferedSource, Source}

object Scala09_Collection_WordCount_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - WordCount

        val source: BufferedSource = Source.fromFile("data/word.txt")
        val list: List[String] = source.getLines().toList
        source.close()

        list.flatMap(_.split(" "))
            .map( (_,1) )
            .groupBy(_._1)
            .mapValues(_.size)
            .filter(_._1 != "")
            .toList.sortBy(_._2)(Ordering.Int.reverse)
            .take(3)
            .foreach(println)

    }

}
