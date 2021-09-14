package xin.carryzheng.helloscala.chapter04

object Scala01_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 分支

        // 单分支
        val age = 30
        if ( age < 30 ) {
            //println("zhangsan")
        }
        //println("main....")

        // 双分支
        if (  age <= 30) {
            //println("zhangsan")
        } else {
           // println("lisi")
        }

        // 多分支
        if ( age < 18 ) {
            println("少年")
        } else if ( age < 28 ) {
            println("青年")
        } else if ( age < 35 ) {
            println("壮年")
        } else if ( age < 45 ) {
            println("中年")
        } else {
            println("老年")
        }
    }

}
