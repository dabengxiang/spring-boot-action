package com.squirrel.boot.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Date:2018/10/1
 * Author:gyc
 * Desc:
 */

@Table(name = "order_detail")
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId ;
    //数量
    private Integer productQuantity ;
    private String orderId ;
    //小图
    private String productIcon ;
    private String productId ;
    //商品名称
    private String productName ;
    //当前价格,单位分
    private BigDecimal productPrice ;
    //创建时间
    private Date createTime ;
    //修改时间
    private Date updateTime ;
}
