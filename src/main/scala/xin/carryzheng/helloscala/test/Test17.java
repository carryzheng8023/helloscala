package xin.carryzheng.helloscala.test;

public class Test17 {
    public static void main(String[] args) throws Exception {

        AAA17 aaa = new AAA17();
        System.out.println(aaa.sum()); // 20

        BBB17 bbb = new BBB17();
        System.out.println(bbb.sum()); // 30

        AAA17 ccc = new BBB17();
        System.out.println(ccc.sum()); // 30

        // TODO 所谓的方法的重写，其实就是父类和子类具有相同的方法，JVM如何区分的问题
        // 动态绑定机制 ：在调用对象的成员方法时，JVM会将方法和实际对象的内存进行绑定后调用
        // 属性没有动态绑定的概念： 属性在哪里声明，在哪里使用

    }
}

class AAA17 {
    public int age = 10;
    public int sum() {
        return getAge() + 10;
    }
    public int getAge() {
        return age;
    }
}

class BBB17 extends AAA17 {
    public int age = 20;
//    public int sum() {
//        return getAge() + 20;
//    }
    public int getAge() {
        return age;
    }
}
