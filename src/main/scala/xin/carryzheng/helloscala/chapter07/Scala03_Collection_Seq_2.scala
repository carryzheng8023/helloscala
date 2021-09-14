package xin.carryzheng.helloscala.chapter07

import scala.collection.mutable.ListBuffer

object Scala03_Collection_Seq_2 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Seq  - 可变序列
       // val buffer = ListBuffer(1,2,3,4)

//        buffer.append(4,5)
//        buffer.appendAll(Array(6,7))
//        buffer.insert(2,8,9)
//
//        buffer.update(0, 11)
//        buffer.updated(1,12)
//
//        buffer.remove(1)
//        buffer.remove(1,2)

        //buffer.remove(2, 5)

        // 类对象中月可以声明apply方法，被编译器自动识别
        //println(buffer(0))
        //println(buffer)


        //val test = new Test()
        //test()

    }
    class Test {
        def apply(): Unit = {
            println("class Test apply")
        }
    }
    object Test {
        def apply(): Unit = {
            println("object Test apply")
        }
    }
}
