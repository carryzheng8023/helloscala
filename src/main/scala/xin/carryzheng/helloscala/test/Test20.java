package xin.carryzheng.helloscala.test;

public class Test20 {
    public static void main(String[] args) throws Exception {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        test();
                    }
                }
        ).start();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        test();
                    }
                }
        ).start();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        test();
                    }
                }
        ).start();
    }

    public static void test() {

        // 多例
        StringBuilder ss = new StringBuilder();
        for ( int i = 0; i < 10000; i++ ) {
            ss.append(i);
        }
        System.out.println(ss.toString());
    }
}

