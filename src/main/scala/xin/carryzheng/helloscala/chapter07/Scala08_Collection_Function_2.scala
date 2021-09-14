package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_2 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能
        val list = List(1,2,3,4,5,6,7,8)
        val list1 = List("a", "b", "c", "d")
        println(list1.splitAt(3))

        // partition方法需要传递一个函数,这个函数的类型: Int => Boolean
        println(list.partition(x => {
            x > 5
        }))

    }

}
