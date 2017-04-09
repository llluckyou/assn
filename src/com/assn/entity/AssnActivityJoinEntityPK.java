package com.assn.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/6.
 */
public class AssnActivityJoinEntityPK implements Serializable {
    private long userId;
    private long activityId;

    public AssnActivityJoinEntityPK(){}
    public AssnActivityJoinEntityPK(int i, int i1) {
        this.userId = i;
        this.activityId = i1;
    }

    @Column(name = "user_id", nullable = false)
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "activity_id", nullable = false)
    @Id
    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnActivityJoinEntityPK that = (AssnActivityJoinEntityPK) o;

        if (userId != that.userId) return false;
        if (activityId != that.activityId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (activityId ^ (activityId >>> 32));
        return result;
    }
}
