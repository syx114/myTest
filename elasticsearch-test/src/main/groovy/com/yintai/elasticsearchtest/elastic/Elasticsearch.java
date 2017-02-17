package com.yintai.elasticsearchtest.elastic;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 * Created by SunYongXing on 2016/2/23.
 */
@Component
public class Elasticsearch {
    private Client client;


    public static void main(String[] args) throws UnknownHostException {
        TransportClient client = TransportClient.builder().build()
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host1"), 9300));
        GetResponse response = client.prepareGet("user", "userRecord", "AVhsNt-bfCXf5QBbx_cz").get();
    }

    public Client getClient() throws UnknownHostException {

        if(client == null) {
//            TransportClient client = new TransportClient()
//                    .addTransportAddress(new InetSocketTransportAddress("10.133.0.217", 9300))
//                    .addTransportAddress(new InetSocketTransportAddress("10.133.0.226", 9300))
//                    .addTransportAddress(new InetSocketTransportAddress("10.133.0.187", 9300));
            TransportClient client = TransportClient.builder().build()
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));

            return client;
        } else {
            return client;
        }
    }


}
