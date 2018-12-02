package com.squirrel.boot.dao;

import com.squirrel.boot.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
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


    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryDao.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("男生最爱2323", 4);
        ProductCategory result = productCategoryDao.save(productCategory);
//        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void updateTest() {
//        ProductCategory productCategory = repository.findOne(4);
//        productCategory.setCategoryName("男生最爱1");
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = productCategoryDao.save(productCategory);
        Assert.assertEquals(productCategory, result);
    }


}