package xin.carryzheng.helloscala.chapter11;

import xin.carryzheng.helloscala.bean.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scala03_Generic_Java {
    public static void main(String[] args) {

        // TODO 泛型的变化：开发方便
        // 泛型的上限 ：意味着功能不丢失，一般用于消费数据
        Consumer<User> c = new Consumer<User>();
        User data = c.getMessage().data;

        // 泛型的下限 ：意味着对象具备通用性，一般用于生产数据
        Producer<User11> p = new Producer<User11>();
        p.produce(new Message<User11>());
        //p.produce(new Message<Child11>());
        //p.produce(new Message<Person11>());
    }

}
class Message<T> {
    public T data;
}
class Producer<B> {
    public void produce( Message<? super B> m ) {

    }
}
class Consumer<B> {
    public Message<? extends B> getMessage() {
        return null;
    }
}
