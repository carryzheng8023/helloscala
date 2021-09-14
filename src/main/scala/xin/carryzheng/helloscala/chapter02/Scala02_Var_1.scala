package xin.carryzheng.helloscala.chapter02

object Scala02_Var_1 {

    def main(args: Array[String]): Unit = {

        // TODO 变量, 在使用时不能改变类型
        var name : String = "zhangsan"
        val name1 : String = "lisi"

        // 如果通过变量值可以推断出变量的类型，那么这个类型的声明可以省略
        // 多态的场合不能省略类型，因为无法推断
        //val name2 = "zhaoliu"
        //name

        var name3 = "wangwu"
        println(name3)


    }
}
