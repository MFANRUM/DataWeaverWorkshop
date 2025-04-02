package com.mf.scheduler;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description: 任务调度和节点监控
 * @Auther: MFAN
 * @Date: 2025/4/2 14:12:21
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "3m")
public class SpringSchedulerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulerApplication.class, args);
    }

}
