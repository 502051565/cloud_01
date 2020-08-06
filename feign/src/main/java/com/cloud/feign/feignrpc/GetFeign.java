package com.cloud.feign.feignrpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-06 17:19
 * @desc
 */
@FeignClient(value = "ribbon-consumer")
public interface GetFeign {

    @GetMapping(value = "index")
    public String getFeign();
}

