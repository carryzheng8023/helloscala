package xin.carryzheng.helloscala.chapter02

object Scala04_String_1 {

    def main(args: Array[String]): Unit = {

        // TODO - 字符串
//        val s1 = "zhangsan"
//        val s2 = "lisi"
//
//        val str: String = s1 + s2
//        val str1: String = s1.concat(s2)
//        println(str)
//        println(str1)

        val age : String = "30"
        val name : String = "zhangsan"

        //val s = "age : " + age + ", name : " + name
        // JSON 字符串
        // HTML + CSS + JS + Java(Servlet) => JSP
        //val s = "{\"name\":\""+name+"\", \"age\":"+age+"}"

        // TODO 传值字符串
        //printf("name=%s\n", name)

        // TODO 插值字符串
        //println("name = ${name}")
        //println(s"name = ${name}")

        //val s = s"{\"name\":\"${name}\", \"age\":${age}"

        // TODO 多行字符串
        // 下面的竖线表示顶格符
        val s1 =
            s"""
               { "name":"${name}", "age": ${age} }
              | { "name":"${name}", "age": ${age} }
              |""".stripMargin('#')

        val sql =
            """
              | select
              |    *
              | from user
              | where id = 1 and password = '123123'
              |""".stripMargin
        println(s1)

    }
}
