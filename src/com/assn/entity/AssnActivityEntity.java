package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_activity", schema = "assn", catalog = "")
public class AssnActivityEntity {
    public static final short CANNEL = -1;      //取消
    public static final short CHECKING = 0;     //审核中
    public static final short PASSED = 1;       //通过
    public static final short NOTPASSED = 2;    //未通过
    public static final short ONGOING = 3;      //进行中
    public static final short ENDED = 4;        //已结束

    private long activityId;
    private long activityPartyId;
    private long activityUserId;
    private String activityName;
    private Timestamp activityApplyTime;
    private String activityContent;
    private String activitySpace;
    private int activityPraise;
    private Timestamp activityStartDate;
    private Timestamp activityEndDate;
    private short activityStatus;
    private int activityScore;

    @Id
    @Column(name = "activity_id", nullable = false)
    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    @Basic
    @Column(name = "activity_party_id", nullable = false)
    public long getActivityPartyId() {
        return activityPartyId;
    }

    public void setActivityPartyId(long activityPartyId) {
        this.activityPartyId = activityPartyId;
    }

    @Basic
    @Column(name = "activity_user_id", nullable = false)
    public long getActivityUserId() {
        return activityUserId;
    }

    public void setActivityUserId(long activityUserId) {
        this.activityUserId = activityUserId;
    }

    @Basic
    @Column(name = "activity_name", nullable = false, length = 20)
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Basic
    @Column(name = "activity_apply_time", nullable = false)
    public Timestamp getActivityApplyTime() {
        return activityApplyTime;
    }

    public void setActivityApplyTime(Timestamp activityApplyTime) {
        this.activityApplyTime = activityApplyTime;
    }

    @Basic
    @Column(name = "activity_content", nullable = false, length = 300)
    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    @Basic
    @Column(name = "activity_space", nullable = false, length = 20)
    public String getActivitySpace() {
        return activitySpace;
    }

    public void setActivitySpace(String activitySpace) {
        this.activitySpace = activitySpace;
    }

    @Basic
    @Column(name = "activity_praise", nullable = false)
    public int getActivityPraise() {
        return activityPraise;
    }

    public void setActivityPraise(int activityPraise) {
        this.activityPraise = activityPraise;
    }

    @Basic
    @Column(name = "activity_start_date", nullable = false)
    public Timestamp getActivityStartDate() {
        return activityStartDate;
    }

    public void setActivityStartDate(Timestamp activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    @Basic
    @Column(name = "activity_end_date", nullable = false)
    public Timestamp getActivityEndDate() {
        return activityEndDate;
    }

    public void setActivityEndDate(Timestamp activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    @Basic
    @Column(name = "activity_status", nullable = false)
    public short getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(short activityStatus) {
        this.activityStatus = activityStatus;
    }

    @Basic
    @Column(name = "activity_score", nullable = false)
    public int getActivityScore() {
        return activityScore;
    }

    public void setActivityScore(int activityScore) {
        this.activityScore = activityScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnActivityEntity that = (AssnActivityEntity) o;

        if (activityId != that.activityId) return false;
        if (activityPartyId != that.activityPartyId) return false;
        if (activityUserId != that.activityUserId) return false;
        if (activityPraise != that.activityPraise) return false;
        if (activityStatus != that.activityStatus) return false;
        if (activityScore != that.activityScore) return false;
        if (activityName != null ? !activityName.equals(that.activityName) : that.activityName != null) return false;
        if (activityApplyTime != null ? !activityApplyTime.equals(that.activityApplyTime) : that.activityApplyTime != null)
            return false;
        if (activityContent != null ? !activityContent.equals(that.activityContent) : that.activityContent != null)
            return false;
        if (activitySpace != null ? !activitySpace.equals(that.activitySpace) : that.activitySpace != null)
            return false;
        if (activityStartDate != null ? !activityStartDate.equals(that.activityStartDate) : that.activityStartDate != null)
            return false;
        if (activityEndDate != null ? !activityEndDate.equals(that.activityEndDate) : that.activityEndDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (activityId ^ (activityId >>> 32));
        result = 31 * result + (int) (activityPartyId ^ (activityPartyId >>> 32));
        result = 31 * result + (int) (activityUserId ^ (activityUserId >>> 32));
        result = 31 * result + (activityName != null ? activityName.hashCode() : 0);
        result = 31 * result + (activityApplyTime != null ? activityApplyTime.hashCode() : 0);
        result = 31 * result + (activityContent != null ? activityContent.hashCode() : 0);
        result = 31 * result + (activitySpace != null ? activitySpace.hashCode() : 0);
        result = 31 * result + activityPraise;
        result = 31 * result + (activityStartDate != null ? activityStartDate.hashCode() : 0);
        result = 31 * result + (activityEndDate != null ? activityEndDate.hashCode() : 0);
        result = 31 * result + (int) activityStatus;
        result = 31 * result + activityScore;
        return result;
    }
}
