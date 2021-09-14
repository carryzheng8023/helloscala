package xin.carryzheng.helloscala.test;

public class Test23 {
    public static void main(String[] args) {

//        try {
//            int i = 0;
//            int j = 10 / i;
//        } catch ( ArithmeticException e ) {
//            System.out.println("除数为0");
//        } catch (Exception e) {
//            System.out.println("其他异常");
//        } finally {
//
//        }
//        System.out.println("main方法执行完毕");

        System.out.println(getResult());
    }
    // 每一个方法都有一个临时结果变量
    public static int getResult() {

        int _tmpResult = 0;

        int i = 0;
        try {
            //return i++;
            _tmpResult = i++; // _tmpResult = 0; i = 1
            return _tmpResult;
        } finally {
            //return ++i;
            _tmpResult = ++i; // i = 2; _tmpResult = 2
            return _tmpResult; // return _tmpResult
        }

        //new Object()
    }

}

