package com.ywh.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ywh
 */
@SpringBootApplication(scanBasePackages = "com.ywh.auth",exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.ywh.auth.common.dao")
public class AuthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }
}
