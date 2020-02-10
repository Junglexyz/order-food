package com.jungle.order.db.pojo;

public class OrdersKey {
    private Integer shopId;

    private Integer orderId;

    public OrdersKey(Integer shopId, Integer orderId) {
        this.shopId = shopId;
        this.orderId = orderId;
    }

    public OrdersKey() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}