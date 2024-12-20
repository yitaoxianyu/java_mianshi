package com.xianyu.mapper;

import com.xianyu.Student;
import com.xianyu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {

    @Select("select * from User where sid = 1")
    User getUser();
}
