package com.squirrel.boot.dto;

import lombok.Data;

/**
 * Date:2018/9/29
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@Data
public class ResultDto<T> {
    private String msg;
    private  String code;
    private T data;
}
