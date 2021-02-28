package com.wangzhenghe.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtil {
    public static String getJson(Object object){
        return getJson(object,"yyyy-mm-dd HH:mm:ss");
    }

    private static String getJson(Object object, String dataformat) {
        //1.创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //2.不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //3.自定义日期格式对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataformat);
        //4.指定日期格式
        mapper.setDateFormat(simpleDateFormat);

        try{
            return mapper.writeValueAsString(object);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }
}
