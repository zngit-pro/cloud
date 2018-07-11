package org.foryou.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author 1016823429@qq.com
 * date 2018/7/2
 **/
@RestController
public class ApiController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping("hello")
    public String hello(String name) {
        List<String> instance = discoveryClient.getServices();
        return instance.get(0) + ":" + name;
    }

}
