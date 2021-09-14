package xin.carryzheng.helloscala.chapter04

object Scala05_Flow {

    def main(args: Array[String]): Unit = {
        // TODO 循环守卫
        // 循环时增加条件，只有条件满足时，才会执行循环体
//        for ( i <- Range(1,5) if i != 3  ) {
//            println("i = " + i )
//        }
//        println("****************")
//        for ( i <- Range(1,5) ) {
//            if (i != 3) {
//                println("i = " + i )
//            }
//        }

        // TODO 循环嵌套
//        for ( i <- Range(1,5); j <- Range(1,4) ) {
//            println("i = " + i + ",j = " + j )
//        }
//        println("*****************************")
//        for ( i <- Range(1,5) ) {
//            for ( j <- Range(1,4) ) {
//                println("i = " + i + ",j = " + j )
//            }
//        }

        // TODO 引入变量
        for ( i <- Range(1,5); j = i - 1 ) {
            println("j = " + j )
        }
    }

}
