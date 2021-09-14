package xin.carryzheng.helloscala.chapter11

object Scala03_Generic {

    def main(args: Array[String]): Unit = {

        val list : List[User11] = List(
            new User11(), new User11(), new User11()
        )

        // (A1, A1) => A1
        // A => User11
        // A1 >: A
//        val person1: Person11 = list.reduce[Person11](
//            (x, _) => x
//        )

//        val child11: Child11 = list.reduce[Child11](
//            (x, _) => x
//        )
//        println(child11)


    }

}
