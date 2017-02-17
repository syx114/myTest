package com.yintai.elasticsearchtest.entity

/**
 * Created by syx11 on 2017/2/15.
 */
class SkuInfo {
    /**
     * skuId
     */
    String skuId

    /**
     * 商品名称
     */
    String itemName

    /**
     * 销售属性，如颜色
     */
    Map<String,String> saleProperties
}
