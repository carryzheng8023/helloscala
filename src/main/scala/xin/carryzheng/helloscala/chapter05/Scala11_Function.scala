package xin.carryzheng.helloscala.chapter05

import scala.annotation.tailrec

object Scala11_Function {

    def main(args: Array[String]): Unit = {
        // TODO - 递归
        // 1. 方法实现时调用自身
        // 2. 存在跳出递归的逻辑
        // 3. 传递的参数之间应该存在规律
        // 4. 递归函数必须声明返回值类型

        println(test(10000000))
    }
    def test( num : Long ) : Long = {
        if ( num <= 1 ) {
            1
        } else {
            //num * test(num-1)
            num + test(num-1)
        }
    }

    @tailrec
    def test(num: Int, result: Int): Int = {
        if (num == 1) {
            result
        } else {
            test(num - 1, num + result)
        }
    }
}
