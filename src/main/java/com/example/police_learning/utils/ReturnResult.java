package com.example.police_learning.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class ReturnResult<T> implements Serializable {
    private Integer code; // 异常码
    private String message; // 提示信息
    private List<Object> data; // 返回数据
    @Override
    public String toString() {
        return '{' +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
