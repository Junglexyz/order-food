package com.jungle.order.db.pojo;

import java.util.Date;

public class Category extends CategoryKey {
    private String categoryName;

    private Date createTime;

    private Date updateTime;

    private Boolean deleted;

    public Category(Integer shopId, Integer categoryId, String categoryName, Date createTime, Date updateTime, Boolean deleted) {
        super(shopId, categoryId);
        this.categoryName = categoryName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
    }

    public Category() {
        super();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}