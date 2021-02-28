package com.wangzhenghe.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wangzhenghe.pojo.User;
import com.wangzhenghe.util.JsonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class JsonTestController03 {

    //输出结果为：[{"name":"甲","age":12,"sex":"男"},{"name":"乙","age":23,"sex":"女"},{"name":"丙","age":34,"sex":"女"},{"name":"丁","age":56,"sex":"男"}]
    @RequestMapping("/jsonC")
    public String CollectionTest() throws JsonProcessingException {
        //1.创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //2.创建对象
        User user1 = new User("甲",12,"男");
        User user2 = new User("乙",23,"女");
        User user3 = new User("丙",34,"女");
        User user4 = new User("丁",56,"男");
        //创建集合，将对象加入集合中
        ArrayList<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        //将对象解析成json格式
        String string = mapper.writeValueAsString(list);

        return  string;
    }


    //输出结果为：1614482394290
    //默认日期格式会变成一个数字，是1970年1月1日到当前日期的毫秒数！
    //Jackson 默认是会把时间转成timestamps形式
    @RequestMapping("/jsonD01")
    public String DateTest01() throws JsonProcessingException {
        //1.创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //2.创建对象
        Date date = new Date();
        //将对象解析成json格式
        String string = mapper.writeValueAsString(date);

        return  string;
    }


    //输出结果为："2021-05-28 12:05:56"
    //Jackson 默认是会把时间转成timestamps形式
    @RequestMapping("/jsonD02")
    public String DateTest02() throws JsonProcessingException {
        //1.创建一个Jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        //2.不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //3.自定义日期格式对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        //4.指定日期格式
        mapper.setDateFormat(simpleDateFormat);
        //5.创建日期对象
        Date date = new Date();
        //6.将对象解析成json格式
        String string = mapper.writeValueAsString(date);

        return  string;
    }

    //使用工具类JsonUtil
    //输出结果为："2021-05-28 12:05:56"
    @RequestMapping("/jsonD03")
    public String DateTest03() throws JsonProcessingException {
        //1.创建日期对象
        Date date = new Date();
        //2.将对象解析成json格式
        String json = JsonUtil.getJson(date);
        return json;
    }

}
