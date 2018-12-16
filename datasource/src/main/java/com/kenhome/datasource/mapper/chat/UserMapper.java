package com.kenhome.datasource.mapper.chat;

import com.kenhome.datasource.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author cmk
 * @Description
 * @Date 2018\12\15 0015 11:56
 */
@Mapper
public interface UserMapper {

    public User getOne(@Param(value="id") Long id);
}
