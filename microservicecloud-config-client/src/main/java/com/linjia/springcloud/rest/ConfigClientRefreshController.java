package com.linjia.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientRefreshController
{
    @Value("${context}")
    private String context;

	@RequestMapping(value = "/config/refresh")
	public String refresh()
	{
		System.out.println("******context: " + context);
		return "context: " + context ;
	}
}
