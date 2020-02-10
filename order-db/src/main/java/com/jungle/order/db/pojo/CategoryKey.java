package com.jungle.order.db.pojo;

public class CategoryKey {
    private Integer shopId;

    private Integer categoryId;

    public CategoryKey(Integer shopId, Integer categoryId) {
        this.shopId = shopId;
        this.categoryId = categoryId;
    }

    public CategoryKey() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}