package xin.carryzheng.helloscala.visit

/**
  *
  * @author zhengxin
  *         2020-07-02 22:48:29
  */
object TestImport {

  def main(args: Array[String]): Unit = {

    //引入该包下的所有内容
    import scala.io._

    //引入指定内容
    import scala.collection.mutable.{HashMap, HashSet}
    var map = new HashMap()
    var set = new HashSet()

    //引入指定内容并重命名
    import java.util.{HashMap => JavaHashMap}
    var map1 = new JavaHashMap()

    //有冲突， 将其隐藏 并引入其他所有内容
    import java.util.{HashSet => _, _}


  }

}

class Apple {

  //需要时才引入
  import scala.beans.BeanProperty

  @BeanProperty
  var name: String = ""

}

class Banana {
  //@BeanProperty
  var name: String = ""
}

