package com.memodd.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(scanBasePackages = "com.memodd")
@MapperScan(basePackages = "com.memodd.dao")
@EnableAutoConfiguration(exclude = { JacksonAutoConfiguration.class })
public class WebApplication {
    public  static  void main(String[] args){
        SpringApplication.run(WebApplication.class,args);
    }
}
