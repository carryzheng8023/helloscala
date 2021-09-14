package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_12 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能函数
        val list = List(
            "1", "2", "11", "22", "3"
        )

        // 按照指定的规则进行数据的排序
        // 默认排序方式为从小到大(升序), 如果想要改变顺序,那么需要传递第二个参数.
        // 函数柯里化
        val r = list.sortBy( num => num.toInt )(Ordering.Int.reverse)
        println(r)


    }

}
