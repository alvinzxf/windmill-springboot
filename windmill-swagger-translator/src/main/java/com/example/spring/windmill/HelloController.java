package com.example.spring.windmill;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: windmill
 * @Description:
 * @Date: 2019/3/21 17:24
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello...spring boot***";
    }
}
