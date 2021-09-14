package xin.carryzheng.helloscala.chapter08

object Scala08_Match {

    def main(args: Array[String]): Unit = {

       val list = List(
           (("河北", "鞋"),10),
           (("河南", "衣服"),20),
           (("华北", "帽子"),30)
       )

        val list1 = list.map(
            t => {
                (t._1._1, (t._1._2, t._2 * 2))
            }
        )

        val list2 = list.map {
            case ( (prv, item), cnt ) => {
                (prv, (item, cnt * 2))
            }
        }

        println(list1)
        println(list2)


    }

}
