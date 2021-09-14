package xin.carryzheng.helloscala.test;

public class Test5 {
    public static void main(String[] args) throws Exception {
        System.out.println(isNotEmpty(null));

    }
    public static boolean isNotEmpty( String s ) {
        return s != null && !s.trim().equals("");
    }

}
