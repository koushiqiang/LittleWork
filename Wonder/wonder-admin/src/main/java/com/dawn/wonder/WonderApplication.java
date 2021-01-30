package com.dawn.wonder;

import java.time.Duration;
import java.time.Instant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Date: 2021-1-30 , 0030 17:31
 * @Author: kousq
 * @Version：1.0
 */
@Slf4j
@SpringBootApplication
public class WonderApplication {

    public static void main(String[] args) {

        Instant inst1 = Instant.now();
        SpringApplication app = new SpringApplication(WonderApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        log.info("教学管理系统————基于 Spring Boot {} !", SpringBootVersion.getVersion());
        log.info("启动成功!  耗时:{}秒!", Duration.between(inst1, Instant.now()).getSeconds());
    }

}
