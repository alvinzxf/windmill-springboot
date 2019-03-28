package com.example.spring.windmill.mapper;

import com.example.spring.windmill.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: windmill
 * @Description:
 * @Date: 2019/3/21 17:33
 */
@Mapper
public interface PersonMapper {
    /**
     * 查找所有个人信息
     *
     * @return
     */
    @Select("SELECT * FROM student")
    List<Person> findAll();
}