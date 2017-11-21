package com.taotaoshop.top.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author zfl
 * @version V1.0
 * @Date 2017/11/21 15:06
 * @Package com.taotaoshop.top.service
 * @Email zhao.fulu@chinaott.onaliyun.com
 * 
 */

@SpringBootApplication(scanBasePackages = {"com.taotaoshop.top.*"})
@MapperScan({"com.taotaoshop.top.core.dao.mapper"})
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
