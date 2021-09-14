package xin.carryzheng.helloscala.chapter09

import java.io.FileNotFoundException
import java.sql.SQLException

object Scala01_Exception {

    def main(args: Array[String]): Unit = {

        // TODO 异常
        // java : 编译期异常 & 运行期异常

        // scala中的异常处理类似于模式匹配，但是细节上有点不同
        try {
            val i = 0
            //val j = 10 / i
            throw new FileNotFoundException("1111")
        } catch {
            case e : SQLException => println("异常")
            case e : ArithmeticException => println("除数为0")

        }
    }
}
