package com.cloud.ribboncustomer.controller;

import com.cloud.ribboncustomer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-06 16:58
 * @desc
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "/index")
    public String index() {
        return "ribbon consumer/ " + consumerService.getConsumer();
    }
}
