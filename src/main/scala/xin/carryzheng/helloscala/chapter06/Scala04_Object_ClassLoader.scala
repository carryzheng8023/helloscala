package xin.carryzheng.helloscala.chapter06

object Scala04_Object_ClassLoader {
    def main(args: Array[String]): Unit = {

        // TODO
        //   如果自定义的类和Java中类重名（完整的类名），这里就需要搞明白用谁的问题
        //   JVM子当前情况下，有一个双亲委派机制
        //   一个类如果想要能运行，必须被JVM加载到内存中
        //   这个加载过程是由类加载器完成的
        //   JVM中默认有三个类加载器
    }

}
