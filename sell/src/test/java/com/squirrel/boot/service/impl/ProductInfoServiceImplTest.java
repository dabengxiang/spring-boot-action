package com.squirrel.boot.service.impl;

import com.squirrel.boot.model.ProductInfo;
import com.squirrel.boot.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void list() {
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setCategoryType(1);
        productInfo.setProductName("炒面");
        productInfo.setProductPrice(new BigDecimal("3"));
        productInfo.setProductIcon("http://xxxxxx.com");
        productInfo.setProductStatus(1);
        productInfo.setProductStock(100);
        productInfoService.save(productInfo);
    }

    @Test
    public void listDto() {
        List<ProductInfo> list = productInfoService.list();
        log.info(list.toString());

    }
}