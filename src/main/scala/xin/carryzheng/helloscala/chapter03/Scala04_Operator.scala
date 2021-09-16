package xin.carryzheng.helloscala.chapter03

import xin.carryzheng.helloscala.bean.User

import scala.io.BufferedSource

object Scala04_Operator {

    def main(args: Array[String]): Unit = {
        //10 // 万物皆对象，这里的10其实是一个对象
        //new User()
        // val i = 10.+(10)
        // scala为了开发方便，很多东西可以简化
        val i1 = 10 +(10)
        val i2 = 10 + 10

//        val source: BufferedSource = scala.io.Source.fromFile("data/word.txt")
//        val strings: Iterator[String] = source.getLines()
//        while ( strings.hasNext ) {
//
//        }

        println("" + i2)
        println(i2.toString)
        println(i2 toString)
    }
}
