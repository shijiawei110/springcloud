package com.sjw.springcloud.consumerFeign.controller;

import com.sjw.springcloud.consumerFeign.bindClient.ClientProxy;
import com.sjw.springcloud.consumerFeign.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Shijiawei
 * Date: 2018-04-09
 * Description:
 */
@RestController
public class Controller {

    @Autowired
    private ServiceAll service;

    @GetMapping("/consumer")
    public String consumer() {
        return service.consumer();
    }
}
