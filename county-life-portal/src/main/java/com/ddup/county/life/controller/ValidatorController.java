package com.ddup.county.life.controller;

import com.ddup.county.life.service.ValidatorServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: hwj
 * @Description
 * @create: 2022/2/23 19:33
 */
@RestController("validator")
public class ValidatorController {
    @Resource
    private ValidatorServiceImpl validatorService;

    @RequestMapping("sendValidator")
    public String sendValidator(String telephone) {

        return validatorService.sendValidator(telephone);
    }


}
