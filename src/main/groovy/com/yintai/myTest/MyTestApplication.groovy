package com.yintai.myTest

import com.yintai.myTest.lucene.LuceneTest
import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan

@CompileStatic
@ComponentScan(["com.yintai.myTest","org.nofdev"])
@SpringBootApplication
class MyTestApplication {

    static void main(String[] args) {
        ApplicationContext app = SpringApplication.run MyTestApplication, args
        LuceneTest luceneTest = app.getBean("luceneTest") as LuceneTest
        luceneTest.testin()
        luceneTest.testout()
    }
}
