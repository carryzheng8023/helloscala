package xin.carryzheng.helloscala.chapter07

object Scala02_Collection_Array {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Array  - 数组

        /*
          Object[] ss = new Object[3]
          ss[0] = "zhangsan"

         */

        // 构建集合 - 数组
        // 数组访问时，中括号需要改为小括号
        // 构建数组时，应该设定数组的长度，以及数组中容纳的元素的类型
        // 数组在编译时，会自动编译为java的数组
        val array: Array[String] = new Array[String](3)

        array(0) = "zhangsan"
        //println(array(0))
        array(1) = "lisi"
        array(2) = "wangwu"

        // 操作数据
        array.update(0, "zhaoliu")
        //println(array(0))

        // 遍历数据
        //for ( i <- array ) {
        //    println(i)
        //}
        //println(array.mkString(","))

        // TODO foreach方法需要传递一个参数，这个参数的类型是一个函数类型： String=>U
        //      foreach方法可以将集合中的每一条数据进行处理，这个处理的逻辑是作为参数从外部传递

        def foreachFuntion( s:String ): Unit = {
            println(s)
        }

//        array.foreach(foreachFuntion)
//        array.foreach(
//            ( s:String ) => {
//                println(s)
//            }
//        )
//
//        array.foreach(
//            ( s:String ) => println(s)
//        )
//
//        array.foreach(
//            ( s ) => println(s)
//        )
//
//        array.foreach(
//            s => println(s)
//        )

        array.foreach(println(_))
        array.foreach(println)
    }
}
