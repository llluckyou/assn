package com.assn.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_school", schema = "assn", catalog = "")
public class AssnSchoolEntity {
    private long id;
    private String schoolId;
    private String schoolName;
    private String schoolType;
    private String schoolLocationId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "school_id", nullable = false, length = 10)
    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "school_name", nullable = false, length = 20)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "school_type", nullable = false, length = 1)
    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    @Basic
    @Column(name = "school_location_id", nullable = false, length = 12)
    public String getSchoolLocationId() {
        return schoolLocationId;
    }

    public void setSchoolLocationId(String schoolLocationId) {
        this.schoolLocationId = schoolLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnSchoolEntity that = (AssnSchoolEntity) o;

        if (id != that.id) return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (schoolType != null ? !schoolType.equals(that.schoolType) : that.schoolType != null) return false;
        if (schoolLocationId != null ? !schoolLocationId.equals(that.schoolLocationId) : that.schoolLocationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (schoolType != null ? schoolType.hashCode() : 0);
        result = 31 * result + (schoolLocationId != null ? schoolLocationId.hashCode() : 0);
        return result;
    }
}
