package xin.carryzheng.helloscala.chapter10

object Scala02_Transform {

    def main(args: Array[String]): Unit = {

        implicit def transform( d : Double): Int = {
            d.toInt
        }

        // OCP
        // scala编译器在编译时，如果发现编译错误，会在当前的作用域中查找可以将当前错误解决的转换方式（规则）
        // 如果能够找到，那么自动将这个规则应用在错误代码中，就可以解决问题，编译通过
        // 将这个操作称之为二次编译，原理其实就是类型的转换，由编译器自动查找后进行转换，所以也称之为隐式转换
        // 这个转换的规则必须明确告诉编译器， 就是加标记 : implicit

        val age : Int = thirdPartLib("zhangsan")

        println(age)

    }

    def thirdPartLib( name : String ): Double = {
        20.5
    }
}
