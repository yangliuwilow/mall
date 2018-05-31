package com.linjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 消息总线port:6001
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class BusAmqpApllication
{
    //post 方式请求 http://localhost:6001/bus/refresh  刷新配置信息
    /*1、提交代码触发post请求给bus/refresh
    2、server端接收到请求并发送给Spring Cloud Bus
    3、Spring Cloud bus接到消息并通知给其它客户端
    4、其它客户端接收到通知，请求Server端获取最新配置
    5、全部客户端均获取到最新的配置*/
    public static void main( String[] args )
    {
        SpringApplication.run(BusAmqpApllication.class, args);
    }
}
