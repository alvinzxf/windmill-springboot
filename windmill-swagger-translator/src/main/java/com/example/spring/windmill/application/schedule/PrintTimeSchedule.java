package com.example.spring.windmill.application.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: windmill
 * @Description:打印时间定时器
 * @Date: 2019/3/29 14:34
 */
@Component
public class PrintTimeSchedule {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 6000)
    public void printTime(){
        System.out.println("current time is:"+dateFormat.format(new Date()));
    }

}
