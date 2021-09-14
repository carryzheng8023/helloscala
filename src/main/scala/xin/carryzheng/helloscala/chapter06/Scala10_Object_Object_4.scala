package xin.carryzheng.helloscala.chapter06

object Scala10_Object_Object_4 {

    def main(args: Array[String]): Unit = {

        // 伴生对象是可以直接访问伴生类中的私有内容
        // 如果使用伴生对象来构建伴生类对象的场合，可以自动识别 一个方法 : apply
        println(User.getInstance())
        println(User.apply())
        println(User())

        Range.apply(1, 5, 2)
        Range(1, 5, 2)

    }
    // 构造方法私有化
    class User private() {

    }
    object User {
        def getInstance(): User = {
            new User()
        }
        def apply(): User = {
            println("apply...")
            new User()
        }
    }
}
