package com.sjw.springcloud.consumerFeign.service;


import com.sjw.springcloud.consumerFeign.bindClient.ClientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Shijiawei
 * Date: 2018-04-09
 * Description:
 */

@Service
public class ServiceAll {

    @Resource
    private ClientProxy clientProxy;

    public String consumer() {
        return "开放服务节点【1】  "+clientProxy.consumer();
    }

}
