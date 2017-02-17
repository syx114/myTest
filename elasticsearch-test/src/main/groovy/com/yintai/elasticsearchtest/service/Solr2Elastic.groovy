package com.yintai.elasticsearchtest.service

import com.google.gson.Gson
import com.yintai.elasticsearchtest.StaticInfo.RandomChinese
import com.yintai.elasticsearchtest.elastic.Elasticsearch
import com.yintai.elasticsearchtest.entity.SpuIndexEntity
import com.yintai.elasticsearchtest.solr.Solr
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients
import org.apache.solr.client.solrj.SolrQuery
import org.apache.solr.client.solrj.impl.CommonsHttpSolrServer
import org.apache.solr.client.solrj.response.QueryResponse
import org.apache.solr.common.SolrDocumentList
import org.elasticsearch.client.Client
import org.joda.time.DateTime
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.annotation.PostConstruct

/**
 * Created by syx11 on 2017/2/17.
 */
@Service
@CompileStatic
@Slf4j
class Solr2Elastic {
    @Autowired
    Solr solr
    @Autowired
    private Elasticsearch elasticsearch;
    private Client client

    @PostConstruct
    private void setClient() {
        this.client = elasticsearch.getClient()
    }

    public void solr2elastic() {
        CommonsHttpSolrServer server = solr.getSolrServer()
        Gson gson = new Gson()
        Random random = new Random()
        SolrQuery query = new SolrQuery();
        for (int i = 0; i < 1000; i++) {
            List<SpuIndexEntity> spuIndexEntities = new ArrayList<>()
            query.setQuery("*:*")
            query.setRows(50)
            query.setStart(i * 50)
            query.setFields("itemcode,itemcodes,name,image_itemcode,brand_id,brand_name,category_id,category_name")
            QueryResponse rsp = server.query(query);
            SolrDocumentList resultDocs = rsp.getResults();
            resultDocs.each { it ->
                try {
                    int ii = random.nextInt(14)
                    SpuIndexEntity spuIndexEntity = new SpuIndexEntity()
                    spuIndexEntity.spuId = it.getFieldValue("image_itemcode").toString()
                    spuIndexEntity.title = it.getFieldValue("name").toString()
                    spuIndexEntity.brandId = it.getFieldValue("brand_id").toString()
                    spuIndexEntity.brandName = it.getFieldValue("brand_name").toString()
                    spuIndexEntity.gender = random.nextInt(2)
                    spuIndexEntity.isPublish = ii < 12 ? true : false
                    spuIndexEntity.listTime = new DateTime().plusMonths(-ii).plusDays(-ii).plusHours(-(ii * ii))
                    spuIndexEntity.lastModifyTime = new DateTime()
                    spuIndexEntity.desciption = RandomChinese.randomChinese()
                    spuIndexEntity.hasStock = ii < 12 ? true : false
                    spuIndexEntity.newProduct = ii < 7 ? true : false
                    spuIndexEntity.listLevel = 14 - ii
                    spuIndexEntity.listSeason = (ii % 4).toString()
                    spuIndexEntity.categoryIds = it.getFieldValues("category_id").asCollection() as List<String>
                    List<String> ca = it.getFieldValues("category_name").asCollection() as List<String>
                    spuIndexEntity.categoryNames = ca
                    spuIndexEntity.lastCategory = ca.get(ca.size()-1)
                    Map<String,String> p = new HashMap<>()
                    ca.eachWithIndex{ String entry, int ij ->
                        p.put("分类"+ij,entry)
                    }
                    spuIndexEntity.properties = p
                    spuIndexEntity.skuIds = it.getFieldValues("itemcodes").asCollection() as List<String>
                    String jsonStr = gson.toJson(spuIndexEntity)

                    CloseableHttpClient httpClient = HttpClients.createDefault();
                    HttpPost httpPost = new HttpPost("http://10.138.1.20:9200/search/spu/"+spuIndexEntity.spuId)
                    httpPost.setHeader("Content-Type","application/json; charset=UTF-8")
                    httpPost.setEntity(new StringEntity(jsonStr,"UTF-8"))
                    httpClient.execute(httpPost)
                    log.debug(jsonStr)
//                    IndexResponse response = client.prepareIndex("search", "spu")
//                            .setSource(jsonStr)
//                            .get();
                }catch (Exception e){
                    log.error(e.message)
                }
//                spuIndexEntities.add(spuIndexEntity)
            }


        }

    }
}
