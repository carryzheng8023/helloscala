package xin.carryzheng.helloscala.chapter07

import scala.io.{BufferedSource, Source}

object Scala09_Collection_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - WordCount

        // TODO 1. 读取数据文件,获取原始数据
        //         line
        val source: BufferedSource = Source.fromFile("data/word.txt")
        val list: List[String] = source.getLines().toList
        source.close()

        // TODO 2. 将原始数据进行数据的切分,形成一个一个的单词
        //         line => word1, word2, word3
        val words = list.flatMap(
            line => {
                line.split(" ")
            }
        )

        // TODO 3. 转换数据的结构
        //         word => (word, 1)
        val wordToOne = words.map(
            word => {
                ( word, 1 )
            }
        )

        // TODO 4. 将转换结构后的数据根据单词进行分组操作
        //        Map( ( word, List( (word,1), (word,1), (word,1) )  )  )
        val groupMap: Map[String, List[(String, Int)]] = wordToOne.groupBy(_._1)

        // TODO 5. 对分组后的结果进行数据的统计
        //        Map( ( word, List( (word,1), (word,1), (word,1) )  )  ) => Map( (word, 3) )
//        val wordToCount = groupMap.map(
//            kv => {
//                val word = kv._1
//                val list = kv._2
//                (word, list.size)
//            }
//        )
        // TODO 如果对KV数据进行转换时,K不变,但是只对V进行操作,那么可以使用mapValues
        val wordToCount = groupMap.mapValues(_.size)


        val filterData = wordToCount.filter(
            kv => {
                kv._1 != ""
            }
        )

        // TODO 6. 对统计的结果进行排序(降序)
        //       ( word1, count1 ), (word2, count2), (word3, count3)
        val sortData = filterData.toList.sortBy(_._2)(Ordering.Int.reverse)

        // TODO 7. 对排序后的数据取前3名
        //       ( word1, count1 ), (word2, count2)
        val top3: List[(String, Int)] = sortData.take(3)

        // TODO 8. 将结果打印在控制台上
        //       ( word1, count1 ), (word2, count2)
        top3.foreach(println)

    }

}
