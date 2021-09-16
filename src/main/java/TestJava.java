/**
 * @author zhengxin
 * @date 2021-09-15 20:12:05
 */
public class TestJava {

  public static void main(String[] args) {

    new Thread(
            () -> {
              System.out.println("a");
            },
            "a")
        .start();
  }
}
