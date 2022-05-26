package com.ddup.county.life.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CountyUser {
    private String code;

    private String name;

    private String telephone;

    private String payPwd;

    private String unionId;

    private String wxHeader;

    private String wxHeaderUrl;

    private String address;

    private Date createTime;

    private Date updateTime;

}