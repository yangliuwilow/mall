package com.linjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard  //启动豪猪
public class DashBoard_Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(DashBoard_Application.class, args);
	}
}
