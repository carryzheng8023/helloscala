package xin.carryzheng.helloscala.chapter11

object Scala01_Generic {

    def main(args: Array[String]): Unit = {

        // TODO scala中的泛型和java的泛型大同小异
        //   1. java中使用尖括号，scala中采用的是中括号
        //   2. scala中泛型也是不可变的
        //val t1 : Test[User11] = new Test[User11]()
        //val t2 : Test[User11] = new Test[Person11]()
        //val t3 : Test[User11] = new Test[Child11]()

        //   3. scala中为了开发方便，让泛型可以变。
        //      将类型和泛型当成整体来看
        //      TestUser11 => TestUser11
        //      TestUser11 => TestPerson11
        //      TestUser11 => TestChild11
        //      TODO 如果泛型存在上下级关系，那么当成整体后也存在上下级, 需要对泛型进行变化：协变 （+）
        //      TODO 如果泛型存在上下级关系，那么当成整体后也存在下上级, 需要对泛型进行变化：逆变 （-）
        // Array[Int] => int[]


    }
    class Test[-T] {

    }
}
