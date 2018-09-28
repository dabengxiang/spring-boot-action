package com.squirrel.boot.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Table;

/**
 * project name : action-in-boot
 * Date:2018/9/29
 * Author: yc.guo
 * DESC:
 */
@Table(name = "product_category")
@Data
@DynamicUpdate(true)
public class ProductCategory {
    private String category_id; //int(11) NOT NULL AUTO_INCREMENT,
    private String category_name; //varchar(64) NOT NULL COMMENT '类目名字',
    private String category_type; //int(11) NOT NULL COMMENT '类目编号',
    private String create_time; //timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    private String update_time; //timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    
}
