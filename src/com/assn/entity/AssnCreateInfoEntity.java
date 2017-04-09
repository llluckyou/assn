package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_create_info", schema = "assn", catalog = "")
public class AssnCreateInfoEntity {
    private long id;
    private long userId;
    private int assnName;
    private String assnCategoryId;
    private int assnProperty;
    private long schoolId;
    private int userCellphone;
    private int status;
    private String verification;
    private long managerId;
    private Timestamp createDate;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "assn_name", nullable = false)
    public int getAssnName() {
        return assnName;
    }

    public void setAssnName(int assnName) {
        this.assnName = assnName;
    }

    @Basic
    @Column(name = "assn_category_id", nullable = false, length = 20)
    public String getAssnCategoryId() {
        return assnCategoryId;
    }

    public void setAssnCategoryId(String assnCategoryId) {
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

    @Basic
    @Column(name = "school_id", nullable = false)
    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "user_cellphone", nullable = false)
    public int getUserCellphone() {
        return userCellphone;
    }

    public void setUserCellphone(int userCellphone) {
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

    @Basic
    @Column(name = "manager_id", nullable = false)
    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
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
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + assnName;
        result = 31 * result + (assnCategoryId != null ? assnCategoryId.hashCode() : 0);
        result = 31 * result + assnProperty;
        result = 31 * result + (int) (schoolId ^ (schoolId >>> 32));
        result = 31 * result + userCellphone;
        result = 31 * result + status;
        result = 31 * result + (verification != null ? verification.hashCode() : 0);
        result = 31 * result + (int) (managerId ^ (managerId >>> 32));
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
