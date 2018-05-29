package com.linjia.springcloud.controller;

import com.linjia.springcloud.entity.Dept;
import com.linjia.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @date 2018/5/14
 */
@RestController
public class DeptController {
    private static final Logger logger= LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    //在ribbon使用断路器
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = this.service.get(id);
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix(@PathVariable("id") Long id)
    {
        return new Dept(id,"该ID：" + id + "没有没有对应的信息,null--@HystrixCommand","no this database in MySQL");
    }

}
