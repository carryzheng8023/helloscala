package xin.carryzheng.helloscala

/**
  * scala的输出方式
  *
  * @author zhengxin
  *         2019-05-09 17:44:55
  */
object printDemo {

  def main(args: Array[String]): Unit = {

    val str1: String = "hello"
    val str2: String = " world!"
    println(str1 + str2)

    val name: String = "zx"
    val age: Int = 10
    val salary: Float = 19.67f
    val height: Double = 180.12
    //格式化输出
    printf("名字=%s 年龄是%d 薪水%.2f 身高%.3f", name, age, salary, height)

    //scala支持使用$输出内容，编译器会去解析$对应的变量
    println(s"个人信息如下：\n名字$name \n年龄$age 薪水$salary")
    //{}中是一个表达式
    println(s"个人信息如下：\n名字${name + ".dtd"} \n年龄${age + 10} 薪水${salary * 10}")
  }

}
