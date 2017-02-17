package com.yintai.elasticsearchtest

import com.yintai.elasticsearchtest.service.Solr2Elastic
import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan

@CompileStatic
@ComponentScan(["com.yintai.elasticsearchtest","org.nofdev"])
@SpringBootApplication
class ElasticsearchTestApplication {

    static void main(String[] args) {

        ApplicationContext app = SpringApplication.run ElasticsearchTestApplication, args
        Solr2Elastic solr2Elastic = app.getBean("solr2Elastic") as Solr2Elastic
        solr2Elastic.solr2elastic()
    }
}
