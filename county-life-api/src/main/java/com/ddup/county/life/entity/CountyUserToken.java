package com.ddup.county.life.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CountyUserToken {
    private String tokenId;

    private String deviceId;

    private String appType;

    private String userCode;

    private String userType;

    private String shopCode;

    private Date createTime;

    private Date updateTime;

    private String oldTokenId;

    private String userFlag;

    private Long lastCreateTimestamp;

}