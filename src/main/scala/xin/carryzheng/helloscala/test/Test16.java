package xin.carryzheng.helloscala.test;

import java.util.*;

public class Test16 {
    public static void main(String[] args) throws Exception {

        AAA16 aaa = new AAA16(); // aaa
        //test(aaa);
        BBB16 bbb = new BBB16(); // bbb
        test(bbb);
        AAA16 ccc = new BBB16(); // aaa or bbb
        //test(ccc);

//        List list1 = new ArrayList();
//        list1.clone();
//        ArrayList list2 = new ArrayList();
//        list2.clone();
//        LinkedList list3 = new LinkedList<>();
//        list3.addFirst();

    }
//    public static void test( AAA16 aaa ) {
//        System.out.println("aaaaa");
//    }
    public static void test( BBB16 bbb ) {
        System.out.println("bbbbb");
    }
}
class AAA16 {

}
class BBB16 extends AAA16 {

}
