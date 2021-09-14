package xin.carryzheng.helloscala.chapter06

object Scala15_Object_Interface_1 {

    def main(args: Array[String]): Unit = {

        // TODO 马丁在scala中删除了接口的概念
        // scala中可以将多个对象的相同的特征从对象中剥离出来，形成一个特殊的语法结构，这个结构称之为特征（特质）
        // 如果一个对象符合这个特征，那么就可以将这个特征混入到对象中
        // 这里的特征（特质）使用关键字trait声明

        // trait在编译时其实就是接口，但是一般会将特质理解为接口和抽象类的结合体
        //new User().run()
        //new Runnable()
        //new User().eat()

        //如果一个类混入一个特质，那么使用extends关键字进行混入操作
        // 如果一个类有父类，但是又混入特质，采用with关键字进行混入
        // 如果有多个特质需要混入，也采用with
        //new User().ge

    }
    trait Runnable extends Exception {
       def run(): Unit = {
           println("run...")
       }
    }
    trait Eat {
        def eat(): Unit = {
            println("eat...")
        }
    }
    class User extends Runnable with Eat{

    }
}
