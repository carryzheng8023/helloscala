package xin.carryzheng.helloscala.chapter09;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {

        //new Scala03_Exception().test();


    }
    public static void test()  throws FileNotFoundException{
        throw new FileNotFoundException("xxxx");
    }
}
