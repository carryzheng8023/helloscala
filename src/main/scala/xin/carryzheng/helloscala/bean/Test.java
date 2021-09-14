package xin.carryzheng.helloscala.bean;

public class Test {
    private static Test test = new Test();
    private Test() {

    }
    public static Test getInstance() {
        if ( test == null ) {
            test = new Test();
        }
        return test;
    }
}
