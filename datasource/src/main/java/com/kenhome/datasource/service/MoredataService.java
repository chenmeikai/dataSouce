package com.kenhome.datasource.service;

import com.kenhome.datasource.config.anotation.DS;
import com.kenhome.datasource.entity.City;
import com.kenhome.datasource.entity.User;
import com.kenhome.datasource.mapper.chat.UserMapper;
import com.kenhome.datasource.mapper.test.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service层
 * Created by pure on 2018-05-06.
 */
@Service
public class MoredataService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CityMapper cityMapper;

    //使用数据源1查询
    @DS("datasource1")
    public User getUser(Long id) {
        return userMapper.getOne(id);
    }

    //使用数据源1查询
    @DS("datasource2")
    public City getCity(Long id) {
        return cityMapper.getOne(id);
    }

}