package xin.carryzheng.helloscala.chapter10

object Scala05_Transform {

    def main(args: Array[String]): Unit = {

        // 隐式转换参数
        def register1( implicit password : String = "000000" ): Unit = {
            println("默认密码为 ： " + password)
        }

        def register( implicit password : String ): Unit = {
            println("默认密码为 ： " + password)
        }

        // 隐式变量
        implicit val pswd = "123123"
        //implicit val pswd1 = "123123"

        // 在应用隐式参数时，参数列表不需要使用小括号
        // 如果参数设定为隐式参数，但是参数没有默认值，那么调用时，如果想要使用隐式参数，但是没有找到对应的隐式变量，会发生错误
        register
        register1
        register1()
        register1("55555555")

        // 如果明确使用小括号，意味放弃使用隐式转换
        //register()
        //register("ddddd")

       // List(1,4,2,1).sortBy(num=>num)(Ordering.Int.reverse)

    }

}
