package com.jungle.order.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders extends OrdersKey {
    private Integer userId;

    private BigDecimal totalFee;

    private BigDecimal packageFee;

    private BigDecimal foodFee;

    private Byte status;

    private Byte eatWay;

    private Integer pickUpCode;

    private String templateId;

    private Date createTime;

    private Date updateTime;

    public Orders(Integer shopId, Integer orderId, Integer userId, BigDecimal totalFee, BigDecimal packageFee, BigDecimal foodFee, Byte status, Byte eatWay, Integer pickUpCode, String templateId, Date createTime, Date updateTime) {
        super(shopId, orderId);
        this.userId = userId;
        this.totalFee = totalFee;
        this.packageFee = packageFee;
        this.foodFee = foodFee;
        this.status = status;
        this.eatWay = eatWay;
        this.pickUpCode = pickUpCode;
        this.templateId = templateId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Orders() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getPackageFee() {
        return packageFee;
    }

    public void setPackageFee(BigDecimal packageFee) {
        this.packageFee = packageFee;
    }

    public BigDecimal getFoodFee() {
        return foodFee;
    }

    public void setFoodFee(BigDecimal foodFee) {
        this.foodFee = foodFee;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getEatWay() {
        return eatWay;
    }

    public void setEatWay(Byte eatWay) {
        this.eatWay = eatWay;
    }

    public Integer getPickUpCode() {
        return pickUpCode;
    }

    public void setPickUpCode(Integer pickUpCode) {
        this.pickUpCode = pickUpCode;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}