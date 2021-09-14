package xin.carryzheng.helloscala.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test22 {
    public static void main(String[] args) throws Exception {

        // switch穿透
        int age = 10;
        switch (age) {
            default:
                System.out.println("other");
                break;
            case 10 :
                System.out.println("age = 10");
                break;
            case 20 :
                System.out.println("age = 20");
                break;
            case 30 :
                System.out.println("age = 30");
                break;

        }
    }

}

