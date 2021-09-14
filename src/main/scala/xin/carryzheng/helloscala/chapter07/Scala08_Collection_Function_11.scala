package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_11 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能函数
        val list = List("Hello", "Hadoop", "Hive", "Scala", "Spark")
        val list1 = List(1,2,3,4,5,6)

        // 将数据集中的每一条数据按照指定的规则进行分类(分组)
        // 分组后的数据会形成一个Map,其中key就是分组的key, 其中value就是满足同一个key的数据集合
//        val group: Map[String, List[String]] = list.groupBy(
//            word => {
//                word.substring(0, 1)
//            }
//        )
//
//        println(group)

        val result = list1.groupBy(
            num => {
//                if ( num % 2 == 0 ) {
//                    "偶数"
//                } else {
//                    "奇数"
//                }
//                num % 2 == 0

                num % 2
            }
        )

        val result1 = list1.groupBy(_%2)

        println(result)


    }

}
