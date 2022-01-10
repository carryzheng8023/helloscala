/**
 * @author zhengxin
 * @date 2021-09-15 20:12:05
 */
public class TestJava {

    public static void main(String[] args) {

        final char[] chars = new char[]{'a', 'a', 'a'};
        chars[1] = 'b';
        System.out.println(chars);


        String s2 = new String("abc");
        String s3 = new String("abc");
//        String s1 = "abc";

        System.out.println(s2 == s3);

        label11:{
            System.out.println("sss");
            label1: {
                if(!s2.equals(s3)){
                    break label11;
                }
            }
        }



    }
}
