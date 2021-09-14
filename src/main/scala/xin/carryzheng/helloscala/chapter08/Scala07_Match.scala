package xin.carryzheng.helloscala.chapter08

object Scala07_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配
//        val list = List(1,2,3,"4")
//        // 全量函数
//        val newlist = list.map {
//            case i: Int => i+1
//        }
//
//        println(newlist)

        // 偏函数，就是对数据集中满足条件的数据进行处理的函数
        // TODO 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串。
//        val list : List[Any] = List(1,2,3,4,5,6,"test")
////        val newlist = list.map{
////            case i:Int => i + 1
////            case other => other
////        }.filter(_.isInstanceOf[Int])
//        list.map(_ + 1)
//
//        println(newlist)

//        val list : List[Any] = List(1,2,3,4,5,6,"test")
//        val newlist = list.filter(_.isInstanceOf[Int])
//        val newlist1 = newlist.map(_+1)

        val list : List[Any] = List(1,2,3,4,5,6,"test")
        val result = list.collect{
            case i:Int => i + 1
        }
        println(result)


    }

}
