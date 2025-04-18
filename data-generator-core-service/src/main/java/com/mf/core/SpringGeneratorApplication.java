package com.mf.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 数据生成服务启动类
 * @Auther: MFAN
 * @Date: 2025/4/1 17:01:31
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringGeneratorApplication.class, args);
    }
}
