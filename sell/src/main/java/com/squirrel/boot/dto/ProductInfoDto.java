package com.squirrel.boot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.squirrel.boot.model.ProductInfo;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@Data
public class ProductInfoDto {


    @JsonProperty("id")
    private String productId;
    //描述
    @JsonProperty("description")
    private String productDescription;
    //小图
    @JsonProperty("icon")
    private String productIcon;
    @JsonProperty("name")
    //商品名称
    private String productName;
    //单价
    @JsonProperty("price")
    private BigDecimal productPrice;


}
