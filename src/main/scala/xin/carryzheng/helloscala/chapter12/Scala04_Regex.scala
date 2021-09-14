package xin.carryzheng.helloscala.chapter12

object Scala04_Regex {

    def main(args: Array[String]): Unit = {

        val r = """([_A-Za-z0-9-]+(?:\.[_A-Za-z0-9-\+]+)*)(@[A-Za-z0-9-]+(?:\.[A-Za-z0-9-]+)*(?:\.[A-Za-z]{2,})) ?""".r
        println(r.replaceAllIn("abc.edf+jianli@gmail.com   hello@gmail.com.cn", (m => "*****" + m.group(2))))
    }
}
