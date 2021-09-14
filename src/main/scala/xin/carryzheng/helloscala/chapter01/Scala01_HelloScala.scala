package xin.carryzheng.helloscala.chapter01

/*
   package : 包
   object  : 关键字，声明一个对象
            使用object关键字声明的对象的同时，也生成的两个类
            1. Scala01_HelloScala
            2. Scala01_HelloScala$ (对象的类型)

   Scala01_HelloScala ：对象名

   def : 声明方法的关键字

   main : (入口)方法名

        java : public static void main(String[] args)
        scala : def main( args : Array[String] ) : Unit

    () : 参数列表，多个参数使用逗号隔开

    args: Array[String] => 参数名 : 参数类型

        java => String[] args => 强类型语言
        scala => args:Array[String]

    Array[String] : scala语言是一个完全面向对象的语言，而java恰恰不是

        java : Object[]
        scala : [] 转换 Array[String], scala种中括号表示泛型

    : Unit

        java =>  public 类型 名称()
        scala => 方法名称() : 返回值类型

    Unit : 返回值类型

        java => void 不是面向对象
        scala => Unit,表示没有返回值，等同于java中的void

    = :
        java => public void test()  {}

            User user = new User()
            user.test()

    System.out.println : Scala语言来自于java语言
            java语言的代码在scala中都能使用

            如果使用scala完成同样的逻辑

    （*）static : 静态操作不会面向对象的语法, scala中没有静态语法

    分号：

        java中一行逻辑的结尾需要采用分号。
        scala中一行逻辑的结尾需要采用分号，但是在一行代码中只有一个逻辑时，可以省略

 */


object Scala01_HelloScala {
    // 类体
    def main(args: Array[String]): Unit = {
        // 方法体
        System.out.println("Hello Scala")
        println("Hello Java")

    }
}
