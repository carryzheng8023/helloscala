package xin.carryzheng.helloscala.chapter02

import java.io.{File, PrintWriter}
import scala.io.{BufferedSource, Source}

object Scala05_Out {

    def main(args: Array[String]): Unit = {
        val writer = new PrintWriter(new File("output/test.txt" ))
        writer.write("Hello Scala")
        writer.close()
    }
}
