package xin.carryzheng.helloscala.winter.controller

import xin.carryzheng.helloscala.winter.common.TController
import xin.carryzheng.helloscala.winter.service.WordCountService

class WordCountController extends TController {

    private val wordCountService = new WordCountService

    def dispatch(): Unit = {
        val result: List[(String, Int)] = wordCountService.analysis()
        result.foreach(println)
    }
}
