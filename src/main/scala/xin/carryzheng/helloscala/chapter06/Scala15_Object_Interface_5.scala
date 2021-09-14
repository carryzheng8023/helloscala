package xin.carryzheng.helloscala.chapter06

object Scala15_Object_Interface_5 {

    def main(args: Array[String]): Unit = {

        new MySQL().oper()

    }
    trait Operate {
        def oper(): Unit = {
            println("操作数据")
        }
    }
    trait DB extends Operate {
        override def oper(): Unit = {
            print("向数据库中")
            super[Operate].oper()
        }
    }
    trait Log extends Operate {
        override def oper(): Unit = {
            print("向日志文件中")
            super.oper()
        }
    }
    // 扩展功能 - 初始化顺序 - 从左到右
    // 扩展功能 - 执行顺序   - 从右向左
    class MySQL extends Log with DB {

    }
}
