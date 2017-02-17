package com.yintai.goodscloud.searchindex.dto

/**
 * Created by syx11 on 2017/2/15.
 */
class PageSpuList {

    /**
     * 商品总数
     */
    Integer totalCount

    /**
     * 面包屑(Aggregations)
     */
    BreadCrumb breadCrumb

    /**
     * 商品spu集合
     */
    List<String> spus
}
