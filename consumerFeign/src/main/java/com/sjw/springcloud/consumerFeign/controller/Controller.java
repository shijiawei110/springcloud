package com.sjw.springcloud.consumerFeign.controller;

import com.sjw.springcloud.consumerFeign.bindClient.ClientProxy;
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
    ClientProxy clientProxy;

    @GetMapping("/consumer")
    public String dc() {
        return clientProxy.consumer();
    }
}
