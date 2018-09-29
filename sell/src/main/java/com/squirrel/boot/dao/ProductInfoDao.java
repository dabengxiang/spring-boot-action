package com.squirrel.boot.dao;

import com.squirrel.boot.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {

    public List<ProductInfo> findByProductStatus(Integer status);



}
