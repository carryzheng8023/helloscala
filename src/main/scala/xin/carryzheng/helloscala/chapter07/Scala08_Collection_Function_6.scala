package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_6 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能
        val list = List(1,2,3,4)

        // reduceXXX方法其实都是对数据集内部的数据操作

        // 折叠
        // TODO 函数柯里化
        println(list.fold(0)(_-_))
        println(list.foldLeft(0)(_-_))

        // reversed.foldLeft(z)((x, y) => op(y, x))

        // 1   2   3   4
        // 0   4   3   2   1
        // 1 -  (2 - (3 - (4  - 0)))
        println(list.foldRight(0)(_-_))

        // TODO 扫描
        println(list.scan(0)(_-_))
        println(list.scanLeft(0)(_-_))
        println(list.scanRight(0)(_-_))



    }

}
