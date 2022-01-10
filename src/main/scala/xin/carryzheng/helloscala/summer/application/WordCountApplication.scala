package xin.carryzheng.helloscala.summer.application

import xin.carryzheng.helloscala.summer.common.TApplication
import xin.carryzheng.helloscala.summer.controller.WordCountController


object WordCountApplication extends TApplication with App {
    execute("wordCount") {
        val wordCountController = new WordCountController
        wordCountController.dispatch()
    }
}
