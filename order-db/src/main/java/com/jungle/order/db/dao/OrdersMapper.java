package com.jungle.order.db.dao;

import com.jungle.order.db.pojo.Orders;
import com.jungle.order.db.pojo.OrdersKey;

public interface OrdersMapper {
    int deleteByPrimaryKey(OrdersKey key);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(OrdersKey key);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}