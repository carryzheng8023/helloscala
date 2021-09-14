package xin.carryzheng.helloscala.test;

public class Test {
    public static void main(String[] args) {

        // 空指针异常：一个引用对象为null，调用对象的成员属性或成员方法。

        // . : 从属关系
        User user = null;
        test(user.age); // 拆箱 : Integer.intValue
        //System.out.println(user.age);

    }
    public static void test( int age ) {
        System.out.println(age);
    }
}
class User {
    public static Integer age;
}
