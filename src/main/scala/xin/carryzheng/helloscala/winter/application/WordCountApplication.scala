package xin.carryzheng.helloscala.winter.application

import xin.carryzheng.helloscala.winter.common.TApplication
import xin.carryzheng.helloscala.winter.controller.WordCountController


object WordCountApplication extends TApplication with App {
    execute("wordCount") {
        val wordCountController = new WordCountController
        wordCountController.dispatch()
    }
}
