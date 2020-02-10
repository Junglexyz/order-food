package com.jungle.order.db.pojo;

import java.math.BigDecimal;

public class OrderDetail {
    private Integer orderId;

    private BigDecimal price;

    private Integer amount;

    private Integer foodId;

    private String foodName;

    public OrderDetail(Integer orderId, BigDecimal price, Integer amount, Integer foodId, String foodName) {
        this.orderId = orderId;
        this.price = price;
        this.amount = amount;
        this.foodId = foodId;
        this.foodName = foodName;
    }

    public OrderDetail() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }
}