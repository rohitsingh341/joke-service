package com.psr.sbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = {"config", "com.psr.sbootdemo"})
@ImportResource("classpath:chuck-config.xml")
public class SbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbootDemoApplication.class, args);
    }

}
