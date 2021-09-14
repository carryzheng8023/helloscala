package xin.carryzheng.helloscala.chapter07

object Scala10_Req {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 不同省份的商品点击排行

        // word    -> count
        // 省份-商品 -> 点击
        val list = List(
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "电脑"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "电脑"),
            ("zhangsan", "河南", "电脑"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子")
        )

        // TODO 1. 将原始数据转换结构
        //  (用户，省份，商品) => (省份-商品，1)
        val mapDatas = list.map(
            t => {
                ( t._2 + "-" + t._3, 1 )
            }
        )

        // TODO 2. 将转换结构后的数据分组聚合
        val groupDatas: Map[String, List[(String, Int)]] = mapDatas.groupBy(_._1)
        val prvItemToCount: Map[String, Int] = groupDatas.mapValues(_.size)
        //println(prvItemToCount)

        // TODO 3. 将聚合后的结果进行结构的转换
        //  (省份-商品，sum) => (省份，（商品，sum）)
        val transformDatas = prvItemToCount.toList.map(
            t => {
                val k = t._1
                val sum = t._2
                val ks = k.split("-")
                ( ks(0), (ks(1), sum) )
            }
        )
        //println(transformDatas)

        // TODO 4. 将转换结构后的数据根据省份进行分组
        //  (省份，（商品，sum）)
        // (省份， List( (省份，（商品，sum）), (省份，（商品，sum）), (省份，（商品，sum）)  ))
        // (省份， List( (（商品，sum1）), (（商品，sum2）), (（商品，sum3）)  ))
        // (省份， List( (（商品，sum3）), (（商品，sum2）), (（商品，sum1）)  ))
        val prvGroupDatas: Map[String, List[(String, (String, Int))]] =
            transformDatas.groupBy(_._1)

        val result = prvGroupDatas.mapValues(
            list => {
                val itemCntList: List[(String, Int)] = list.map(_._2)
                itemCntList.sortBy(_._2)(Ordering.Int.reverse)
            }
        )

        println(result)
    }


}
