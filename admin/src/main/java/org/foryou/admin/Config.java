package org.foryou.admin;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * author 1016823429@qq.com
 * date 2018/7/1
 **/
@Component
@ConfigurationProperties("org.demo")
public class Config {
    private String name;
    private String env;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Config{");
        sb.append("proname='").append(name).append('\'');
        sb.append(", env='").append(env).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @PostConstruct
    public void init() {
        System.out.println(this.toString());
    }
}
