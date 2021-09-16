package xin.carryzheng.helloscala.chapter11;

import xin.carryzheng.helloscala.bean.User;

public class Scala01_Generic_Java {
    public static void main(String[] args) {
        // TODO 泛型和类型的区别？
        //  1. 类型用于约束外部的数据类型
        //  2. 泛型用于约束内部的数据类型
        //  从这个角度来看，泛型和类型的层次不一样

        // TODO 自定义泛型
        //  有的时候，将泛型作为参数类型传递到类中，用于约束内部数据类型
        //  所以也称之为类型参数
        Test<User> test = new Test<User>();
        User t = test.t;

        // TODO 泛型是不是一定要传递?
        //   如果声明了泛型，但是在使用时没有传递泛型，此时内部数据的类型是java.lang.Object
        //   泛型只在编译时起作用，给编译器用的，类似于super关键字
        //   将这个方式称之为泛型的擦除
        Test t1 = new Test();
        Object t2 = t1.t;

    }
}
class Test<T> {
    public T t;
}
