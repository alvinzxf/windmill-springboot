package com.example.spring.windmill.controller.translator;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: windmill
 * @Description:通过fastjson对目标对象或对象列表进行转换
 * @Date: 2019/4/2 19:42
 */
public class CommonTranslator {
    /**
     * Fastjson单个对象转换
     *
     * @param source 要转换的对象
     * @param target 转换后的目标对象
     * @param <T> 对象模板类型
     * @return 返回JSON转换的匹配对象
     */
    public static <T> T translator(Object source, Class<T> target) {
        return JSON.parseObject(JSON.toJSONString(source), target);
    }

    /**
     * 通过fastjson进行列表转换
     *
     * @param objectList 转换对象的列表集合
     * @param target     转换后的目标对象集合
     * @param <T>
     * @return 返回转换后对象的匹配集合
     */
    public static <T> List<T> listTranslator(List objectList, Class<T> target) {
        List<T> tList = new ArrayList();
        objectList.forEach((object) -> {
            T t = JSON.parseObject(JSON.toJSONString(object), target);
            tList.add(t);
        });
        return tList;
    }
}
