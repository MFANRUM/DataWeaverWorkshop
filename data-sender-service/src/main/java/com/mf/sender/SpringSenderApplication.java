package com.mf.sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 数据推送服务
 * @Auther: MFAN
 * @Date: 2025/4/1 17:53:15
 * @Version: 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringSenderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSenderApplication.class, args);
    }
}
