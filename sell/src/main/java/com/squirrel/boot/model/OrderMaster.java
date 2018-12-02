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

@Table(name = "order_master")
@Entity
@Data
@DynamicUpdate
public class OrderMaster {


    @Id
    private String orderId ;
    //订单状态, 默认为新下单
    private Integer orderStatus ;
    //支付状态, 默认未支付
    private Integer payStatus ;
    //买家地址
    private String buyerAddress ;
    //买家名字
    private String buyerName ;
    //买家微信openid
    private String buyerOpenid ;
    //买家电话
    private String buyerPhone ;
    //订单总金额
    private BigDecimal orderAmount ;
    //创建时间
    private Date createTime ;
    //修改时间
    private Date updateTime ;
}
