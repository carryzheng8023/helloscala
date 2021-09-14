package xin.carryzheng.helloscala.chapter12

object Scala03_Regex {

    def main(args: Array[String]): Unit = {

        // (13[0-9]) => 131
        // (14[5,7,9]) => 14
        // (15[^4])    => 155
        // (18[0-9])   =>
        // (17[0,1,3,5,6,7,8])

        //val r = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))[0-9]{8}$".r
        val r = "^\\d{8}$".r

        val data = "11112222333"

        val maybeString: Option[String] = r.findFirstIn(data)
        if (maybeString.isEmpty) {
            println(s"输入的数据${data}不符合规则")
        } else {
            println(s"输入的数据${data}符合规则 : " + maybeString.get)
        }
    }
}
