package xin.carryzheng.helloscala.summer.controller

import xin.carryzheng.helloscala.summer.common.TController
import xin.carryzheng.helloscala.summer.service.WordCountService

class WordCountController extends TController {

    private val wordCountService = new WordCountService

    def dispatch(): Unit = {
        val result: List[(String, Int)] = wordCountService.analysis()
        result.foreach(println)
    }
}
