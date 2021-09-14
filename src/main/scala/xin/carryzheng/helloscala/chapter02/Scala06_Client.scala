package xin.carryzheng.helloscala.chapter02

import java.io.{File, OutputStream, PrintWriter}
import java.net.Socket

object Scala06_Client {

    def main(args: Array[String]): Unit = {

        // TODO 客户端
        val client = new Socket("localhost", 9999)
        println("服务器已经连接")

        // TODO 发送数据
        val out: OutputStream = client.getOutputStream
        out.write(300)
        out.flush()
        out.close()
        println("发送数据成功，关闭客户端")

        client.close()
    }
}
