package xin.carryzheng.helloscala.chapter05

import scala.util.control.Breaks

object Scala08_Function {

    def main(args: Array[String]): Unit = {

        test {
            println("child execute")
        }
    }
    def test( op : =>Unit ): Unit = {
        start()
        op
        end()
    }
    def start(): Unit = {
        println("start")
    }
    def end(): Unit = {
        println("end")
    }
    def execute(): Unit = {
        println("execute")
    }
}
