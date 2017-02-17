package com.yintai.goodscloud.searchindex.dto

/**
 * Created by syx11 on 2017/2/15.
 */
class BreadCrumb {
    /**
     * 聚合后属性筛选，Map<属性名,Map<属性值Id,属性值>>
     * <品牌，[11:阿迪，112:耐克，32:李宁]>
     */
    Map<String,List<Map<String,String>>> properties
}
