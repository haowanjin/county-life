package com.ddup.county.life.entity;

import java.util.Date;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getWxHeader() {
        return wxHeader;
    }

    public void setWxHeader(String wxHeader) {
        this.wxHeader = wxHeader == null ? null : wxHeader.trim();
    }

    public String getWxHeaderUrl() {
        return wxHeaderUrl;
    }

    public void setWxHeaderUrl(String wxHeaderUrl) {
        this.wxHeaderUrl = wxHeaderUrl == null ? null : wxHeaderUrl.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
}