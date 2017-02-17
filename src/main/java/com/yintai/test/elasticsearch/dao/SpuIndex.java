package com.yintai.test.elasticsearch.dao;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * Created by syx11 on 2017/2/15.
 */
@Document(indexName = "searchIndex",type = "spuIndex" , shards = 1, replicas = 1, indexStoreType = "memory", refreshInterval = "-1")
public class SpuIndex {
    @Id
    private String spuId;
    private String title;
    private String brandId;
    private String brandName;
    private String listSeason;
    private DateTime createTime;
    private DateTime lastModifyTime;
    @Field(type = FieldType.Nested)
    private List<SkuInfo> skuInfos;
    private List<String> categoryIds;
    private List<String> categoryNames;

    public SpuIndex() {
    }

    public SpuIndex(String spuId, String title, String brandId, String brandName, String listSeason, DateTime createTime, DateTime lastModifyTime, List<SkuInfo> skuInfos, List<String> categoryIds, List<String> categoryNames) {
        this.spuId = spuId;
        this.title = title;
        this.brandId = brandId;
        this.brandName = brandName;
        this.listSeason = listSeason;
        this.createTime = createTime;
        this.lastModifyTime = lastModifyTime;
        this.skuInfos = skuInfos;
        this.categoryIds = categoryIds;
        this.categoryNames = categoryNames;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getListSeason() {
        return listSeason;
    }

    public void setListSeason(String listSeason) {
        this.listSeason = listSeason;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    public DateTime getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(DateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public List<SkuInfo> getSkuInfos() {
        return skuInfos;
    }

    public void setSkuInfos(List<SkuInfo> skuInfos) {
        this.skuInfos = skuInfos;
    }

    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        this.categoryNames = categoryNames;
    }
}
