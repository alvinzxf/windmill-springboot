package com.example.spring.windmill.mapper.generator;

import com.example.spring.windmill.dataobject.generator.GoodsDO;

public interface GoodsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    int insert(GoodsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    int insertSelective(GoodsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    GoodsDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    int updateByPrimaryKey(GoodsDO record);
}