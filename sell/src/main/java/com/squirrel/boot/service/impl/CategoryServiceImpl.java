package com.squirrel.boot.service.impl;

import com.squirrel.boot.dao.ProductCategoryDao;
import com.squirrel.boot.model.ProductCategory;
import com.squirrel.boot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Date:2018/12/2
 * Author:gyc
 * Desc:
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> findAll(){
        return productCategoryDao.findAll();

    } ;

    @Override
    public ProductCategory findOne(Integer categoryId){
       return  productCategoryDao.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }


}
