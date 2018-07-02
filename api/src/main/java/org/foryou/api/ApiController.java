package org.foryou.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * author 1016823429@qq.com
 * date 2018/7/2
 **/
@RestController
public class ApiController {
    @RequestMapping("hello")
    public Map<String, String> hello(String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

}
