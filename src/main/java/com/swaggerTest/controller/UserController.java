package com.swaggerTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Kong
 * @createDate: 2019/7/1
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("getUser")
    public String getUser(String string){
        return  "李梦培";
    }
    @PostMapping("addUser")
    public String addUser(String string){
        return "李宁";
    }
}
