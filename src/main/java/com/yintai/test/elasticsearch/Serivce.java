package com.yintai.test.elasticsearch;

import com.yintai.test.elasticsearch.repositories.SpuIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by syx11 on 2017/2/15.
 */
@Service
public class Serivce {

    @Autowired
    private SpuIndexRepository spuIndexRepository;
    public void save(){
        System.out.println("haha");
    }
}
