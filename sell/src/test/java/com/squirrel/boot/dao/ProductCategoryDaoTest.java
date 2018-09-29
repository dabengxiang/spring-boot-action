package com.squirrel.boot.dao;

import com.squirrel.boot.model.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {


    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void list(){
        List<ProductCategory> all = productCategoryDao.findAll();
        System.out.println(all);
    }

    @Test
    public void save(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("被子");
        productCategory.setCategoryType(1);
        productCategoryDao.save(productCategory);


    }


}