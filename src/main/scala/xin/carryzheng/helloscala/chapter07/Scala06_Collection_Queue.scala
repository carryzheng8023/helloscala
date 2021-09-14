package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable

object Scala06_Collection_Queue {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Queue
        val que = new mutable.Queue[String]()
        // 添加元素
        que.enqueue("a", "b", "c")
        val que1: mutable.Queue[String] = que += "d"
        println(que eq que1)
        // 获取元素
        println(que.dequeue())
        println(que.dequeue())
        println(que.dequeue())

        // TODO Kafka如何保证消费数据的有序性？
    }

}
