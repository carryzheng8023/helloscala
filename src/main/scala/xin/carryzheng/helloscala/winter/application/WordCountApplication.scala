package xin.carryzheng.helloscala.winter.application

import com.atguigu.bigdata.scala.winter.common.TApplication
import com.atguigu.bigdata.scala.winter.controller.WordCountController


object WordCountApplication extends TApplication with App {
    execute("wordCount") {
        val wordCountController = new WordCountController
        wordCountController.dispatch()
    }
}
