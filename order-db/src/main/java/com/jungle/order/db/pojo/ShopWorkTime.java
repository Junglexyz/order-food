package com.jungle.order.db.pojo;

import java.util.Date;

public class ShopWorkTime {
    private Integer workTimeId;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Date updateTime;

    public ShopWorkTime(Integer workTimeId, Date startTime, Date endTime, Date createTime, Date updateTime) {
        this.workTimeId = workTimeId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ShopWorkTime() {
        super();
    }

    public Integer getWorkTimeId() {
        return workTimeId;
    }

    public void setWorkTimeId(Integer workTimeId) {
        this.workTimeId = workTimeId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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