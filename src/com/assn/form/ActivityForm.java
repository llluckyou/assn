package com.assn.form;

import com.sun.istack.internal.NotNull;


/**
 * Created by Administrator on 2017/4/11.
 * 活动申请表单
 */

public class ActivityForm {
    String activityName;       //活动名称
    String activitySpace;      //活动地点
    String activityStartDate;  //活动开始日期
    String activityEndDate;    //活动截止日期
    String partyName;          //申办社团
    String activityContent;    //活动内容描述

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

    public String getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(String activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    public String getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(String activityEndDate) {
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
