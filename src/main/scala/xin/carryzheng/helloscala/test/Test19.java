package xin.carryzheng.helloscala.test;

public class Test19 {
    public static void main(String[] args) throws Exception {

        User19 user = new User19();

        Thread t1 = new Thread(
            new Runnable() {
                public void run() {
                    user.name = "zhangsan";
                    try {
                        Thread.sleep(1000);
                    } catch ( Exception e ) {

                    }
                    System.out.println(user.name);
                }
            }
        );
        Thread t2 = new Thread(
            new Runnable() {
                public void run() {
                    user.name = "lisi";
                    try {
                        Thread.sleep(1000);
                    } catch ( Exception e ) {

                    }
                    System.out.println(user.name);
                }
            }
        );

        t1.start();
        t2.start();

        System.out.println("main方法执行完毕");

    }
}
class User19 {
    public String name;
}

