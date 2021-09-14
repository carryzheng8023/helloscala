package xin.carryzheng.helloscala.chapter02

import java.io.{File, InputStream, PrintWriter}
import java.net.{ServerSocket, Socket}

object Scala06_Server {

    def main(args: Array[String]): Unit = {

        // TODO 服务器
        val server = new ServerSocket(9999)
        println("服务器启动，等待链接。。。")
        // 接收数据
        val client: Socket = server.accept()
        println("客户端已经链接")

        // 获取客户端传递的数据
        val in: InputStream = client.getInputStream
        val i: Int = in.read()
        println("获取客户端传递的数据：" + i)
        in.close()

        client.close()
        server.close()
    }
}
