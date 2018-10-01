package com.squirrel.boot.controller;

import com.squirrel.boot.dto.ProductDto;
import com.squirrel.boot.dto.ResultDto;
import com.squirrel.boot.exception.GobalException;
import com.squirrel.boot.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date:2018/9/30
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @RequestMapping("/isSell/all")
    public ResultDto<List> findAllIsSell(){
        try {
            List<ProductDto> productDtos = productInfoService.listDto();
            return ResultDto.success(productDtos);

        } catch (Exception e) {
            return handleException(e,"获取上架的商品失败");

        }

    }



    private  ResultDto handleException(Exception e,String msg){
        log.error(this.getClass().toString(),e);
        if(e instanceof GobalException)
            return ResultDto.failure(e.getMessage());
        else
            return ResultDto.failure(msg);
    }


}

