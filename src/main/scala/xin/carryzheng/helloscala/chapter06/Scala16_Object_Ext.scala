package xin.carryzheng.helloscala.chapter06

object Scala16_Object_Ext {

    def main(args: Array[String]): Unit = {

        // OCP => Open Close
        val user = new User() with UserExt
        user.insertUser()
        user.updateUser()

    }
    trait UserExt {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
//
//        def updateUser(): Unit = {
//            println("update user...")
//        }
    }
}
