package xin.carryzheng.helloscala.chapter06

import scala.beans.BeanProperty

object Scala07_Object_Access {
    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - 访问权限
        /*
           java :

           1. private   => 同类
           2. (default) => 同类，同包
           3. protected => 同类，同包，子类
           4. public    => 任意

           scala :

           1. private        => 同类
           2. private[包名]   => 同类， 包私有
           3. protected      => 同类，子类 => 没有同包的概念
           4. (default)      => 公共的

         */

    }
}
import com.atguigu.bigdata.scala.chapter06.test.test1.Test
    import test.test1.Test
    // 不同包
    class Test2 {

        def test(): Unit = {
            val t = new Test()
            //println(t.name)
            //println(t.age)
           // println(t.tel)
            //println(t.remark)
        }
    }
    class Test4 extends Test {
        def test2(): Unit = {
            println(tel)
        }
    }
    class Test {
            private var name : String = _
            private[test1] var age : String = _
            protected var tel : String = _
            var remark : String = _

            // 同类
            def test(): Unit = {
                println(name)
                println(age)
                println(tel)
                println(remark)
            }
        }
        // 同包
        class Test1 {
            def test(): Unit = {
                val t = new Test()
                //println(t.name)
                println(t.age)
                //println(t.tel)
                println(t.remark)
            }
        }
        class Test3 extends Test {
            def test2(): Unit = {
                println(tel)
            }
        }