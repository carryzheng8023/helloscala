package xin.carryzheng.helloscala.chapter07

object Scala03_Collection_Seq {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Seq  - 序列

        // 创建
        //new Seq()
        //val seq = Seq(1,2,3,4)
        //println(seq)
        val list = List(1,2,3,4)

        // 操作
        // 默认情况下，scala提供的集合都是不可变的。
        list.+:(5) // 5 +: list
        list.:+(5) // list :+ 5
        //list.++:()

        // 增加数据
        // List() => 空集合 => Nil
        // Nil.::(3).::(2).::(1)
        val list1 = 1 :: 2 :: 3 :: Nil
        val list2 = List(4,5,6)
        val list3 = 1 :: 2 :: list2 :: Nil
        // 将一个整体中的内容拆分成一个 一个的个体来使用，称之为扁平化
        val list4 = 1 :: 2 :: list2 ::: Nil

        val list5 = 1 :: list2

        //println(list3)
        //println(list4)
       // println(list5 eq list2)


        // 遍历
        //list5

    }
    def test( name:String* ): Unit = {
        println(name)
    }
}
