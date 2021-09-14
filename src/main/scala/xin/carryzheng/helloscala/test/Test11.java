package xin.carryzheng.helloscala.test;

import static com.atguigu.bigdata.scala.bean.Emp.age;

public class Test11 {
    public static void main(String[] args) throws Exception {

        AAA aaa = new AAA();
        aaa.test();
        //System.out.println(aaa.age);

    }

}
class AAA {
    public int age = 20;
    public void test() {
        //int age = 10;

        System.out.println(age);
    }
}
