package com.sjw.springcloud.consumerFeignBackUp.service;


import com.sjw.springcloud.consumerFeignBackUp.bindClient.ClientProxy;
import org.springframework.stereotype.Service;

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
        return "开放服务节点【2】  "+clientProxy.consumer();
    }

}
