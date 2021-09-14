package xin.carryzheng.helloscala.chapter06

import scala.beans.BeanProperty

object Scala08_Object_Method {
    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 方法

        // 所谓的方法，其实就是函数，只是声明在类中，符合类的约束条件
        // 创建一个类后，这个类都有什么方法？
        // java.lang.Object中的方法都可以使用
        val value: Class[User] = classOf[User]
        //new User().

        // isInstanceOf
        // asInstanceOf
        // eq

    }
    class User {
        var id : Int = _
        override def equals(o: Any): Boolean = {
            if ( o.isInstanceOf[User] ) {
                val other = o.asInstanceOf[User]
                this.id == other.id
            } else {
                false
            }
        }
    }
}