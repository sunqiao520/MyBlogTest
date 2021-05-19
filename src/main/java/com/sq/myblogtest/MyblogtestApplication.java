package com.sq.myblogtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sq.myblogtest.dao")
@SpringBootApplication
public class MyblogtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogtestApplication.class, args);
    }

}
