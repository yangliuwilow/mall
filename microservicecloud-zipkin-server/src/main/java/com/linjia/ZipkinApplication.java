package com.linjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
