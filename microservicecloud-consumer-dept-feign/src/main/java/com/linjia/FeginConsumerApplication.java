package com.linjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient    //注册中心客户端
@EnableFeignClients(basePackages= {"com.linjia.springcloud"})  //feign 开启 ,server 接口路径
@ComponentScan("com.linjia.springcloud")
public class FeginConsumerApplication
{
    public static void main( String[] args )
    {
      SpringApplication.run(FeginConsumerApplication.class, args);
    }

}