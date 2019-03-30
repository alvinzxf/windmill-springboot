package com.example.spring.windmill.application.schedule;

import com.example.spring.windmill.application.GoodsService;
import com.example.spring.windmill.dataobject.generator.GoodsDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: windmill
 * @Description:定时查询任务controller
 * @Date: 2019/3/29 14:28
 */
@Component
public class QueryScheduleTask {
    private int count = 1;

    /**
     * 商品service
     */
    @Autowired
    private GoodsService goodsService;

    @Scheduled(cron = "* */1 * * * ?")
    private void process() {
        System.out.println("定时查询商品是否存在: 查询次数" + (count++));
        GoodsDO goodsDO = goodsService.getById(Integer.valueOf(11));
        System.out.println("查询结果:" + goodsDO.getName());
    }
}