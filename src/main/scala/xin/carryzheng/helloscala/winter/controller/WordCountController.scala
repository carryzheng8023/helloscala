package xin.carryzheng.helloscala.winter.controller

import com.atguigu.bigdata.scala.winter.common.TController
import com.atguigu.bigdata.scala.winter.service.WordCountService

class WordCountController extends TController {

    private val wordCountService = new WordCountService

    def dispatch(): Unit = {
        val result: List[(String, Int)] = wordCountService.analysis()
        result.foreach(println)
    }
}
