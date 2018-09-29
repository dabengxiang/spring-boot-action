package com.squirrel.boot.service;

import com.squirrel.boot.dto.ProductDto;
import com.squirrel.boot.model.ProductInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */

public interface ProductInfoService {

    public List<ProductInfo> list();


    public List<ProductDto> listDto();


    public void save(ProductInfo productInfo);
}
