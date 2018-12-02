package com.squirrel.boot.service.impl;

import com.squirrel.boot.dao.ProductCategoryDao;
import com.squirrel.boot.dao.ProductInfoDao;
import com.squirrel.boot.dto.ProductDto;
import com.squirrel.boot.dto.ProductInfoDto;
import com.squirrel.boot.model.ProductCategory;
import com.squirrel.boot.model.ProductInfo;
import com.squirrel.boot.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */

@Service
@Transactional
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Autowired
    private ProductCategoryDao  productCategoryDao;

    @Override
    public List<ProductInfo> list() {
        return productInfoDao.findAll();
    }

    @Override
    public List<ProductDto> listDto() {
        List<ProductInfo> productInfos = productInfoDao.findByProductStatus(0);
        List<Integer> typeIdsList = productInfos.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());

        List<ProductCategory> ProductCategoryList = productCategoryDao.findByCategoryTypeIn(typeIdsList);

        List<ProductDto>  bigList = new ArrayList();


        for (ProductCategory productCategory : ProductCategoryList) {

            ProductDto productDto = new ProductDto();
            List<ProductInfoDto> smallList = new ArrayList<>();
            BeanUtils.copyProperties(productCategory,productDto);
            for (ProductInfo info : productInfos) {
                if(info.getCategoryType().equals(productCategory.getCategoryId())){
                    ProductInfoDto productInfoDto = new ProductInfoDto();
                    BeanUtils.copyProperties(info,productInfoDto);
                    smallList.add(productInfoDto);
                }
            }
            productDto.setFoods(smallList);
            bigList.add(productDto);

        }


        return bigList;
    }

    @Override
    public void save(ProductInfo productInfo) {
        productInfoDao.save(productInfo);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(0);
    }


}
