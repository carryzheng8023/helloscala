package xin.carryzheng.helloscala.chapter05

object Scala04_Function_Normal {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 普通版
        // TODO 参数的长度（个数）
        //      参数的个数没有限制 : 声明的函数只是功能的封装，所以不应该有限制
        //      网上说有限制：22， 万物皆对象,将函数作为对象使用时，函数类型只能设定为22个参数
        def fun1( name1:String, name2:String, name3:String ): Unit = {
            println(name1 + "," + name2 + "," + name3)
        }

        def fun11(
             name1:String,
             name2:String,
             name3:String,
             name4:String,
             name5:String,
             name6:String,
             name7:String,
             name8:String,
             name9:String,
             name10:String,
             name11:String,
             name12:String,
             name13:String,
             name14:String,
             name15:String,
             name16:String,
             name17:String,
             name18:String,
             name19:String,
             name20:String,
             name21:String,
             //name22:String,
             name23:String
         ): Unit = {
            println(name1 + "," + name2 + "," + name3)
        }

        fun11(
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
             "zhangsan",
            //"lisi",
            "wangwu"
        )

        //val f = fun11 _

    }
}
