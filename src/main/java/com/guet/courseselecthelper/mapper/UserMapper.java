package com.guet.courseselecthelper.mapper;

import com.guet.courseselecthelper.demos.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    String findByAccount(String account);
}
