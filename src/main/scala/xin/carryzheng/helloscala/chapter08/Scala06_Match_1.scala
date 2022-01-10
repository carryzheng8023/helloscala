package xin.carryzheng.helloscala.chapter08

object Scala06_Match_1 {

    def main(args: Array[String]): Unit = {

        // TODO - 模式匹配
        // TODO 匹配对象

        val user = getUser()
        user match {
            case User("zhangsan", 30) => println("用户为zhangsan")
            case User("lisi", 30) => println("用户为lisi")
            case _ => println("用户为其他")
        }

//        user.name = "zhangsan"
    }

    // 使用case关键字声明的类，称之为样例类，专门是用于模式匹配的类
    // 也可以用于其他场合。编译器给样例类添加了大量的方法，apply, unapply, equals,
    // 样例类再编译时自动进行了序列化的操作
    // 样例类的构造参数可以作为对象的属性使用，而且无需使用val，var声明,但是不能改，如果想要修改，那么需要显示声明为var
    case class User( name : String, age : Int)

    def getUser() = {
        User("zhangsan", 30)
    }
}
