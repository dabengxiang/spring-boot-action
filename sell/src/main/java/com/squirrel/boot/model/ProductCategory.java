package com.squirrel.boot.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * project name : action-in-boot
 * Date:2018/9/29
 * Author: yc.guo
 * DESC:
 */
@Table(name = "product_category")
@Entity
@Data
@DynamicUpdate(true)
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId; //int(11) NOT NULL AUTO_INCREMENT,
    private String categoryName; //varchar(64) NOT NULL COMMENT '类目名字',
    private Integer categoryType; //int(11) NOT NULL COMMENT '类目编号',
//    private String createTime; //timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
//    private String updateTime; //timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    
}
