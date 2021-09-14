package xin.carryzheng.helloscala.chapter07

import java.util
import scala.collection.mutable

object Scala03_Collection_Seq_3 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Seq  - 可变序列
        val javaList = new java.util.ArrayList[String]();
        javaList.add("a")
        javaList.add("b")
        javaList.add("b")

        // Java List <=> Scala List
        //val list: List[AnyRef] = javaList.toArray.toList
        import scala.collection.JavaConverters._
        val xxx: mutable.Buffer[String] = javaList.asScala

        val yyy: java.util.List[Int] = List(1, 5, 3, 4).asJava





    }

}
