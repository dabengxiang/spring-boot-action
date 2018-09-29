package com.squirrel.boot.dao;

import com.squirrel.boot.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * project name : action-in-boot
 * Date:2018/9/29
 * Author: yc.guo
 * DESC:
 */

public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> ids);


}
