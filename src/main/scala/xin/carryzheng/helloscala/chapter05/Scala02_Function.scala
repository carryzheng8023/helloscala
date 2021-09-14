package xin.carryzheng.helloscala.chapter05

object Scala02_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        // 函数和方法的区别：
        // 1. 方法从属于对象或类，所以不能够在内部声明，只能在类中声明
        // 2. 函数不从属于任何对象，所以可以独立声明
        // 3. 方法使用的范围更广，方法从属于类或对象，所以调用时，应该通过类或对象访问
        //    既然方法从属于类或对象，所以应该遵循相应的规范
        // 4. 因为函数不属于任何东西，所以只能在指定的范围中调用,也没有所谓的重载和重写
        def xxx(): Unit = {
            println("test...")
        }

        // TODO 调用函数
        // 函数名(参数1， 参数2.。。)
//        test()
//        test

    }
    def xxx(): Unit = {

    }
}
