package xin.carryzheng.helloscala.chapter10

object Scala06_Transform {

    def main(args: Array[String]): Unit = {

//        implicit def transform( user: User ): UserExt = {
//            new UserExt
//        }

        val user = new User()
        user.insertUser()
        // User => UserExt
        user.updateUser()
    }
    // TODO 隐式类 = 类 + 隐式函数
    implicit class UserExt(user: User) {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
//        def updateUser(): Unit = {
//            println("update user...")
//        }
    }

}
