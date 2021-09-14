package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_9 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能函数
//        val list = List(
//            List(
//                List(1,2),List(3,4)
//            ), List(
//                List(5,6)
//            )
//        )

        // 将一个整体进行拆分,形成一个一个的个体来使用.称之为扁平化
        //println(list) // 1,2,3,4
        // 扁平化只能对最外层的整体进行.
        //val flatten = list.flatten
        //println(flatten)

        val words = List("Hello World Hello")
        //val flatten = words.flatten
        //println(flatten)

        // 如果想要使用自定义扁平化,需要采用flatMap方法
        val ws = words.flatMap(str => {
            str.split(" ").map(_*2)
        })

        println(ws)


    }

}
