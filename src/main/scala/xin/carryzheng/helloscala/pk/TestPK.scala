/**
  *
  * @author zhengxin
  *         2020-06-23 15:57:45
  */

//在scala中 java.lang包 scala包 Predef包可以直接使用
//xin.carryzheng.helloscala.pk{} 表示创建了xin.carryzheng.helloscala.pk包
//在{}中可以继续创建子包scala 还可以写类class、特质trait、 对象object
package xin.carryzheng.helloscala.pk{



  class User { //表示在xin.carryzheng.helloscala.pk下创建User类

    def sayHello(): Unit = {

      //访问子包需要import
      import xin.carryzheng.helloscala.pk.scala2.Monster
      new Monster

    }

  }

  package scala2 { //创建包scala2
    class User{ //表示在xin.carryzheng.helloscala.pk.scala2下创建User类

    }

    class Monster{}

  }

  //1.在包中直接定义方法、变量是错误的=> 用包对象技术来解决
  //2.package object scala表示创建一个包对象，表示xin.carryzheng.helloscala.pk.scala对应的包对象
  //3.每一个包可以有一个包对象
  //4.包对象的名字需要和子包一样
  //5.在包对象可以定义变量和方法
  //6.在包对象中定义的变量和方法可以在对应的包中使用
  package object scala{

    val name = "king"
    def sayHi(): Unit ={
        print("package object scala sayHi")
    }

  }

  package scala{

    class User{
      def testUser(): Unit ={
        sayHi()
      }
    }

    class Person{ //表示在xin.carryzheng.helloscala.pk.scala下创建Person类
      val name = "Nick"

      def play(): Unit = {
        println(name + " plays")
      }
    }

    object Test{//表示在xin.carryzheng.helloscala.pk.scala下创建object Test
      def main(args: Array[String]): Unit = {

        println("ok!")

        val user = new User //就近原则
        println(user)

        sayHi()


      }
    }
  }
}



