package com.linjia.springcloud.controller;

import com.linjia.springcloud.entity.Dept;
import com.linjia.springcloud.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @date 2018/5/14
 */
@RestController
public class DeptController {
    private static final Logger logger= LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        logger.info("springCloud-Ribbon负载均衡测试");
        return service.list();
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> services = client.getServices();
        String description = client.description();
        System.out.println("description = " + description);
        System.out.println("services = " + services);
        List<ServiceInstance> instances = client.getInstances("microservicecloud-dept");

        return client;
    }
}
