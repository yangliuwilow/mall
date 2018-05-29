package com.linjia.springcloud.web;

import com.linjia.springcloud.entity.Dept;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author
 * @date 2018/5/14
 */
@RestController
public class DeptController_Consumer {
    private static final Logger logger = LoggerFactory.getLogger(DeptController_Consumer.class);
     //public static final String REST_URL_PREFIX = "http://localhost:7001";
    private static final String REST_URL_PREFIX = "http://microservicecloud-dept";  //访问eureka注册中心
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用 RestTemplate 访问 restful 接口非常的简单粗暴无脑。
     * (url, requestMap, ResponseBean.class) 这三个参数分别代表
     * REST请求地址、请求参数、HTTP响应被转化成的对象类型
     *
     * @param dept
     * @return
     */
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        logger.info("restTemplate:"+1);
       return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}