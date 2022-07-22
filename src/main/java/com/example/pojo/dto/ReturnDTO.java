package com.example.pojo.dto;

import java.util.Map;

public class ReturnDTO {

    private static Integer successCode = 200;
    private static String successMsg = "查询成功";
    private static Integer code;
    private static String msg;
    private static Map<String, Object> maps;

    public ReturnDTO() {
    }

    public ReturnDTO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ReturnDTO success(){
        return new ReturnDTO(successCode,successMsg);
    }

    public ReturnDTO addList(String key, Object o){
        maps.put(key,o);
        return this;
    }
}
