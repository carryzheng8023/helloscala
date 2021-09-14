package xin.carryzheng.helloscala.chapter06

import scala.beans.BeanProperty

object Scala06_Object_Field {
    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 属性

        // 所谓的属性其实就是类的特征，一般使用名词表示
        val user = new User()
        //user.name = "zhangsan"
        //println(user.name)
        //println(user.age)
        // 如果想要类中的属性采用系统默认初始化，那么需要在赋值时使用特殊符号：下划线
        // 类的属性如果使用val声明，编译时，会采用final修饰，所以那么不能采用默认初始化
        //user.email = "yyy"

        // 类的属性在编译时，都会编译为私有的属性，同时编译出对应的公共的set,get方法
        // 给属性赋值时，等同于调用属性的set方法，访问属性时，等同于调用属性的get方法
        // 使用val声明的属性，在编译时，不会生成set方法的
        // 如果属性使用private修饰，那么编译的set，get方法就会声明为private，所以外部访问不了
        //classOf[String].getFi
        //user.setTel()
        //user.getTel()
    }
    class User {
        // 声明属性
        // scala中的属性，其实就是类中的变量,所以属性的声明其实就是变量的声明
        private var name : String = _
        private var age : Int = _
        private val email : String = "xxxx@xx.com"
        @BeanProperty var tel : String = "xxxx@xx.com"
    }
}