/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author star
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    
    @Autowired
    FeignWithHystrixService feignWithHystrixService;
    
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/hellofeign",method = RequestMethod.GET)
    public String sayHiFeign(@RequestParam String name){
        return feignWithHystrixService.sayHiFromClientOne(name);
    }

}
