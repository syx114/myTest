package com.yintai.elasticsearchtest.solr

import groovy.transform.CompileStatic
import org.apache.solr.client.solrj.impl.CommonsHttpSolrServer
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * Created by SunYongXing on 2016/10/17.
 */
@CompileStatic
@Component
class Solr {

    @Value('${spring.solrCloud}')
    String solrCloud

    CommonsHttpSolrServer getSolrServer(){
        return new CommonsHttpSolrServer(solrCloud)
    }

}
