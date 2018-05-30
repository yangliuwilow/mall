package com.linjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.linjia.springcloud")
@EnableEurekaClient//启动服务注册
@EnableDiscoveryClient
public class ConfigProviderApplication
{

   //  Terminal or cmd  运行
   // E:\mall\microservicecloud-provider-dept\target>java -jar microservicecloud-provider-dept.jar  --server.port=8082
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigProviderApplication.class, args);
    }
}
