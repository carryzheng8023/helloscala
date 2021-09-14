package xin.carryzheng.helloscala.test;

public class Test6 {
    public static void main(String[] args) throws Exception {

        //char c = 'A';
        //char c1 = c++; // A
        //char c2 = c + 1; // Error
        //char c3 = ++c; // Error
        //byte b = 127;
        //byte b1 = ++b;
        //byte b2 = (byte)(b + 1);
        // 0111 1111
        // 0000 0000 0000 0000 0000 0000 1000 0000
        //                               1000 0000
        // 10000000 =>
        // 11111111 => -1
        // 符号位（1） + 数据位（7）
        // 负数 + 0000000 + 1
        // 负数 + 1111111
        // 8位中负数的最小值 ： -128
        // 1000 0001 => -127
        // 1111 1110
        //System.out.println(b2);

        byte b = 0;
        // 赋值 ： 将等号的右边的【计算结果】给左边
        b = b++; // 先赋值，b自增

        // _tmp = b++; // _tmp = 0; b = 1
        // b = _tmp    // b = _tmp

        System.out.println(b);

    }

}
