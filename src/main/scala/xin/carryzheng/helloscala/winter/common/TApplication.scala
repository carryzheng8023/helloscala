package xin.carryzheng.helloscala.winter.common

import com.atguigu.bigdata.scala.winter.controller.WordCountController

trait TApplication {

    def execute(name:String)( op : => Unit ): Unit = {
        println("申请资源... :" + name)

        // TODO 实现逻辑
        try {
            op
        } catch {
            case e : Exception => e.printStackTrace()
        }

        println("释放资源...:" + name)
    }
}
