package org.foryou.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * author 1016823429@qq.com
 * date 2018/7/2
 **/
@RestController
public class AdminController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("user")
    public String user() {
        return restTemplate.getForObject("http://api/hello?name=12324", String.class);
    }

}
