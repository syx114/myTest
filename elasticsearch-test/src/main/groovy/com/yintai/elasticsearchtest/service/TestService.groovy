package com.yintai.elasticsearchtest.service

import com.yintai.elasticsearchtest.StaticInfo.Brand
import com.yintai.elasticsearchtest.StaticInfo.RandomChinese
import com.yintai.elasticsearchtest.entity.SkuInfo
import com.yintai.elasticsearchtest.entity.SpuIndexEntity
import groovy.transform.CompileStatic
import org.joda.time.DateTime
import org.springframework.stereotype.Service

/**
 * Created by syx11 on 2017/2/17.
 */
@Service
@CompileStatic
class TestService {

    Random random = new Random()

    public void saveIndex(){
        SpuIndexEntity spuIndexEntity = new SpuIndexEntity()
        spuIndexEntity.spuId = UUID.randomUUID()
        int i = random.nextInt(14)
        spuIndexEntity.brandId = Brand.brandIds[i]
        spuIndexEntity.brandName = Brand.brandNames[i]
        spuIndexEntity.gender = random.nextInt(2)
        spuIndexEntity.isPublish = i<12?true:false
        spuIndexEntity.listTime = new DateTime().plusMonths(-i).plusDays(-i).plusHours(-(i*i))
        spuIndexEntity.lastModifyTime = new DateTime()
        spuIndexEntity.desciption = RandomChinese.randomChinese()
        spuIndexEntity.hasStock = i<12?true:false
        spuIndexEntity.newProduct = i<7?true:false
        spuIndexEntity.listLevel = 14-i
        spuIndexEntity.listSeason = (i%4).toString()
        SkuInfo skuInfo = new SkuInfo()
        skuInfo.itemName
        spuIndexEntity.skuInfos




    }
}
