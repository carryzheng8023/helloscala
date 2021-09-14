package xin.carryzheng.helloscala.chapter06

object Scala03_Object_Import_1 {
    def main(args: Array[String]): Unit = {
        // TODO - 面向对象编程 - import

        // scala中导入对象，这个对象必须使用val声明
        val user = new User()
        import user._
        println(name)
        test()
    }
    class User {
        var name : String = "zhangsan"
        def test(): Unit = {

        }
    }
}

