package com.squirrel.boot.service;

import com.squirrel.boot.model.ProductCategory;

import java.util.List;

/**
 * Date:2018/12/2
 * Author:gyc
 * Desc:
 */
public interface CategoryService {
    public List<ProductCategory> findAll() ;

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
