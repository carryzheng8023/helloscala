package xin.carryzheng.helloscala.chapter02

import java.io.{InputStream, ObjectInputStream}
import java.net.{ServerSocket, Socket}

object Scala07_Server_Object {

    def main(args: Array[String]): Unit = {

        // TODO 服务器
        val server = new ServerSocket(9999)
        println("服务器启动，等待链接。。。")
        // 接收数据
        val client: Socket = server.accept()
        println("客户端已经链接")

        // 获取客户端传递的数据
        val objIn = new ObjectInputStream(client.getInputStream)
        val obj: AnyRef = objIn.readObject()
        println(obj)
        objIn.close()

        client.close()
        server.close()
    }
}
