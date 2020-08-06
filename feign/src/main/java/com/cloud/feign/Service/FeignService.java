package com.cloud.feign.Service;

import com.cloud.feign.feignrpc.GetFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author monkey_lwy@163.com
 * @date 2020-08-06 17:20
 * @desc
 */
@Service
public class FeignService {

    @Autowired
    GetFeign getFeign;

    public String getFeign() {
        return getFeign.getFeign();
    }
}
