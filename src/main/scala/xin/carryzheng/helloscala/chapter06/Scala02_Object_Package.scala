package xin.carryzheng.helloscala.chapter06

class Test {
        def test(): Unit = {
            println("test...")
        }
    }
    object Scala02_Object_Package {
            def main(args: Array[String]): Unit = {
                // TODO - 面向对象编程 - 包
                /*
                  java中包的作用
                  1. 访问权限
                  2. 分包管理
                  3. 区分相同名称的类 ：
                            SqlDate, UtilDate
                  4. 包路径和存放的物理路径有关系
                 */

                // java中的包的作用比较简单，scala对package的用法进行了扩展
                // 1. package关键字可以多次声明，形成路径的概念
                // 2. 可以设定包的作用域
                // 3. 在同一个源码中，子包中可以直接访问父包中的内容，而不需要导入
                // 4. 可以将包当成对象来用
                //new Test().test()
                //testPackage()
            }

        }


