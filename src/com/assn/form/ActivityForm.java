package com.assn.form;


import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/11.
 * 活动申请表单
 */

public class ActivityForm {
    @NotNull
    Long userId;             //用户Id

    @NotNull
    @Size(max = 20)
    String activityName;       //活动名称

    @NotNull
    String activitySpace;      //活动地点

    @NotNull
    @Future
    Date activityStartDate;  //活动开始日期
    @NotNull
    @Future
    Date activityEndDate;    //活动截止日期

    @NotNull
    String partyName;          //申办社团

    @NotNull
    String activityContent;    //活动内容描述

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivitySpace() {
        return activitySpace;
    }

    public void setActivitySpace(String activitySpace) {
        this.activitySpace = activitySpace;
    }

    public Date getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(Date activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public Date getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(Date activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    @Override
    public String toString() {
        return "ActivityForm{" +
                "activityName='" + activityName + '\'' +
                ", activitySpace='" + activitySpace + '\'' +
                ", activityStartDate='" + activityStartDate + '\'' +
                ", activityEndDate='" + activityEndDate + '\'' +
                ", partyName='" + partyName + '\'' +
                ", activityContent='" + activityContent + '\'' +
                '}';
    }


}
