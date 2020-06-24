package xin.carryzheng.helloscala.pk.demo

import scala.beans.BeanProperty

/**
  *
  * @author zhengxin
  *         2020-06-24 22:46:03
  */

class Manager(var name : String){

  //使用相对路径引入
  @BeanProperty
  var age : Int = _

  //使用相对路径引入
  @scala.beans.BeanProperty
  var age2 : Int = _

  //使用绝对路径引入
  @_root_.scala.beans.BeanProperty
  var age3 : Int = _

}

object pkdemo01 {

}
