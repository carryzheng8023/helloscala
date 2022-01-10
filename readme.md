下划线的作用：

1. 导入包中所有的类的时候，可以使用下划线来代替星号

   import java.util._

2. 可以将函数作为整体对象使用

   val f = test _

3. 匿名函数中，可以使用下划线代替参数

    test(_+_)

4. import时，可以屏蔽类

   import java.util.{ Date=>_ }

5. 给属性赋值时，使用系统默认初始化

    var name : String = _

6. 模式匹配中，匹配其他任意值

    case _ => {}

7. 应用在泛型中，表示任意类型

    List[_]




