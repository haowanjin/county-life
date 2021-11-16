package com.ddup.county.life.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hwj
 * @Description 登录 Controller
 * @create: 2021/11/16 11:00
 */

@RestController
@RequestMapping("login")
public class LoginController {

    @GetMapping("/")
    public String index(String name) {
        System.out.println(name);
        return name;
    }
}
