package xin.carryzheng.helloscala.test;

import static xin.carryzheng.helloscala.bean.Emp.age;

public class Test12 {
    public static void main(String[] args) throws Exception {
        test("000000");
        test(null);
        test(null);
        test(null);
        test(null);
        test(null);

    }
    public static void test( String password ) {
        if ( password == null ) {
            password = "123123";
        }
        System.out.println("pswd = " + password);
    }

}
