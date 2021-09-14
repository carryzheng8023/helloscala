package xin.carryzheng.helloscala.chapter06

object Scala01_Object {

    def main(args: Array[String]): Unit = {

        /*
          package com.atguigu.xxxxx;
          import java.util.*;
          class User {
             private Dept dept;
             private String name;
             public String getName() {
                 return name;
             }
          }
          class Dept {
              private List<User> userList;
              private String name;
              public String getName() {
                  return name;
              }
          }

          User user = new User()

         */

        val user = new User()
        user.test()
    }
    class User {
        def test(): Unit = {

        }
    }
}
