package xin.carryzheng.helloscala.bean

object ImplTest {
    implicit class UserExt(user: xin.carryzheng.helloscala.chapter10.Scala07_Transform.User) {
        def updateUser(): Unit = {
            println("update user...")
        }


    }
}
