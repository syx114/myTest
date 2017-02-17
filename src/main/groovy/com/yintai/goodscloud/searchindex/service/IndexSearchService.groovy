package com.yintai.goodscloud.searchindex.service

import com.yintai.goodscloud.searchindex.dto.PageSpuList
import com.yintai.goodscloud.searchindex.dto.SpuIndexQuery
import com.yintai.goodscloud.searchindex.dto.SpuStoreIndexQuery


/**
 * Created by syx11 on 2017/2/15.
 */
interface IndexSearchService {
    /**
     * 通过query从spuIndex中查询商品
     * @param spuIndexQuery
     * @return PageSpuList
     */
    PageSpuList searchSpuIndexByQuery(SpuIndexQuery spuIndexQuery)

    /**
     * 按门店来查找商品
     * @param spuStoreIndexQuery
     * @return PageSpuList
     */
    PageSpuList searchSpuStoreIndexByQuery(SpuStoreIndexQuery spuStoreIndexQuery)
}