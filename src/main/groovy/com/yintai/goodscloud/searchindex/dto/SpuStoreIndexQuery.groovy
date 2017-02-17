package com.yintai.goodscloud.searchindex.dto

import com.yintai.goodscloud.searchindex.entity.Sort

/**
 * Created by syx11 on 2017/2/15.
 */
class SpuStoreIndexQuery {

    /**
     * 门店号
     */
    String storeId

    /**
     * 关键词
     */
    String keyword

    /**
     * 品牌id
     */
    List<String> BrandIds

    /**
     * 分类id
     */
    List<String> CategoryIds

    /**
     * 属性id
     */
    List<String> Properties

    /**
     * 价格区间id
     */
    List<String> pirceRange

    /**
     * 最小价格
     */
    Integer minPrice

    /**
     * 最大价格
     */
    Integer maxPrice

    /**
     * 排序
     */
    Sort sort

    /**
     * 新品
     */
    Boolean newProduct

    /**
     * 是否有库存
     */
    Boolean hasStock

    /**
    * 页码
    */
    Integer pageIndex

    /**
     * 每页个数
     */
    Integer pageSize
}
