package xin.carryzheng.helloscala.chapter02

import scala.io.{BufferedSource, Source, StdIn}

object Scala05_In {

    def main(args: Array[String]): Unit = {

//
//        val line: String = StdIn.readLine()
//        println(line)

        // 从文件中获取输入
        // 路径:
        //   1. 绝对路径：不可改变的路径
        //      本地路径：file:///c:/test/test.txt
        //      网络路径：http://www.baidu.com:80
        //   2. 相对路径：可以改变路径
        //      ./ ../

        // IDEA中相对路径的基准路径为【项目】的根路径
        val source: BufferedSource = Source.fromFile("data/word.txt")

        val strings: Iterator[String] = source.getLines()
        while ( strings.hasNext ) {
            println(strings.next())
        }

        source.close()
    }
}
