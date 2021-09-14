package xin.carryzheng.helloscala.chapter10

object Scala01_Transform {

    def main(args: Array[String]): Unit = {

        //val i : Int = 10
        //val b : Byte = i.toByte;

        //val bb : Byte = 10;
        //val ii : Int = bb;

        def test( s: String ) = {
            //s.substring(0,1).toUpperCase()
            //s.charAt(0).toString.toUpperCase
            //s(0).toString.toUpperCase

            // String => StringOps
            s.apply(0).toString.toUpperCase

        }

        println(test("zhangsan"))

        val list = List(
            List(1,2), 3, List(4,5)
        )

        println(list.flatMap {
            case list: List[_] => list
            case data => List(data)
        }.mkString(","))


    }
}
