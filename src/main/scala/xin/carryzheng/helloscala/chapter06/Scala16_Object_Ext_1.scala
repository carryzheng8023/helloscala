package xin.carryzheng.helloscala.chapter06

object Scala16_Object_Ext_1 {

    println(1111)
    def main(args: Array[String]): Unit = {
        println(2222)
        println(Color.BLUE.id)

    }
    println(3333)
    object Color extends Enumeration {
        val RED = Value(1, "red")
        val YELLOW = Value(2, "yellow")
        val BLUE = Value(3, "blue")
    }
}
