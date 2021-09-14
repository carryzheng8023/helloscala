package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Array_Ext_3 {

    def main(args: Array[String]): Unit = {

        // 多维数组
        var myMatrix = Array.ofDim[Int](3,3)
        myMatrix.foreach(list=>println(list.mkString(",")))

        // 合并数组
        val a1 = Array(1,2,3,4)
        val a2 = Array(5,6,7,8)
        val arr6: Array[Int] = Array.concat(a1, a2)
        arr6.foreach(println)
        println("************************")
        // 创建指定范围的数组
        val arr7: Array[Int] = Array.range(0,2)
        arr7.foreach(println)
        println("************************")
        // 创建并填充指定数量的数组
        val arr8:Array[Int] = Array.fill[Int](5)(-1)
        arr8.foreach(println)

    }
}
