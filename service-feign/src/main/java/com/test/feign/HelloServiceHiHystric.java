/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.feign;

import org.springframework.stereotype.Component;

/**
 *
 * @author star
 */
@Component
public class HelloServiceHiHystric  implements FeignWithHystrixService {
    
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}

