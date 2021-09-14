package xin.carryzheng.helloscala.chapter03

object Scala03_Operator {

    def main(args: Array[String]): Unit = {

        // TODO 运算符
        val s1 : String = new String("123")
        val s2 = new String("123")

        // TODO 马丁想：常见的数据比较就应该使用双等号，所以就应该用双等号比较所有的数据
        //            java中没有办法做到这一点，所以马丁对双等号进行修改

        // 在scala中，双等号比较其实底层就是非空的equals操作
        println(s1 == s2)
        println(s1.equals(s2))

        // eq方法其实底层就是双等号，判断数据的值是否相等
        println(s1.eq(s2))
    }
}
