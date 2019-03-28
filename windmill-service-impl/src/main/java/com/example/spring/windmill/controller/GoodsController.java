package com.example.spring.windmill.controller;

import com.example.spring.windmill.application.GoodsService;
import com.example.spring.windmill.dataobject.generator.GoodsDO;
import com.example.spring.windmill.mapper.generator.GoodsDOMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: windmill
 * @Description: 商品controller
 * @Date: 2019/3/28 17:12
 */
@RestController
public class GoodsController {

    /**
     * 商品service
     */
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/listGoods")
    public String listGoods() {
        Integer id = Integer.valueOf(11);
        GoodsDO goodsDO = goodsService.getById(id);
        System.out.println("print result***");
        System.out.println(goodsDO);
        return "goods";
    }
}
