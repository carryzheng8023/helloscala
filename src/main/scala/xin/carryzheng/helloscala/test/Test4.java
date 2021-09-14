package xin.carryzheng.helloscala.test;

public class Test4 {
    public static void main(String[] args) throws Exception {

        String s1 = new String("abc");
        String s2 = new String("abc");

        //System.out.println(s1 == s2); // false
        //System.out.println(s1.equals(s2)); // true

        // Integer.valueOf
        Integer i1 = 200;
        Integer i2 = 200;

        // 双等号其实就是比较数据的值：基本数据类型，引用数据类型
        System.out.println(i1 == i2);

    }

}
