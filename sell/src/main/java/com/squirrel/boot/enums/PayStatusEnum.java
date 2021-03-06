package com.squirrel.boot.enums;

/**
 * Date:2018/10/1
 * Author:gyc
 * Desc:
 */
public enum  PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

            ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
