package com.sjw.springcloud.consumerFeign.bindClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by shijiawei on 2018/4/9.
 * feign绑定器
 */
@FeignClient("eureka_client")
public interface ClientProxy {
    @GetMapping("/dc")
    String consumer();
}
