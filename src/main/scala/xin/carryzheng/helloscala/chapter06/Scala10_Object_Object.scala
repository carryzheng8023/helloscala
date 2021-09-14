package xin.carryzheng.helloscala.chapter06

object Scala10_Object_Object {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象  - 构造方法
        // 1. 构造方法如果是无参，那么构造对象时可以省略
        val user = new User()
        // 2. scala中构造方法的名称和类的名称不一样的
        //user.User()
        // 3. scala中，万物皆函数， 类也是函数, 类的构造方法是在类的后面增加小括号
        // 4. 类的初始化

    }
    class User() {
        // 构造函数体 & 类体
        var age : Int = _
        println("user...")
    }
}
