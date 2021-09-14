package xin.carryzheng.helloscala.chapter10

object Scala04_Transform {

    def main(args: Array[String]): Unit = {

        // TODO 隐式转换函数
        implicit def transform( user : User ): UserExt = {
            new UserExt()
        }

//        implicit def transform1( user : User ): UserExt = {
//            new UserExt()
//        }

        // 同一个作用域中是不能由相同的转换规则
        val user = new User()
        user.insertUser()
        user.updateUser()
    }

    class UserExt {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
//    class Person {
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
