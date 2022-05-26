package com.ddup.county.life.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: hwj
 * @Description
 * @create: 2021/11/16 15:55
 */
@Data
public class CommonDTO<T> {
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

    public static CommonDTO<String> success() {
        return new CommonDTO<>("200", "操作成功");
    }

    public static <T> CommonDTO<T> success(T resultBody) {
        return new CommonDTO<>("200", "操作成功", resultBody);
    }

    public static <T> CommonDTO<T> fail(String msg, T resultBody) {
        return new CommonDTO<>("9999", msg, resultBody);
    }

}
