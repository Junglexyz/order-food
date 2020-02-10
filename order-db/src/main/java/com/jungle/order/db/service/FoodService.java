package com.jungle.order.db.service;

import com.jungle.order.db.dao.FoodMapper;
import com.jungle.order.db.pojo.Food;
import com.jungle.order.db.pojo.FoodKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 商品Service层
 * @author: jungle
 * @create: 2020-02-08 09:14
 */
@Service
public class FoodService {
    @Resource
    private FoodMapper foodMapper;

    public int createFood(Food food){
        return foodMapper.insert(food);
    }

    public List<Food> listGoods(Integer shopId){
        return  foodMapper.selectByShopId(shopId);
    }

}
