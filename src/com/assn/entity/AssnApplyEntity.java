package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_apply", schema = "assn", catalog = "")
public class AssnApplyEntity {
    private long applyId;
    private long applyPartyId;
    private long applyUserId;
    private String applyResume;
    private Timestamp applyDate;
    private String applyPass;

    @Id
    @Column(name = "apply_id", nullable = false)
    public long getApplyId() {
        return applyId;
    }

    public void setApplyId(long applyId) {
        this.applyId = applyId;
    }

    @Basic
    @Column(name = "apply_party_id", nullable = false)
    public long getApplyPartyId() {
        return applyPartyId;
    }

    public void setApplyPartyId(long applyPartyId) {
        this.applyPartyId = applyPartyId;
    }

    @Basic
    @Column(name = "apply_user_id", nullable = false)
    public long getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(long applyUserId) {
        this.applyUserId = applyUserId;
    }

    @Basic
    @Column(name = "apply_resume", nullable = false, length = 30)
    public String getApplyResume() {
        return applyResume;
    }

    public void setApplyResume(String applyResume) {
        this.applyResume = applyResume;
    }

    @Basic
    @Column(name = "apply_date", nullable = false)
    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "apply_pass", nullable = false, length = 1)
    public String getApplyPass() {
        return applyPass;
    }

    public void setApplyPass(String applyPass) {
        this.applyPass = applyPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnApplyEntity that = (AssnApplyEntity) o;

        if (applyId != that.applyId) return false;
        if (applyPartyId != that.applyPartyId) return false;
        if (applyUserId != that.applyUserId) return false;
        if (applyResume != null ? !applyResume.equals(that.applyResume) : that.applyResume != null) return false;
        if (applyDate != null ? !applyDate.equals(that.applyDate) : that.applyDate != null) return false;
        if (applyPass != null ? !applyPass.equals(that.applyPass) : that.applyPass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (applyId ^ (applyId >>> 32));
        result = 31 * result + (int) (applyPartyId ^ (applyPartyId >>> 32));
        result = 31 * result + (int) (applyUserId ^ (applyUserId >>> 32));
        result = 31 * result + (applyResume != null ? applyResume.hashCode() : 0);
        result = 31 * result + (applyDate != null ? applyDate.hashCode() : 0);
        result = 31 * result + (applyPass != null ? applyPass.hashCode() : 0);
        return result;
    }
}
