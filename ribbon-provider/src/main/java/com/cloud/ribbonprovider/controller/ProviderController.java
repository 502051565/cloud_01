package com.cloud.ribbonprovider.controller;

import com.cloud.ribbonprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-06 16:53
 * @desc
 */
@RestController
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @GetMapping(value = "/index")
    public String index() {
        return providerService.getProvider();
    }
}
