package xin.carryzheng.helloscala.chapter12

object Scala02_Regex {

    def main(args: Array[String]): Unit = {

        // 1. 字符串的长度为11位
        // 2. 11位字符串全部都是数字
        val r = "^\\d{11}$".r

        val data = "1111222233"

        val maybeString: Option[String] = r.findFirstIn(data)
        if (maybeString.isEmpty) {
            println(s"输入的数据${data}不符合规则")
        } else {
            println(s"输入的数据${data}符合规则 : " + maybeString.get)
        }
    }
}
