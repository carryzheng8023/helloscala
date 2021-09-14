package xin.carryzheng.helloscala.chapter07

object Scala05_Collection_Map_2 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Tuple - 元组
        // 1, zhangsan, 30
        // scala可以将无关的元素组合在一起，形成特殊的结构，称之为元素组合，简称元组
        val t = (1, "zhangsan", 30)
        // 元组也有类型, 其中最多容纳的数据的个数为22
        val t1 : (Int, String, Int) = (1, "zhangsan", 30)
        val t2 : Tuple3[Int, String, Int] = (1, "zhangsan", 30)

        // 因为数据之间是没有关系的，想要访问时，就必须知道它的位置,采用顺序号进行访问
        println(t._1)
        println(t._2)
        println(t._3)

        // 如果元组中的元素只有2个，那么这样的元组称之为对偶元组，也称之为键值对
        val tuple: (String, Int) = "a" -> 1

        val map = Map(
            ("a", 1), ("b", 2), ("c", 3)
        )
//
//        for ( kv <- map ) {
//            println(kv._1 + "=" + kv._2)
//        }

        def foreachFunction( kv : (String, Int) ): Unit = {
            println( kv._1 + "=" + kv._2 )
        }
        map.foreach(foreachFunction)
        map.foreach(
            ( kv : (String, Int) ) => {
                println( kv._1 + "=" + kv._2 )
            }
        )

        map.foreach(
            ( kv : (String, Int) ) => println( kv._1 + "=" + kv._2 )
        )

        map.foreach(
            ( kv ) => println( kv._1 + "=" + kv._2 )
        )

        map.foreach(
            kv => println( kv._1 + "=" + kv._2 )
        )
    }

}
