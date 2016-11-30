package com.yintai.myTest

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@CompileStatic
@ComponentScan(["com.yintai.myTest","org.nofdev"])
@SpringBootApplication
class MyTestApplication {

    static void main(String[] args) {
        SpringApplication.run MyTestApplication, args
    }
}
