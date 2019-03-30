package com.example.spring.windmill.application;

import com.example.spring.windmill.dataobject.generator.GoodsDO;

/**
 * @Author: windmill
 * @Description:商品service
 * @Date: 2019/3/28 9:17
 */
public interface GoodsService {
    /**
     * 通过id查询商品DO
     *
     * @param id
     * @return
     */
    GoodsDO getById(Integer id);

}
