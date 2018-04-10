package com.sjw.springcloud.clientOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Shijiawei
 * Date: 2018-03-26
 * Description:
 */
@RestController
public class Controller {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "服务【dc】 节点【1】 被消费";
        System.out.println("服务【dc】节点【1】被消费 : "+services);
        return services;
    }

    @GetMapping("/dctwo")
    public String dc2() {
        String services = "服务【dctwo】 节点【1】 被消费";
        System.out.println("服务【dctwo】节点【1】被消费 : "+services);
        return services;
    }
}
