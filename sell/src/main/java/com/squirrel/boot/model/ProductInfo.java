package com.squirrel.boot.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@Table(name = "product_info")
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;
    //类目编号
    private Integer categoryType;
    //商品状态,0正常1下架
    private Integer productStatus;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;
    //小图
    private String productIcon;
    //商品名称
    private String productName;
    //单价
    private BigDecimal productPrice;
//    //创建时间
//    private Date createTime ;
//    //修改时间
//    private Date updateTime ;
}