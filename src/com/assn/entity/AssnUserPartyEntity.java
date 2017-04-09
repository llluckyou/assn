package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_user_party", schema = "assn", catalog = "")
public class AssnUserPartyEntity {
    private long id;
    private long partyId;
    private long userId;
    private String joinFlag;
    private Timestamp joinTime;
    private Timestamp leaveTime;
    private long positionId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "party_id", nullable = false)
    public long getPartyId() {
        return partyId;
    }

    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "join_flag", nullable = false, length = 1)
    public String getJoinFlag() {
        return joinFlag;
    }

    public void setJoinFlag(String joinFlag) {
        this.joinFlag = joinFlag;
    }

    @Basic
    @Column(name = "join_time", nullable = false)
    public Timestamp getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Timestamp joinTime) {
        this.joinTime = joinTime;
    }

    @Basic
    @Column(name = "leave_time", nullable = false)
    public Timestamp getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Timestamp leaveTime) {
        this.leaveTime = leaveTime;
    }

    @Basic
    @Column(name = "position_id", nullable = false)
    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnUserPartyEntity that = (AssnUserPartyEntity) o;

        if (id != that.id) return false;
        if (partyId != that.partyId) return false;
        if (userId != that.userId) return false;
        if (positionId != that.positionId) return false;
        if (joinFlag != null ? !joinFlag.equals(that.joinFlag) : that.joinFlag != null) return false;
        if (joinTime != null ? !joinTime.equals(that.joinTime) : that.joinTime != null) return false;
        if (leaveTime != null ? !leaveTime.equals(that.leaveTime) : that.leaveTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (partyId ^ (partyId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (joinFlag != null ? joinFlag.hashCode() : 0);
        result = 31 * result + (joinTime != null ? joinTime.hashCode() : 0);
        result = 31 * result + (leaveTime != null ? leaveTime.hashCode() : 0);
        result = 31 * result + (int) (positionId ^ (positionId >>> 32));
        return result;
    }
}
