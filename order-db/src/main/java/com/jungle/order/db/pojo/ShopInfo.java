package com.jungle.order.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ShopInfo {
    private Integer shopId;

    private Integer shopTele;

    private String shopName;

    private String iconUrl;

    private String scanCodeUrl;

    private BigDecimal shopSocre;

    private String address;

    private String addressDetail;

    private Integer workTimeId;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    public ShopInfo(Integer shopId, Integer shopTele, String shopName, String iconUrl, String scanCodeUrl, BigDecimal shopSocre, String address, String addressDetail, Integer workTimeId, Boolean status, Date createTime, Date updateTime) {
        this.shopId = shopId;
        this.shopTele = shopTele;
        this.shopName = shopName;
        this.iconUrl = iconUrl;
        this.scanCodeUrl = scanCodeUrl;
        this.shopSocre = shopSocre;
        this.address = address;
        this.addressDetail = addressDetail;
        this.workTimeId = workTimeId;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ShopInfo() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getShopTele() {
        return shopTele;
    }

    public void setShopTele(Integer shopTele) {
        this.shopTele = shopTele;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public String getScanCodeUrl() {
        return scanCodeUrl;
    }

    public void setScanCodeUrl(String scanCodeUrl) {
        this.scanCodeUrl = scanCodeUrl == null ? null : scanCodeUrl.trim();
    }

    public BigDecimal getShopSocre() {
        return shopSocre;
    }

    public void setShopSocre(BigDecimal shopSocre) {
        this.shopSocre = shopSocre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public Integer getWorkTimeId() {
        return workTimeId;
    }

    public void setWorkTimeId(Integer workTimeId) {
        this.workTimeId = workTimeId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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