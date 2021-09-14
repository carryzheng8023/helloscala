package xin.carryzheng.helloscala.chapter10

object Scala03_Transform {

    def main(args: Array[String]): Unit = {

        implicit def transform( user : User ): UserExt = {
            new UserExt()
        }

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
