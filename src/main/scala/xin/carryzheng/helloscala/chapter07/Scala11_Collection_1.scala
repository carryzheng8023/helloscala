package xin.carryzheng.helloscala.chapter07

object Scala11_Collection_1 {

    def main(args: Array[String]): Unit = {

        val list = List(
            User(20, 1000),
            User(30, 2000),
            User(30, 1000)
        )

       // println(list.sortBy(_.age)(Ordering.Int.reverse))
        // Tuple的排序：先比较第一个，再比较第二个，依此类推
        //println(list.sortBy(t => (t.age, t.salary)))
        //println(list.sortBy(t => (t.age, t.salary))(Ordering.Tuple2[Int, Int](Ordering.Int, Ordering.Int.reverse)))
        val list1 = list.sortWith(
            (left, right) => {
                // 将你需要的结果返回为true
                if (left.age < right.age) {
                    true
                } else if ( left.age == right.age ) {
                    left.salary < right.salary
                } else {
                    false
                }

            }
        )
        println(list1)

    }
    case class User (
        var age : Int,
        var salary : Int
    ) {

    }

}
