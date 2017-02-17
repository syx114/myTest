package com.yintai.test.elasticsearch.dao;

import java.util.Map;

/**
 * Created by syx11 on 2017/2/15.
 */
public class SkuInfo {
    private String skuId;
    private String itemName;
    private Map<String,String> saleProperties;

    public SkuInfo() {
    }

    public SkuInfo(String skuId, String itemName, Map<String, String> saleProperties) {

        this.skuId = skuId;
        this.itemName = itemName;
        this.saleProperties = saleProperties;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Map<String, String> getSaleProperties() {
        return saleProperties;
    }

    public void setSaleProperties(Map<String, String> saleProperties) {
        this.saleProperties = saleProperties;
    }
}
