package com.java.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   提供者1的项目启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.provider.*")
public class Provider2Start {

    //启动方法
    public static void main(String[] args) {
        SpringApplication.run(Provider2Start.class);
    }
}
