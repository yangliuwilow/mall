package com.linjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.linjia.springcloud")
@EnableEurekaClient//启动服务注册
@EnableDiscoveryClient
@EnableHystrix
public class HystrixProviderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixProviderApplication.class, args);
    }
}
