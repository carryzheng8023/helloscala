package xin.carryzheng.helloscala.chapter02

import com.atguigu.bigdata.scala.bean.Student

import java.io.{ObjectOutputStream, OutputStream}
import java.net.Socket

object Scala07_Client_Object {

    def main(args: Array[String]): Unit = {

        // TODO 客户端
        val client = new Socket("localhost", 9999)
        println("服务器已经连接")

        // TODO 发送数据
        val student = new Student()
        student.setName("zhangsan")

        val outObj = new ObjectOutputStream(client.getOutputStream)
        outObj.writeObject(student)
        outObj.flush()
        outObj.close()

        client.close()
    }
}
