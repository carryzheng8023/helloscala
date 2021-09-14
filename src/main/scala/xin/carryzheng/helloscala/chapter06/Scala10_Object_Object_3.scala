package xin.carryzheng.helloscala.chapter06

object Scala10_Object_Object_3 {

    def main(args: Array[String]): Unit = {

        /*
           public class User {
               private String name;
               private String username;
               public User( String name ) {
                   this.name = name;
               }
           }


         */
        // TODO scala中的构造方法传参的目的就是给类的属性赋值，scala可以简化这个步骤
        //      在参数声明时使用var，val修饰，这样可以在编译时，可以直接生成属性

        val user = new User("zhangsan")
        user.name
    }

    class User( var name : String ) {

    }
}
