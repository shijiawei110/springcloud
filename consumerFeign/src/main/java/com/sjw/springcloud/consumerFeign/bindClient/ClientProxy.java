package com.sjw.springcloud.consumerFeign.bindClient;

import com.sjw.springcloud.consumerFeign.hystrix.ClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by shijiawei on 2018/4/9.
 * feign绑定器
 */
@FeignClient(name="eureka-client", fallback = ClientFallback.class)
public interface ClientProxy {
    @GetMapping("/dc")
    String consumer();

    @GetMapping("/dctwo")
    String consumertwo();
}
