package com.ywh.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ywh
 */
@SpringBootApplication(scanBasePackages = "com.ywh.admin",exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.ywh.admin.common.dao")
public class AdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
