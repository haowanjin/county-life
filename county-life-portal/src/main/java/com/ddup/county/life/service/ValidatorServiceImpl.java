package com.ddup.county.life.service;

import org.springframework.stereotype.Service;

/**
 * @author: hwj
 * @Description 验证码服务类
 * @create: 2022/2/23 19:37
 */
@Service
public class ValidatorServiceImpl {

    public String sendValidator(String telephone) {
        String validator = "";
        // 调用短信平台发送验证码

        // 将验证码保存起来
        return validator;
    }


    public boolean validValidator(String telephone,String validator) {
        // 验证验证码是否正确

        // 更改验证码状态
        return true;
    }
}
