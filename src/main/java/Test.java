/**
 * @author zhengxin
 * @date 2021-09-08 11:24:11
 */
public class Test {

  public static void main(String[] args) throws Exception{

//    User user = null;
//    test(user.age);  // Integer.intValue 拆箱空指针
//    System.out.println(user.age);

    //    Thread t1 = new Thread();
    //    Thread t2 = new Thread();
    //
    //    t1.start();
    //    t2.start();
    //
    //    //区别： 字体不同
    //    t1.sleep(1000);  // static方法  MainThread休眠
    //    t1.wait(1000); // member方法  t2等待

    System.out.println(isEmpty(null));

  }

  public static void test(int age){
    System.out.println(age);
  }

  public static boolean isEmpty(String s){
//    return s == null || s.equals("");
    return null == s | "".equals(s);
  }
}


class User{

  public User(){
    System.out.println("user constructor");
  }

  public static int age = 12;

  @Override
  public String toString() {
    return "User["+age+"]";
  }
}