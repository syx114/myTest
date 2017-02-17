package com.yintai.test.elasticsearch.repositories;

import com.yintai.test.elasticsearch.dao.SpuIndex;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by syx11 on 2017/2/15.
 */
public interface SpuIndexRepository extends ElasticsearchRepository<SpuIndex,String> {

}
