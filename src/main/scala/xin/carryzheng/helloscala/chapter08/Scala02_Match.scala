package xin.carryzheng.helloscala.chapter08

object Scala02_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配
        // 常量匹配
//        def describe(x: Any) = x match {
//            case 5 => "Int five"
//            case "hello" => "String hello"
//            case true => "Boolean true"
//            case '+' => "Char +"
//        }
//
//        println(describe(6))

        // 类型匹配
        // TODO 模式匹配在匹配类型时是不考虑泛型的
        // 类型 泛型
        def describe(x: Any) = x match {
            case i: Int => "Int"
            case s: String => "String hello"
            case m: List[String] => "List"
            case c: Array[Int] => "Array[Int]"
            case someThing => "something else " + someThing
        }

        // Array[Int] => int[]
        println(describe(1))
        println(describe("Scala"))
        println(describe(Array(1,2,3,4)))
        println(describe(Array("a","b", "c")))
        println(describe(List("a","b", "c")))
        println(describe(List(1,2,3)))
    }
}
