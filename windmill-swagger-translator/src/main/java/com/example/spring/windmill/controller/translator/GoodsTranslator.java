package com.example.spring.windmill.controller.translator;

import com.alibaba.fastjson.JSON;
import com.example.spring.windmill.controller.param.ModifyParam;
import com.example.spring.windmill.dataobject.generator.GoodsDO;

/**
 * @Author: windmill
 * @Description:商品转换类
 * @Date: 2019/4/2 19:32
 */
public class GoodsTranslator {
    /**
     * 将修改参数转DO
     *
     * @param modifyParam
     * @return
     */
    public static GoodsDO transParamToDO(ModifyParam modifyParam) {
        GoodsDO goodsDO = new GoodsDO();

        goodsDO.setId(modifyParam.getId());
        goodsDO.setBarcode(modifyParam.getBarcode());
        goodsDO.setCode(modifyParam.getCode());
        goodsDO.setName(modifyParam.getName());
        goodsDO.setPrice(modifyParam.getPrice());
        goodsDO.setStock(modifyParam.getStock());
        return goodsDO;
    }

    /**
     * 通过 fastjson 将修改参数转换为DO
     *
     * @param modifyParam
     * @return
     */
    public static GoodsDO translatorWithFastJson(ModifyParam modifyParam) {
        return JSON.parseObject(JSON.toJSONString(modifyParam), GoodsDO.class);
    }

}
