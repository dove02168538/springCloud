package com.cn.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }

    @Value("${username}")
    String username;
    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return username+foo;
    }


}
