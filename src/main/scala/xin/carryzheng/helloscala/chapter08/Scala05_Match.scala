package xin.carryzheng.helloscala.chapter08

object Scala05_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配
        // 模式匹配也可以使用至简原则
        //val (id, name, age) = (1, "zhangsan", 30)

        //println(name)

//        val map = Map(
//            ("a", 1), ("b", 2), ("c", 3)
//        )
//
//        for ( (k, 2) <- map ) {
//            println(k)
//        }

        val list = List(
            ("河北", ( "鞋", 2 )),
            ("河南", ( "衣服", 5 )),
        )

//        val newlist = list.map(
//            t => {
//                ( t._1, (t._2._1, t._2._2 * 2) )
//            }
//        )
//        println(newlist)

        // map 传递函数类型 T => U

        // TODO 如果功能函数使用模式匹配时：
        // 1. 模式匹配需要增加case
        // 2. 函数的参数列表应该使用大括号代替小括号

//        val newlist = list.map{
//            case (prv, (item, sum)) => {
//                (prv, (item, sum * 2))
//            }
//        }
//        println(newlist)

        val newlist = list.filter{
            case ( _, (_, sum) ) => {
                sum >= 3
            }
        }
        println(newlist )
    }
}
