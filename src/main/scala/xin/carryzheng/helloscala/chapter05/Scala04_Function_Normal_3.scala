package xin.carryzheng.helloscala.chapter05

object Scala04_Function_Normal_3 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 普通版
        def fun1( password:String = "123123", name:String ): Unit = {
            println(name + ", " + password)
        }

        // TODO 带名参数：可以改变参数的传值顺序
        fun1(name="zhangsan")

    }
}
