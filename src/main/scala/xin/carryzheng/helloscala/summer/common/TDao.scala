package xin.carryzheng.helloscala.summer.common

import scala.io.{BufferedSource, Source}

trait TDao {
    def readDiskFile( path:String ) = {
        val source: BufferedSource = Source.fromFile(path)
        val list: List[String] = source.getLines().toList
        source.close()
        list
    }
}
