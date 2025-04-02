package com.mf.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Auther: MFAN
 * @Date: 2025/4/2 14:17:57
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMonitorApplication.class, args);
    }
}
