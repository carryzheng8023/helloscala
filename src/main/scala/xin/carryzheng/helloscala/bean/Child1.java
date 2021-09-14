package xin.carryzheng.helloscala.bean;

public class Child1 extends Parent1{
    public int age = 20;

    public void test() {
        // super关键字仅仅应用在编译时
        System.out.println(super.age);
        System.out.println(this.age);
    }
}
