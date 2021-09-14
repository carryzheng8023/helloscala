package xin.carryzheng.helloscala.chapter02

object Scala08_Datatype_1 {

    def main(args: Array[String]): Unit = {

        // TODO - 数据类型 - AnyVal
        val b : Byte = 127
        val s : Short = 10
        val i : Int = 10
        val l : Long = 10
        val f : Float = 10.0F
        val d : Double = 10.0
        val c : Char = 'A'
        val flg : Boolean = true

        // Unit类型表示方法没有返回值，对象只有一个()
        val u = test()
        println(u)
    }
    def test(): Unit = {

    }

}
