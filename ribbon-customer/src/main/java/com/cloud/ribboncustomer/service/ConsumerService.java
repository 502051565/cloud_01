package com.cloud.ribboncustomer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-06 16:59
 * @desc
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    public String getConsumer() {
        return restTemplate.getForObject("http://ribbon-provider/index", String.class);
    }
}
