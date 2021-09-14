package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_3 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能
        val list = List(1,2,3,4,5,6,7,8)

        // 计算集合中每3条数据之和
        val iterator: Iterator[List[Int]] = list.sliding(3,2)
        while ( iterator.hasNext ) {
            println(iterator.next())
        }

        // TODO 多数据集的操作
        val list1 = List(1,2,3,4)
        val list2 = List(3,4,5,6,7,8)

        // 交(叉)集
        println(list1.intersect(list2))
        // 并集
        println(list1.union(list2))
        // 差集
        println(list1.diff(list2))

        // 拉链
        println(list1.zip(list2))
        println(list2.zipWithIndex)

    }

}
