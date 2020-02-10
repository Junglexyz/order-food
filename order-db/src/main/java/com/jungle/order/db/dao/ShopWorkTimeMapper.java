package com.jungle.order.db.dao;

import com.jungle.order.db.pojo.ShopWorkTime;

public interface ShopWorkTimeMapper {
    int insert(ShopWorkTime record);

    int insertSelective(ShopWorkTime record);
}