package com.jungle.order.db.pojo;

import java.util.Date;

public class Admin {
    private Long adminId;

    private Integer shopId;

    private String adminName;

    private String password;

    private String idCard;

    private Integer roleId;

    private Date createTime;

    private Date updateTime;

    private Byte deleted;

    public Admin(Long adminId, Integer shopId, String adminName, String password, String idCard, Integer roleId, Date createTime, Date updateTime, Byte deleted) {
        this.adminId = adminId;
        this.shopId = shopId;
        this.adminName = adminName;
        this.password = password;
        this.idCard = idCard;
        this.roleId = roleId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
    }

    public Admin() {
        super();
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}