package xin.carryzheng.helloscala.test;

import com.atguigu.bigdata.scala.bean.Child;
import com.atguigu.bigdata.scala.bean.Emp;

public class StaticTest {
    public static void main(String[] args) {

        // 加载一个类的时候，会执行静态代码块的代码中
        System.out.println(Emp.age);

        new Child().test();

    }
}
