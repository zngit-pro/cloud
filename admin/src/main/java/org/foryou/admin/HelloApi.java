package org.foryou.admin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * author 1016823429@qq.com
 * date 2018/7/2
 **/
@FeignClient(name = "api")
public interface HelloApi {
    @RequestMapping("/hello")
    public Map<String, String> hello(@RequestParam(value = "name") String name);
}
