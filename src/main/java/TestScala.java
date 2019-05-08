/**
 * scala反编译后的代码
 *
 * @author zhengxin
 * @date 2019-05-09 00:06:47
 */
public class TestScala {

    public static void main(String[] paramArrayOfString) {
        //TestScala..MODULE$.main(paramArrayOfString);
        TestScala$.MODULE$.main(paramArrayOfString);
    }
}

final class TestScala${

    public static final TestScala$ MODULE$;

    static {
        MODULE$ = new TestScala$();
    }

    public static void main(String[] args) {
        System.out.println("hello scala");
    }
    //private TestScala$() { MODULE$ = this; }

}