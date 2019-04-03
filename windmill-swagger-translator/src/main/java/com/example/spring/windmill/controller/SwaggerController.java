package com.example.spring.windmill.controller;

import com.example.spring.windmill.application.GoodsService;
import com.example.spring.windmill.controller.param.ModifyParam;
import com.example.spring.windmill.controller.translator.GoodsTranslator;
import com.example.spring.windmill.dataobject.generator.GoodsDO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: windmill
 * @Description:Swagger Controller
 * @Date: 2019/3/31 9:33
 */
@Api(description = "Swagger接口")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {
    /**
     * 商品service
     */
    @Autowired
    private GoodsService goodsService;

    @ApiOperation(value = "查询商品", notes = "查询商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsId", value = "商品编码", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value = "/listGoods", method = RequestMethod.GET)
    public GoodsDO listGoods(@RequestParam("goodsId") String id) {
        Integer queryId = Integer.valueOf(id);
        GoodsDO goodsDO = goodsService.getById(queryId);
        System.out.println("print result***");
        System.out.println(goodsDO);
        return goodsDO;
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addGoods(@RequestBody GoodsDO goodsDO) {
        goodsService.addRecord(goodsDO);

    }

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody ModifyParam modifyParam) {
        GoodsDO goods = GoodsTranslator.transParamToDO(modifyParam);
        GoodsDO goodsDO = GoodsTranslator.translatorWithFastJson(modifyParam);
        System.out.println("update:::");
        goodsService.modifyRecord(goodsDO);
//        return new ResObject(HttpStatus.OK.value(), "修改成功.");
    }

    @ApiOperation(value = "删除", notes = "删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsId", value = "标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam("goodsId") String goodsId) {
        System.out.println("delete:::" + goodsId);
        GoodsDO goodsDO = new GoodsDO();
        goodsDO.setId(Integer.valueOf(goodsId));
        goodsService.deleteRecord(goodsDO);
    }
}


