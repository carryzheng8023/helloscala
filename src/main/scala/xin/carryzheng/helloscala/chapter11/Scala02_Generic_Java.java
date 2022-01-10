package xin.carryzheng.helloscala.chapter11;

import xin.carryzheng.helloscala.bean.Emp;
import xin.carryzheng.helloscala.bean.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scala02_Generic_Java {
    public static void main(String[] args) {

        // TODO 泛型的使用时机
        List list = new ArrayList();
        list.add(new Emp());
        List<User> userList = list;
        System.out.println(userList);
        for ( User user : userList ) {
            System.out.println(user);
        }
        // TODO 泛型和类型没有关系
        //List<String> stringList = new ArrayList<String>();
        //test(stringList);

        // TODO 泛型不可变
        List<User11> userList1 = new ArrayList<User11>();
        //List<User11> userList2 = new ArrayList<Person11>();
        //List<User11> userList3 = new ArrayList<Child11>();

    }
//    public static void test( List<Object> list ) {
//        System.out.println(list);
//    }
    public static void test( Collection<String> list ) {
        System.out.println(list);
    }
}
class Person11 {

}
class User11 extends Person11 {

}
class Child11 extends User11 {

}