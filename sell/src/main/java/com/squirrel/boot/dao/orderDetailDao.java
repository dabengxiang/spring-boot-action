package com.squirrel.boot.dao;

import com.squirrel.boot.model.OrderDetail;

import java.util.List;

/**
 * Date:2018/10/1
 * Author:gyc
 * Desc:
 */
public interface orderDetailDao {

    List<OrderDetail> findByOrderIdIn(List<String> orderIdList);

    OrderDetail findByOrderId(String orderId);
}
