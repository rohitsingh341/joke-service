package com.psr.sbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"config", "com.psr.sbootdemo"})
public class SbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbootDemoApplication.class, args);
    }

}
