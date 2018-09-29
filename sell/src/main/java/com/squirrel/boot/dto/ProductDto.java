package com.squirrel.boot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */

@Data
public class ProductDto {


    @JsonProperty("name")
    private String categoryName; //varchar(64) NOT NULL COMMENT '类目名字',

    @JsonProperty("type")
    private Integer categoryType; //int(11) NOT NULL COMMENT '类目编号',

    private List<ProductInfoDto> foods;
}
