package com.example.spring.windmill.controller;

import com.example.spring.windmill.dataobject.generator.GoodsDO;
import com.example.spring.windmill.dataobject.generator.SeqDO;
import com.example.spring.windmill.mapper.generator.GoodsDOMapper;
import com.example.spring.windmill.mapper.generator.SeqDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: windmill
 * @Description: 查找类controller
 * @Date: 2019/3/26 20:57
 */
@RestController
public class SeqController {

    @Autowired
    private SeqDOMapper seqDOMapper;

    @RequestMapping("/listSeq")
    public String listInfo() {
        SeqDO seqDO = seqDOMapper.selectByPrimaryKey(Integer.valueOf(1));
        System.out.println("print result***");
        System.out.println(seqDO);
        return "hello";
    }

}
