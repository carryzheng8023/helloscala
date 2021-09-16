package xin.carryzheng.helloscala.winter.service

import xin.carryzheng.helloscala.winter.common.TService
import xin.carryzheng.helloscala.winter.dao.WordCountDao

class WordCountService extends TService {

    private val wordCountDao = new WordCountDao

    def analysis() = {

        val list = wordCountDao.readDiskFile("data/word.txt")

        val words = list.flatMap(
            line => {
                line.split(" ")
            }
        )

        val wordToOne = words.map(
            word => {
                ( word, 1 )
            }
        )

        val groupMap: Map[String, List[(String, Int)]] = wordToOne.groupBy(_._1)

        val wordToCount = groupMap.mapValues(_.size)


        val filterData = wordToCount.filter(
            kv => {
                kv._1 != ""
            }
        )

        val sortData = filterData.toList.sortBy(_._2)(Ordering.Int.reverse)

        sortData.take(3)

    }
}
