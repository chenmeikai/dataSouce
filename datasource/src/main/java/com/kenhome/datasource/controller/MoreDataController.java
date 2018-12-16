package com.kenhome.datasource.controller;

import com.alibaba.fastjson.JSONObject;
import com.kenhome.datasource.entity.City;
import com.kenhome.datasource.entity.User;
import com.kenhome.datasource.service.MoredataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author cmk
 * @Description
 * @Date 2018\12\16 0016 18:43
 */
@RestController
@RequestMapping("test")
public class MoreDataController {


    @Resource
    MoredataService moredataService;

    @GetMapping("dataData1")
    public String dataData1(){
        Long id=1L;
        User user = moredataService.getUser(id);
        String userJson = JSONObject.toJSONString(user);
        System.out.println("查询到的数据是:"+userJson);
        return  userJson;
    }

    @GetMapping("dataData2")
    public String dataData2(){
        Long id=1L;
        City city = moredataService.getCity(id);
        String cityJson = JSONObject.toJSONString(city);
        System.out.println("查询到的数据是:"+cityJson);
        return  cityJson;
    }


}
