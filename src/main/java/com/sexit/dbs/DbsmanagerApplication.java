package com.sexit.dbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.sexit.dbs.dao") // 配置mybatis-dao层扫描
@EnableTransactionManagement
public class DbsmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbsmanagerApplication.class, args);
    }

}
