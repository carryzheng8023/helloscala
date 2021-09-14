package xin.carryzheng.helloscala.chapter05

object Scala04_Function_Normal_1 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 普通版
        // TODO 动态参数（可变参数）: 参数类型的后面增加星号
        //      所谓的可变参数，其实在编译后，就是采用集合的方式来实现
        def fun1( name1:String* ): Unit = {
            println(name1)
        }

        fun1()
        fun1("zhangsan")
        fun1("zhangsan", "lisi", "wangwu")

        // TODO 可变参数应该作为最后一个参数声明
//        def fun2( name1:Object*, password:String ): Unit = {
//        }
//        fun2(1,2,3, "123")

    }
}
