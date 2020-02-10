package com.jungle.order.db.dao;

import com.jungle.order.db.pojo.Food;
import com.jungle.order.db.pojo.FoodKey;

import java.util.List;

public interface FoodMapper {
    int deleteByPrimaryKey(FoodKey key);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(FoodKey key);

    List<Food> selectByShopId(Integer shopId);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}