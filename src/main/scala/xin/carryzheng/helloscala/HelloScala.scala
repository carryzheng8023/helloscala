package xin.carryzheng.helloscala


//1. object 在底层会生成两个类 HelloScala , HelloScala$
//2. Hello 中有个 main 函数，调用 Hello$ 类的一个静态对象 MODULES$
/*
public final class HelloScala {
	public static void main(String[] paramArrayOfString) {
		HelloScala$.MODULE$.main(paramArrayOfString);
	}
}
*/
//3. HelloScala$.MODULE$. 对象时静态的，通过该对象调用 HelloScala$的main函数
/*
public void main(String[] args){
	Predef..MODULE$.println("hello");
}
*/
//4. 可以理解我们在main中写的代码在放在HelloScala$的main, 在底层执行scala编译器做了一个包装
object HelloScala {

  def main(args: Array[String]): Unit = {
    println("hello")
    println()
  }

}
