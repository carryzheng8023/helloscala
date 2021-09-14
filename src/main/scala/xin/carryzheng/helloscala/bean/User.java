package xin.carryzheng.helloscala.bean;

public class User  {
    public int id;
//    public static int age;
//    public String name = "zhangsan";
//
//    static {
//        age = 20;
//        System.out.println("user static code...");
//    }

    @Override
    public boolean equals(Object o) {
        if ( o instanceof User ) {
            User other = (User)o;
            return this.id == other.id;
        } else {
            return false;
        }
    }
}
