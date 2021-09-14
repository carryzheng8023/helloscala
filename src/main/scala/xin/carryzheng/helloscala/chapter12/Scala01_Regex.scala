package xin.carryzheng.helloscala.chapter12

object Scala01_Regex {

    def main(args: Array[String]): Unit = {

        // TODO : 正则表达式 : 匹配字符串数据的规则
        //        模式匹配 ：数据的规则

        // TODO 1. 声明规则
        val r = "s|S".r

        // TODO 2. 准备数据
        val data = "zhangSan"

        // TODO 3. 根据规则校验数据
        val maybeString: Option[String] = r.findFirstIn(data)
        if (maybeString.isEmpty) {
            println(s"输入的数据${data}不符合规则")
        } else {
            println(s"输入的数据${data}符合规则 : " + maybeString.get)
        }
    }
}
