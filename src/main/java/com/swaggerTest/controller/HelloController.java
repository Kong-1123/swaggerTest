package com.swaggerTest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Kong
 * @createDate: 2019/7/2
 * @description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @PutMapping("/updateHello")
    public String updateHello(String string){
        return "张三";
    }

    @DeleteMapping
    public String delHello(){
        return "李四";
    }
}
