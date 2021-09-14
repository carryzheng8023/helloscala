package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Array_Ext_2 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 可变数组和不可变数组的转换
        val array = Array(1,2,3,4)
        val buffer = ArrayBuffer(5,6,7,8)

        // 不可变数组 => 可变数组
        val buffer1: mutable.Buffer[Int] = array.toBuffer

        // 可变数组 => 不可变数组
        val array1: Array[Int] = buffer.toArray

    }
}
