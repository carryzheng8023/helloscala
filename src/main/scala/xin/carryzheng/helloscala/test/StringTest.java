package xin.carryzheng.helloscala.test;

import java.lang.reflect.Field;

public class StringTest {
    public static void main(String[] args) throws Exception {

        // ,。
        String s = " a b ";
        s = s.trim(); // 去掉字符串的首尾（半角）空格
        System.out.println("!"+s+"!");
        // ! a b !
        // !a b!
        // !ab!

        // String类底层char[]的内存地址不能变,但时数组的内容可变
        // 但是String类没有提供任何改变内容的方法，所以String中所有的改变内容的方法都是创建新的字符串
        // 如果非要想变的话，可以采用反射的方式
        Class<String> stringClass = String.class;
        Field value = stringClass.getDeclaredField("value");
        value.setAccessible(true);
        char[] cs = (char[])value.get(s);
        cs[2] = 'd';

        System.out.println(s);
    }
}
