package xin.carryzheng.helloscala

/**
  * 标识符命名规范
  *
  * @author zhengxin
  *         2019-05-20 17:51:42
  */
object IdentityDemo {

  def main(args: Array[String]): Unit = {
    //首字符为操作符(比如+ - * / )，后续字符也需跟操作符,至少一个
    val ++ = "hello,world!"
    println(++)


    val -+*/ = 90 //ok
    println("res=" + -+*/)

    //看看编译器怎么处理这个问题
    // ++ => $plus$plus


    //val +q = "abc" //error


    //用反引号`....`包括的任意字符串，即使是关键字(39 个)也可以
    var `true` = "hello,scala!"
    println("内容=" + `true`)


    //在 scala 中，Int不是关键字，而是预定义标识符,可以用，但是不推荐
    val Int = 90.45
    println("Int=" + Int)

    //不能使用_ 做标识符
    //var _ = "jack"
    //println(_)
  }

}
