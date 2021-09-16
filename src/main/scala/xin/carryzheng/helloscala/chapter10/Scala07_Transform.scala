package xin.carryzheng.helloscala.chapter10

import xin.carryzheng.helloscala.chapter10.Scala07_Transform.User

object Scala07_Transform {

    def main(args: Array[String]): Unit = {

//        implicit def transform( user: User ): UserExt = {
//            new UserExt
//        }

        // TODO 隐式类不能作为顶级类存在，只能嵌套在内部使用

        import xin.carryzheng.helloscala.bean.ImplTest._

        // 查找隐式转换的范围：
        // 1. 当前代码作用域
        val user = new User()
        user.insertUser()
        // User => UserExt
        user.updateUser()
    }
    // TODO 隐式类 = 类 + 隐式函数
//    implicit class UserExt(user: User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
//        def updateUser(): Unit = {
//            println("update user...")
//        }
    }

}
//implicit class UserExt(user: User) {
//    def updateUser(): Unit = {
//        println("update user...")
//    }
//}
class Test07 {
//    implicit class UserExt(user: User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
object Test07 {
//    implicit class UserExt(user: User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
trait MyTrait07 {
//    implicit class UserExt(user: User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
object MyTrait07 {
//    implicit class UserExt(user: User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}