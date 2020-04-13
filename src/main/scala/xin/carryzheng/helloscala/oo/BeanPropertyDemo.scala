package xin.carryzheng.helloscala.oo

import scala.beans.BeanProperty

/**
  *
  * @author zhengxin
  *         2020-04-13 17:38:01
  */
object BeanPropertyDemo {

  def main(args: Array[String]): Unit = {

    val car = new Car
    car.name = "bmw"
    println(car.name)

    car.setName("byd")
    println(car.getName)

  }

}

class Car{
  @BeanProperty
  var name: String = null
}
