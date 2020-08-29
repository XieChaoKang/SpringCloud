package com.xck.main.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonUtil <T> {
    private Integer code;
    private String message;
    private T data;

    public JsonUtil(Integer code,String message){
        this(code,message,null);
    }
}
