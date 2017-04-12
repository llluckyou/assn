package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_create_info", schema = "assn")
public class AssnCreateInfoEntity {
    private long id;
    private AssnUserEntity userId;
    private String assnName;
    private AssnCategoryEntity assnCategoryId;
    private int assnProperty;
    private AssnSchoolEntity schoolId;
    private String userCellphone;
    private int status;
    private String verification;
    private AssnWebManagerEntity managerId;
    private Timestamp createDate;
    private String assnResume;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public AssnUserEntity getUserId() {
        return userId;
    }

    public void setUserId(AssnUserEntity userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "assn_name", nullable = false)
    public String getAssnName() {
        return assnName;
    }

    public void setAssnName(String assnName) {
        this.assnName = assnName;
    }

    @ManyToOne
    @JoinColumn(name = "assn_category_id", nullable = false)
    public AssnCategoryEntity getAssnCategoryId() {
        return assnCategoryId;
    }

    public void setAssnCategoryId(AssnCategoryEntity assnCategoryId) {
        this.assnCategoryId = assnCategoryId;
    }

    @Basic
    @Column(name = "assn_property", nullable = false)
    public int getAssnProperty() {
        return assnProperty;
    }

    public void setAssnProperty(int assnProperty) {
        this.assnProperty = assnProperty;
    }

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    public AssnSchoolEntity getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(AssnSchoolEntity schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "user_cellphone", nullable = false)
    public String getUserCellphone() {
        return userCellphone;
    }

    public void setUserCellphone(String userCellphone) {
        this.userCellphone = userCellphone;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "verification", nullable = false, length = 200)
    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    @ManyToOne
    @JoinColumn(name = "manager_id")
    public AssnWebManagerEntity getManagerId() {
        return managerId;
    }

    public void setManagerId(AssnWebManagerEntity managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "create_date", nullable = false)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "assn_resume")
    public String getAssnResume() {
        return assnResume;
    }

    public void setAssnResume(String assnResume) {
        this.assnResume = assnResume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnCreateInfoEntity that = (AssnCreateInfoEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (assnName != that.assnName) return false;
        if (assnProperty != that.assnProperty) return false;
        if (schoolId != that.schoolId) return false;
        if (userCellphone != that.userCellphone) return false;
        if (status != that.status) return false;
        if (managerId != that.managerId) return false;
        if (assnCategoryId != null ? !assnCategoryId.equals(that.assnCategoryId) : that.assnCategoryId != null)
            return false;
        if (verification != null ? !verification.equals(that.verification) : that.verification != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (assnName != null ? assnName.hashCode() : 0);
        result = 31 * result + (assnCategoryId != null ? assnCategoryId.hashCode() : 0);
        result = 31 * result + assnProperty;
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + (userCellphone != null ? userCellphone.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (verification != null ? verification.hashCode() : 0);
        result = 31 * result + (managerId != null ? managerId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }


}
