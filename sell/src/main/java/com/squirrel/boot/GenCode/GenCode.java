package com.squirrel.boot.GenCode;

import org.beetl.sql.core.SQLManager;

public class GenCode {

    public static void main(String[] args) throws Exception {
        SQLManager sqlManager = new SQLManagerTemplate().sqlManager("jdbc:mysql://localhost:3306/boot-sell?useUnicode=true&characterEncoding=UTF8&serverTimezone=Asia/Shanghai&useSSL=false", "root", "root");
        sqlManager.genPojoCodeToConsole("product_info");
        sqlManager.genSQLTemplateToConsole("product_info");
    }
}
