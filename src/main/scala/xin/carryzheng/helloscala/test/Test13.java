package xin.carryzheng.helloscala.test;

public class Test13 {
    public static void main(String[] args) throws Exception {

        // TODO 模板方法设计模式

        // 方法中算法的骨架是固定的，但是细节不是固定。
        // 这就需要由子类重写方法

        Parent p = new Child();
        p.test();
    }

}
class Parent {
    public void test() {
        // 开始
        start();
        // 执行
        execute();
        // 结束
        end();
    }
    protected void execute() {
        System.out.println("execute");
    }
    private void start() {
        System.out.println("start");
    }
    private void end() {
        System.out.println("end");
    }
}
class Child extends Parent{
    @Override
    protected void execute() {
        System.out.println("child execute");
    }
}
