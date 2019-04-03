package com.example.spring.windmill.application.impl;

import com.example.spring.windmill.application.GoodsService;
import com.example.spring.windmill.dataobject.generator.GoodsDO;
import com.example.spring.windmill.mapper.generator.GoodsDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: windmill
 * @Description:商品Service实现类
 * @Date: 2019/3/28 9:18
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    /**
     * 商品mapper
     */
    @Autowired
    private GoodsDOMapper goodsDOMapper;

    /**
     * 通过id查询商品DO
     *
     * @param id
     * @return
     */
    @Override
    public GoodsDO getById(Integer id) {

        return goodsDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addRecord(GoodsDO goodsDO) {
        goodsDOMapper.insertSelective(goodsDO);
    }

    @Override
    public void modifyRecord(GoodsDO goodsDO) {
        goodsDOMapper.updateByPrimaryKeySelective(goodsDO);
    }

    @Override
    public void deleteRecord(GoodsDO goodsDO) {
        goodsDOMapper.deleteByPrimaryKey(goodsDO.getId());
    }
}
