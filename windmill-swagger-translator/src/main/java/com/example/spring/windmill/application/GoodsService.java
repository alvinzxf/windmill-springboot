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

    /**
     * 增加商品
     * @param goodsDO
     */
    void addRecord(GoodsDO goodsDO);

    /**
     * 修改
     * @param goodsDO
     */
    void modifyRecord(GoodsDO goodsDO);

    /**
     * 删除
     * @param goodsDO
     */
    void deleteRecord(GoodsDO goodsDO);


}
