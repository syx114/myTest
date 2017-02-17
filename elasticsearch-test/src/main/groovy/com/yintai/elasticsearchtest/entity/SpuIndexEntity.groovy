package com.yintai.elasticsearchtest.entity

import org.joda.time.DateTime

/**
 * Created by syx11 on 2017/2/14.
 */
class SpuIndexEntity {
    /**
     * spuId
     */
    String spuId

    /**
     * 商品名称
     */
    String title


    List<String> skuIds
    /**
     * sku商品信息
     */
    List<SkuInfo> skuInfos

    /**
     * 商品上架时间
     */
    DateTime listTime

    /**
     * 商品信息最后修改时间
     */
    DateTime lastModifyTime

    /**
     * 品牌ID
     */
    String brandId

    /**
     * 品牌名称
     */
    String brandName

    /**
     * 分类ID
     */
    List<String> categoryIds
    String lastCategory
    Map<String,String> properties
    /**
     * 分类名称
     */
    List<String> categoryNames

    /**
     * 是否新品
     */
    Boolean newProduct

    /**
     * 男女款
     */
    Integer gender

    /**
     * 季节款
     */
    String listSeason

    /**
     * 标签
     */
    List<String> tags

    /**
     * 商品描述
     */
    String desciption

    /**
     * 各个渠道价格
     */
    Map<String,Double> salePrice

    /**
     * 价格区间
     */
    String priceRange

    /**
     * 是否有库存
     */
    Boolean hasStock

    /**
     * 是否上下架
     */
    Boolean isPublish

    /**
     * 展示级别，同一品牌或关键字，级别越高优先展示
     */
    Integer listLevel
}
