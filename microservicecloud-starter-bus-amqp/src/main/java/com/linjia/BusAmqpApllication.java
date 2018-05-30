package com.linjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class BusAmqpApllication
{
    public static void main( String[] args )
    {
        SpringApplication.run(BusAmqpApllication.class, args);
    }
}
