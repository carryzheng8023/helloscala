package xin.carryzheng.helloscala.test;


public class Test15 {
    public static void main(String[] args) throws Exception {

        // 访问权限：权力和限制，
        // 方法的提供者和方法的调用者的关系：
        // 方法的提供者 : java.lang.Object
        // 方法的调用者 : com.atguigu.bigdata.scala.test.Test15
        ABC abc = new ABC();
        abc.clone();

    }

}
class ABC {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
