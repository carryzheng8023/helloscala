package xin.carryzheng.helloscala.chapter04

object Scala02_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 分支

        // 单分支
//        val age = 30
//        val result = if ( age <= 30 ) {
//            //println("xxxxx")
//            "xxxxx"
//            20
//        }

        // String or Unit => Any
        // Int or Unit =>

        // 表达式的结果为满足条件的表达式的最后一行代码的直接结果
        // 这里的类型不确定
        // 1. scala是强类型的语言，
        //println(result + 10)

        val age = 20
        val result = if ( age == 20 )  "zhangsan" else null
        println(result)
    }

}
