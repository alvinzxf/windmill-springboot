package com.example.spring.windmill.controller.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: windmill
 * @Description:修改参数
 * @Date: 2019/4/2 13:23
 */
@Data
@ApiModel("规则查询参数")
public class ModifyParam {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("编码")
    private Long code;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("条形码")
    private String barcode;

    @ApiModelProperty("价格")
    private BigDecimal price;

    @ApiModelProperty("库存数量")
    private Long stock;
}
