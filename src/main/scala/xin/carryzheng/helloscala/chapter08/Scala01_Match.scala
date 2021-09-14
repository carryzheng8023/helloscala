package xin.carryzheng.helloscala.chapter08

object Scala01_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配
        // Scala中的模式匹配类似于java中switch
        // scala中的模式匹配不需要使用break
        // 这里的模式匹配其实表示的含义是数据是否匹配某一个规则，如果没有找到匹配的规则，会发生错误。
        // 一般下划线的分支都是放置在最后
        val age = 10
        age match {
            case 10 => println("age = 10")
            case 20 => println("age = 20")
            case 30 => println("age = 30")
            case _  => println("other")

        }
    }
}
