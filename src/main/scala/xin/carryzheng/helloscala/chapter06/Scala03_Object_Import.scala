package xin.carryzheng.helloscala.chapter06

object Scala03_Object_Import {
    def main(args: Array[String]): Unit = {
        // TODO - 面向对象编程 - import
        /*
          java中import的作用:

          1. 导类
          2. 静态导入
          3. java.lang是不需要导入

         */

        // java中的import语句功能比较单一，所以scala进行了扩展。

        // TODO 1. java.lang包中的类无需导入
        //         scala包中的类也无需导入
        //         导入对象 : Predef
        //println("123")

        // TODO 2. import关键字可以声明在任意的地方
        //import java.util.Date
        // Date()

        // TODO 3. 导入某一个包中所有的类
        //import java.util._

        // TODO 4. 可以将同一个包中的类在一行中导入
        //import java.util.{List, ArrayList, Map}
        //val map : ArrayList = null

        // TODO 5. 可以屏蔽类
        //import java.util._
        //import java.sql.{Date=>_, _}
        //val d = new Date()

        // TODO 6. 可以给类起别名
        //import java.util.{HashMap=>JavaHashMap}
        //new JavaHashMap()

        // TODO 7. 导包
        //import java.util
        //new util.ArrayList()

        // TODO 8. scala语言中导入包中的类，采用的方式为相对路径的导入
        //         如果想要从绝对路径中导入，需要增加特殊的操作 : _root_
        // {k=v,k=v}
        // [1,2,3,4]
        println(new _root_.java.util.HashMap())
    }

}
//package java {
//    package util {
//        class HashMap {
//
//        }
//    }
//}

