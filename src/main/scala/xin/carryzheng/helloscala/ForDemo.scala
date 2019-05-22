package xin.carryzheng.helloscala

/**
  * for循环示例
  *
  * @author zhengxin
  *         2019-05-22 10:44:05
  */
object ForDemo {

  def main(args: Array[String]): Unit = {

    val start = 1
    val end = 10

    //1. start 从哪个数开始循环
    //2. to 是关键字
    //3. end 循环结束的值
    //4. start to end 表示前后闭合
    for (i <- start to end) {
      println("你好，scala" + i)
    }

    println("=================================================================")

    //5. start until end 表示左闭又开
    for (i <- start until end) {
      println("你好，scala" + i)
    }

    println("=================================================================")

    //for这种推导时，也可以直接对集合进行遍历
    val list = List("hello", 10, 30, "tom")
    for (item <- list) {
      println("item=" + item)
    }

    println("=================================================================")

    for (i <- 1 to 3 if i != 2) {
      print(i + " ") //1 3
    }
    println()
    //上边代码等价于
    for (i <- 1 to 3) {
      if (i != 2) {
        println(i + "")
      }
    }


    println("=================================================================")

    for (i <- 1 to 3; j = 4 - i) {
      print(j + "")
    }
    //上边代码等价于
    for (i <- 1 to 3) {
      val j = 4 - i
      print(j + "")
    }

    println()
    println("=================================================================")


    for (i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j)
    }
    //上边代码等价于
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(i + " " + j + " ")
      }
    }


    println("=================================================================")


    //1. 对 1 to 10 进行遍历
    //2. yield i 将每次循环得到i放入到集合Vector中，并返回给res
    //3. i这里是一个代码块，这就意味我们可以对i进行处理
    //4. 下面的这个方式，就体现出scala一个重要的语法特点，就是将一个集合中个各个数据进行处理，并返回给新的集合
    val res = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        "不是偶数"
      }
    }
    println(res)

    println("=================================================================")

    for (i <- 1 to 3; j = i * 2) {
      println(" i= " + i + " j= " + j)
    }
    //上边代码等价于
    for {
      i <- 1 to 3
      j = i * 2} {
      println(" i= " + i + " j= " + j)
    }


    println("=================================================================")

    //步长控制为2
    //Range(1,10,2)的对应的构建方法是
    //def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    for (i <- Range(1, 10, 2)) {
      println("i=" + i)
    }

    println("=================================================================")

    //控制步长的第二种方式-for循环守卫
    for (i <- 1 to 10 if i % 2 == 1) {
    println("i=" + i) }

  }

}
