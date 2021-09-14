package xin.carryzheng.helloscala.test;

public class Test9 {
    public static void main(String[] args) throws Exception {
        try {
            for ( int i = 0; i < 10; i++ ) {
                if ( i == 5 ) {
                    throw new Exception();
                }
                System.out.println(i);
            }
        } catch ( Exception e ) {
            //e.printStackTrace();
        }

        System.out.println("main....");

//        for ( int i = 0; i < 10; i++ ) {
//            if ( i != 5 ) {
//                System.out.println(i);
//            }
//
//        }


    }

}
