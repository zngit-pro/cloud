package org.foryou.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * author 1016823429@qq.com
 * date 2018/7/2
 **/
@RestController
public class AdminController {

    @Autowired
    private HelloApi helloApi;

    @RequestMapping("user")
    public Map<String, String> user() {
        return helloApi.hello("api");
    }

}
