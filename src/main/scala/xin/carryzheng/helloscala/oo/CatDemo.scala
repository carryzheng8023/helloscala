package xin.carryzheng.helloscala.oo

/**
  *
  * @author zhengxin
  *         2019-05-28 15:48:14
  */
object CatDemo {

  def main(args: Array[String]): Unit = {

    //创建一个对象
    val cat = new Cat
    //给属性赋值
    //1. cat.name = "小白" 其实不是直接访问属性，而是cat.name_$eq("小白")
    //2. cat.name等价于cat.name()
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"

    println(cat.name + "\t" + cat.age + "\t" + cat.color)

  }

}

//定义一个类Cat
//一个class Cat对应的字节码文件只有一个Cat.class ,默认是public
class Cat {
  //声明3个属性
  //1. 当我们声明了 var name :String 时, 在底层对应 private name
  //2. 同时会生成两个public方法 name() <=类似=> getter public name_$eq() => setter
  var name: String = ""
  var age: Int = _ //_表示个age一个默认值，如果是Int，默认是0。
  var color: String = _ //_表示个age一个默认值，如果是String，默认是""。
}


/*
public class Cat {
private String name = ""; private int age;
private String color;
public String name() {
return this.name; }
public void name_$eq(String x$1) { this.name = x$1; } public int age() { return this.age; }
public void age_$eq(int x$1) { this.age = x$1; }
public String color() { return this.color; }
public void color_$eq(String x$1) { this.color = x$1; }
}
*/