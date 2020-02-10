package com.jungle.order.db.dao;

import com.jungle.order.db.pojo.Category;
import com.jungle.order.db.pojo.CategoryKey;

public interface CategoryMapper {
    int deleteByPrimaryKey(CategoryKey key);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(CategoryKey key);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}