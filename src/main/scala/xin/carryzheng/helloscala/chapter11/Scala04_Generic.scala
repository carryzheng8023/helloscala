package xin.carryzheng.helloscala.chapter11

object Scala04_Generic {

    def main(args: Array[String]): Unit = {

//        def f[A : Test](a: A) = println(a)
//        implicit val test : Test[Child11] = new Test[Child11]
//        f( new Child11() )
        val list = List(1,2,3,4)
        // list.reduce()  => (A1, A1) => A1
        //list.reduceLeft() => (B, A) => B

        // "1234"

        //list.fold()
       // list.foldLeft()

        // (((("" + 1) + 2) + 3) + 4) => 1234
        val str: String = list.foldLeft("")(_ + _)
        println(str)
    }

}
