package xin.carryzheng.helloscala.chapter02

object Scala03_Name {

    def main(args: Array[String]): Unit = {

        // TODO 标识符 - 就是起名
        // scala中标识符的命名规则默认和java是一样的。
//        val _name : String = "zhangsan"
//        val email : String = "zhangsan"
//        val email1 : String = "zhangsan"
//        val email$ : String = "zhangsan"
//        //val 1email$ : String = "zhangsan"
//        val Private : String = "zhangsan"
//        // 下划线不推荐独立声明为变量，因为使用有问题。
//        val _ : String = "zhangsan"
        println("*************************************")
        // TODO Java中不能使用特殊符号的，scala中特殊符号可以独立使用
        //      Scala中不要去记命名规则
//        val ~ :String = "zhangsamn"
//        val `` :String = "zhangsamn"
//        val ! :String = "zhangsamn"
//        val @@ :String = "zhangsamn"
//        val ## :String = "zhangsamn"
//        val $ :String = "zhangsamn"
//        val % :String = "zhangsamn"
//        val ^ :String = "zhangsamn"
//        val & :String = "zhangsamn"
//        val * :String = "zhangsamn"
//        val + :String = "zhangsamn"
//        val - :String = "zhangsamn"
//        val ? :String = "zhangsamn"
//        val > :String = "zhangsamn"
//        val < :String = "zhangsamn"
//        val \ :String = "zhangsamn"
//        val ::: :String = "zhangsamn"

        // 颜文字
        //val :-< = "zhangsan"
        //println(:-<)
//        val :: : String = "zhangsan"
//
//        // 自定义的标识符不能使用$开头
//        val colon$colon : String = "zhangsan"
//        println(::)

        val `private` : String = "zhangsan123"

        println(`private`)


    }
}
