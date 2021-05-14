package com.jbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启feign可用
public class SpringcloudClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientFeignApplication.class, args);
    }

}
