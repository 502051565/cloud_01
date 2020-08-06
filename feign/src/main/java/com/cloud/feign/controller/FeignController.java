package com.cloud.feign.controller;

import com.cloud.feign.Service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-06 17:21
 * @desc
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping(value = "/feign/index")
    public String getFeign() {
        return "feign consumer/ " + feignService.getFeign();
    }
}
