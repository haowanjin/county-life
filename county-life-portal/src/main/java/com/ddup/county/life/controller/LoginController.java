package com.ddup.county.life.controller;

import com.ddup.county.life.dto.CommonDTO;
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

    @GetMapping("/doLogin")
    public CommonDTO doLogin(String telephone, String validator, String loginType) {
        // 验证验证码是否合法

        // 合法后将用户缓存起来，生成token

        // 查询用户是否存在，不存在则新增用户
        return CommonDTO.success("登录成功");
    }

    @GetMapping("doLogout")
    public CommonDTO doLogout() {
        return null;
    }
}
