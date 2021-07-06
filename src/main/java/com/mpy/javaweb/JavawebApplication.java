package com.mpy.javaweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mpy.javaweb.mapper") // 让springboot知道mapper是这个项目的持久层
public class JavawebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavawebApplication.class, args);
    }

}
