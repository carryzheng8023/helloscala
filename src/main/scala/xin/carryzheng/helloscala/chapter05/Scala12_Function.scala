package xin.carryzheng.helloscala.chapter05

object Scala12_Function {

    def main(args: Array[String]): Unit = {

        // 尾递归
        // java中的尾递归依然会出问题。5200， 7800
        // scala对尾递归进行了优化：编译时转换为while(true)循环， 伪递归
        test1()
    }
    def test1( ) : Unit = {
        println("123")
        test1()

    }
//
//    def test2( ) : Unit = {
//        test2()
//        println("123")
//    }
}
