package xin.carryzheng.helloscala.chapter06

object Scala15_Object_Interface_3 {

    def main(args: Array[String]): Unit = {

        // 初始化顺序
        // 1. 父类的初始化优先于子类和子类同级的特质初始化
        // 2. 父特质的初始化优先于子特质
        // 3. 同级的特质初始化优先于类
        // 4. 同级的特质和类，那么先混入的特质先初始化，依次类推
        new F()
    }
    trait A {
        println("aaaa")
    }
    trait B {
        println("bbbb")
    }
    trait E {
        println("eeee")
    }
    class C extends B {
        println("cccc")
    }
    class D extends C with E {
        println("dddd")
    }
    class F extends B with A with E {
        println("ffff")
    }
}
