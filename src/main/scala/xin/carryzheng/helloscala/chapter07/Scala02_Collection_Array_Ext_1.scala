package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Array_Ext_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Array  - 可变数组
        //val buffer = new ArrayBuffer[String]()
        val buffer1 = ArrayBuffer(1,2,3,4)
        //val buffer2 = ArrayBuffer(1,2,3,4)

        // 基本操作
        //buffer1.append(5, 6, 7, 8)
        //buffer1.appendAll(buffer2)

        //buffer1.insert(2, 9, 0)

        //buffer1.update(0, 8)
        //buffer1(0) = 8

        //buffer1.remove(2)
        buffer1.remove(1,2)


        // 遍历数据

        println(buffer1)

    }
}
