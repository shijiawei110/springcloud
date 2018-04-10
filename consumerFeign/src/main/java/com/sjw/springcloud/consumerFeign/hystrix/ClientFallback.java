package com.sjw.springcloud.consumerFeign.hystrix;

import com.sjw.springcloud.consumerFeign.bindClient.ClientProxy;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Shijiawei
 * Date: 2018-04-09
 * Description:  断路由配置
 */
@Component
public class ClientFallback implements ClientProxy {
    @Override
    public String consumer() {
        return "dc1调用失败";
    }

    @Override
    public String consumertwo() {
        return "dc2调用失败";
    }
}
