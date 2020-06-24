package xin.carryzheng.helloscala.pk

/**
  *
  * @author zhengxin
  *         2020-06-23 13:21:10
  */

object TestPackage {

  def main(args: Array[String]): Unit = {

    val t1 = new xin.carryzheng.helloscala.pk.p1.Tiger
    val t2 = new xin.carryzheng.helloscala.pk.p2.Tiger

    println(t1 + " " + t2)

  }

}


