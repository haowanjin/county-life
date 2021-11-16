package com.ddup.county.life.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: hwj
 * @Description
 * @create: 2021/11/16 15:55
 */
@Data
public class CommonDTO<T> implements Serializable {
    private String code;
    private String msg;
    private T data;

    public CommonDTO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonDTO(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
