package xin.carryzheng.helloscala.chapter05

object Scala04_Function_Normal_2 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 普通版
        // TODO 函数的参数可以理解为使用val声明的变量，所以不能改的
        // TODO 参数默认值 : 声明参数时，直接给参数进行初始化赋值
        //      所谓的参数默认值，其实就是由编译器编译时，自动传递指定的参数
        def fun1( name : String, password : String = "123123"): Unit = {
            println(name + "," + password)
        }

        // 如果参数存在默认值的场合，调用时，可以不用传递这个参数,这个参数自动设置为默认值
        //fun1("zhangsan")
        // 如果传递了这个参数，那么默认值就不会起作用
        //fun1("zhangsan", "000000")

        // TODO 参数默认值和可变参数不能联合使用
//        def fun2(password:String = "123123", name:String*): Unit = {
//
//        }
        //fun2("zhangsan")

    }
}
