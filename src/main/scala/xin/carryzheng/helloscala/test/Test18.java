package xin.carryzheng.helloscala.test;

public class Test18 {
    public static void main(String[] args) throws Exception {
        CCC18 ccc = new BBB18();
        System.out.println(ccc);

        System.out.println(BBB18.class.getInterfaces().length);
        System.out.println(AAA18.class.getInterfaces().length);

        // 接口只和当前实现类有关系，和父类，子类没有任何关系
    }
}
interface CCC18 {

}
class AAA18 implements CCC18 {

}
class BBB18 extends AAA18 {

}
