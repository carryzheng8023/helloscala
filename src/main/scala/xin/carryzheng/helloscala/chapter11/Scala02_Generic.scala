package xin.carryzheng.helloscala.chapter11

object Scala02_Generic {

    def main(args: Array[String]): Unit = {

        // TODO scala中的泛型也存在上限和下限的概念，声明方式不一样，采用的是颜文字
        val p = new Producer[User11]
        //p.produce(new Message[User11])
        //p.produce(new Message[Child11])
        //p.produce(new Message[Person11])

    }
    class Message[T] {
        var data : T = _
    }
    class Producer[B] {
        def produce( m : Message[_ >: B] ): Unit = {

        }
    }
    class Consumer[B] {
        // 上限
        def getMessage : Message[_ <: B] = {
            null
        }
    }
}
