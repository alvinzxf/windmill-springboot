package com.example.spring.windmill.controller;

import com.example.spring.windmill.application.GoodsService;
import com.example.spring.windmill.dataobject.generator.GoodsDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String listGoods(@RequestParam String id) {
        Integer queryId = Integer.valueOf(id);
        GoodsDO goodsDO = goodsService.getById(queryId);
        System.out.println("print result***");
        System.out.println(goodsDO);
        return "goods";
    }
}
