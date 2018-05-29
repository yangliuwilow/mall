package com.linjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication03 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication03.class, args);
    }
}
