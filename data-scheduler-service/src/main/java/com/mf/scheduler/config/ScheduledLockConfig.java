package com.mf.scheduler.config;

import jakarta.annotation.Resource;
import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.TimeZone;

/**
 * @Description: 配置类
 * @Auther: MFAN
 * @Date: 2025/4/2 16:38:16
 * @Version: 1.0
 */
@Configuration
public class ScheduledLockConfig {
    @Resource
    private DataSource dataSource;

    @Bean
    public LockProvider lockProvider() {
        return new JdbcTemplateLockProvider(
                JdbcTemplateLockProvider.Configuration.builder()
                        .withJdbcTemplate(new JdbcTemplate(dataSource))
                        .withTimeZone(TimeZone.getTimeZone("UTC"))
                        .build());
    }
}
