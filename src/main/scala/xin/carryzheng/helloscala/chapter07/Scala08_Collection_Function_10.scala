package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_10 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能函数
        val list = List(1,2,3,4)
        val list1 = List("Hello", "Hadoop", "Hive", "Scala", "Spark")

        // Filter方法用于将集合中的每一条数据进行筛选过滤
        // 如果满足指定的条件(true),那么数据保留,如果不满足(false),那么数据丢弃
//        val newlist = list.filter(num => {
//            num % 2 != 0
//        })
//
//        val newlist = list.filter(_%2 != 0)
//        println(newlist)

        println(list1.filter(_.startsWith("S")))

    }

}
