package xin.carryzheng.helloscala.chapter05

object Scala06_Function {

    def main(args: Array[String]): Unit = {

        // TODO 将函数作为对象来使用
        def test(): Unit = {
            println("test...")
        }
        //println(test _)

        // TODO 1. 对象赋值
        // User user = new User()
        // user.name
        // user.age
        // 对象应该有类型，函数对象就应该有函数类型
        // 将函数赋值给变量后，需要增加小括号，这个变量才可以执行
        // 1. Function0
        // 2. ()=>Unit
        //val fun = test _
        //test
        //println("*************")
        //fun()

        // TODO 2. 对象作为参数使用
        // public void test( User user ) {}
        // public void test( 函数参数名称：函数类型  ) {}
//        def test1( f : ()=>Unit ): Unit = {
//            f()
//        }
//
//        test1(test)

        // TODO 3. 对象作为返回值使用
        // public void test() { return new User(); }
        // def test() : Unit = { test }
//        def test2() = {
//            println("11111111")
//            def test22(): Unit = {
//                println("2222222222222")
//            }
//            test22 _
//        }
//
//        test2()

        def test3( f : ()=>Unit ): Unit = {
            println(f)
        }

        test3( test _ )
        test3( test _ )
        test3( test _ )


    }
}
