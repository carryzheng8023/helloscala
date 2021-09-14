package xin.carryzheng.helloscala.chapter09

import java.io.FileNotFoundException

class Scala03_Exception {

    @throws[FileNotFoundException]
    def test(): Unit = {
        throw new FileNotFoundException("xxxx")
    }
}
