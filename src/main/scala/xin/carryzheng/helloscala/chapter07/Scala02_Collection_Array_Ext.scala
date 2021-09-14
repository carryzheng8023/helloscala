package xin.carryzheng.helloscala.chapter07

object Scala02_Collection_Array_Ext {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Array  - 数组

        // 创建数组的方式 - apply
        /*
        val array = new Array[String](3)
        array(0) = "123"
        array(1) = "123"
        array(2) = "123"
         */
        //val array1 = Array.apply(1,2,3)
        val array1 = Array(1,2,3)
        val array2 = Array(3,4,5)

        // 增加数据
        // scala默认提供 的集合都是不可变的。
        // 对集合的操作都会产生新的集合
        //val ints: Array[Int] = array2.+:(4)
        // TODO 如果将方法作为运算符使用时，方法名以冒号结尾的话，那么计算规则是从右向左计算
        val ints: Array[Int] = 4 +: array2 // 4.+:(array2)

        //val ints1: Array[Int] = array2.:+(4)
        val ints1: Array[Int] = array2 :+ 4

        //println(ints eq array2)
        //println(ints1 eq array2)
//
        //println(array2.mkString(","))
        //println(ints.mkString(","))
        //println(ints1.mkString(","))

        //val ints2: Array[Int] = array1.++:(array2)
        val ints2: Array[Int] = array2 ++: array1
        println(ints2.mkString(","))
    }
}
