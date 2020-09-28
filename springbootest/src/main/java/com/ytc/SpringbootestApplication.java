package com.ytc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ytc.mapper")
public class SpringbootestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootestApplication.class, args);
    }

}
