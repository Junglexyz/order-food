package com.jungle.order.db.pojo;

public class FoodKey {
    private Integer shopId;

    private Integer foodId;

    public FoodKey(Integer shopId, Integer foodId) {
        this.shopId = shopId;
        this.foodId = foodId;
    }

    public FoodKey() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
}