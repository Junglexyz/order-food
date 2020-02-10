package com.jungle.order.db.dao;

import com.jungle.order.db.pojo.ShopInfo;

public interface ShopInfoMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    ShopInfo selectByPrimaryKey(Integer shopId);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);
}