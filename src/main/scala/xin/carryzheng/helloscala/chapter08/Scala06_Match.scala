package xin.carryzheng.helloscala.chapter08

object Scala06_Match {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配
        // TODO 匹配对象

        val user = getUser() // zhangsan, 30 => apply => User(zhangsan, 30)
        //                      object => unapply => zhangsan, 30
        user match {
            case User("zhangsan", 30) => println("用户为zhangsan")
            case User("lisi", 30) => println("用户为lisi")
            case _ => println("用户为其他")
        }

    }

    class User {
        var name : String = _
        var age : Int = _
    }
    object User {
        def apply( name:String, age:Int ) = {
            val user = new User()
            user.name = name
            user.age = age
            user
        }

        def unapply(arg: User): Option[(String, Int)] = {
            Option( (arg.name, arg.age) )
        }
    }

    def getUser() = {
        User("zhangsan", 40)
    }
}
