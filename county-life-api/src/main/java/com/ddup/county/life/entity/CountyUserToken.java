package com.ddup.county.life.entity;

import java.util.Date;

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

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOldTokenId() {
        return oldTokenId;
    }

    public void setOldTokenId(String oldTokenId) {
        this.oldTokenId = oldTokenId == null ? null : oldTokenId.trim();
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag == null ? null : userFlag.trim();
    }

    public Long getLastCreateTimestamp() {
        return lastCreateTimestamp;
    }

    public void setLastCreateTimestamp(Long lastCreateTimestamp) {
        this.lastCreateTimestamp = lastCreateTimestamp;
    }
}