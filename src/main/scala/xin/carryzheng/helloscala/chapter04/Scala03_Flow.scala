package xin.carryzheng.helloscala.chapter04

object Scala03_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 循环 - for
        /*
           for ( int i = 0; i < 10; i++ ) {
               sout(i)
           }

           for ( list : Object obj ) {

           }
           for ( Object obj : list ) {
               sout(obj)
           }
         */
//        for ( i:Int <- 1 to 5 ) {
//            println(i)
//        }



        //val a = 1.to(5)
        val a = 1 to 5
        val b = 1 until 5 by 2
        val a1 = Range(1, 5, 2)

        for ( i <- a ) {
            println(i)
        }
        println("****************")
        for ( i <- a1 ) {
            println(i)
        }
        println("****************")
        for ( i <- b ) {
            println(i)
        }
    }

}
