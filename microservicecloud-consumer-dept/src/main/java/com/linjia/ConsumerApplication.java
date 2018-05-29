package com.linjia;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient    //注册中心客户端
@Configuration
public class ConsumerApplication
{
    public static void main( String[] args )
    {
      SpringApplication.run(ConsumerApplication.class, args);
    }
    @Bean
    @LoadBalanced  //初始化生成bean实例，LoadBalanced 实现负载均衡 先添加Ribbon相关 jar
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //retrun new RetryRule()； 重试策略 ,一个服务挂了,调用失败N次后不再调用失败的服务，重试其它可用的服务（服务都为健康状态下是为轮询算法）
        return new RoundRobinRule();//轮询算法，默认
        //  return new RandomRule(); //随机算法
    }
}