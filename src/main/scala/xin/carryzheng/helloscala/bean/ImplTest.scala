package xin.carryzheng.helloscala.bean

object ImplTest {
    implicit class UserExt(user: com.atguigu.bigdata.scala.chapter10.Scala07_Transform.User) {
        def updateUser(): Unit = {
            println("update user...")
        }


    }
}
