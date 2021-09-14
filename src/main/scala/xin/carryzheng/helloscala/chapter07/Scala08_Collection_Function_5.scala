package xin.carryzheng.helloscala.chapter07

object Scala08_Collection_Function_5 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能
        val list = List(1,2,3,4)

        // 自定义聚合计算方法
        // reduce : 聚合,简化,规约
        // reduce方法可以通过指定的计算规则对集合的数据进行聚合操作,获取结果
        // reduce方法需要传递一个参数,这个参数是函数类型: (A1, A1) => A1
        // scala中所有的数据计算处理中,基本上都是两两计算

        def reduceFunction(x : Int, y : Int ): Int = {
            x + y
        }

//        val result = list.reduce(reduceFunction)
//        list.reduce(
//            (x : Int, y : Int ) => {
//                x + y
//            }
//        )
//
//        list.reduce(
//            (x : Int, y : Int ) => x + y
//        )
//
//        list.reduce(
//            (x, y) => x + y
//        )

        //println(list.reduce( _ - _ )) // -13
        //println(list.reduceLeft(_-_)) // -13
        // reversed.reduceLeft[B]((x, y) => op(y, x))
        //println(list.reduceRight(_ - _)) // -5
        // (((1 - 2) - 3) - 4) => -8
        //  (1 -   (2  -  (3  -  4))) => -2



    }

}
