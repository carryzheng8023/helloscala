package xin.carryzheng.helloscala.chapter05

object Scala03_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程

        def test(): Unit = {
            println("function test...")
        }

        // 所谓的函数，其实编译为字节码文件后，也是方法
        // 1) private static final
        // 2) 在编译为字节码时，为了避免和方法名称冲突，所以函数名称会被改动，自动添加额外的内容
        //test()
        this.test()
    }
    def test(): Unit = {
        println("method test...")
    }
}
